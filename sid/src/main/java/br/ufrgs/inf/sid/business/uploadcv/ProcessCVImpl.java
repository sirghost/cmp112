package br.ufrgs.inf.sid.business.uploadcv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufrgs.inf.lattesParser.CurriculoVitae;
import br.ufrgs.inf.lattesParser.dadCom.Outros;
import br.ufrgs.inf.lattesParser.dadGer.areAtu.AreaDeAtuacao;
import br.ufrgs.inf.lattesParser.dadGer.forAcaTit.Doutorado;
import br.ufrgs.inf.lattesParser.dadGer.forAcaTit.Mestrado;
import br.ufrgs.inf.lattesParser.proBib.artPub.ArtigoPublicado;
import br.ufrgs.inf.sid.business.populate.Populate;
import br.ufrgs.inf.sid.business.util.Message;
import br.ufrgs.inf.sid.business.util.MessageType;
import br.ufrgs.inf.sid.business.util.ResultType;
import br.ufrgs.inf.sid.business.util.SidUtil;
import br.ufrgs.inf.sid.solr.ManagementSolr;
import br.ufrgs.inf.sid.solr.SidSolr;

@Service("processCV")
public class ProcessCVImpl implements ProcessCV {
	
	@Autowired private ManagementSolr managementSolr;
	@Autowired private Populate populate;

	public Message loadFile(CvFile cvFile) {
		Message msg = new Message();
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(CurriculoVitae.class);
	        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	        CurriculoVitae cv = (CurriculoVitae) jaxbUnmarshaller.unmarshal(cvFile.getCvFile().getInputStream());
//System.out.println(cv);
	        List<ResultDTO> cvData = getFormacaoAcademicaTitulacao(cv);
	        List<String> words = getWordsFromList(cvData); 
	        
	        List<SidSolr> solrData = managementSolr.getAreasPesquisa(new HashSet<String>(words));
	        
	        ViewDTO view = new ViewDTO(solrData, cvData);
//System.out.println("res: " + res.size());
	        msg.setType(MessageType.SUCCESS);
	        msg.setData(view);
	        
		} catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return msg;
	}
	
	private List<ResultDTO> getFormacaoAcademicaTitulacao(CurriculoVitae cv){
		List<ResultDTO> lista = new ArrayList<ResultDTO>();
		ResultDTO resultDTO = null;
		

		//Dados Gerais
        if(cv.getDadosGerais() != null){
        	//Formacao Academica
        	if(cv.getDadosGerais().getFormacaoAcademicaTitulacao() != null){
        		//Mestrado
        		Mestrado m = cv.getDadosGerais().getFormacaoAcademicaTitulacao().getMestrado();
        		if(m != null){
        			String titulo = m.getTituloDaDissertacaoTese();
        			//Integer anoInicio = convertInteger(m.getAnoDeInicio());
    				Integer anoConclusao = SidUtil.convertInteger(m.getAnoDeConclusao());
    				if(!SidUtil.isNullOrEmpty(titulo) && anoConclusao != null && SidUtil.isAValidDate(anoConclusao)){
    					resultDTO = new ResultDTO(ResultType.MESTRADO.getDescription(), titulo);
    					lista.add(resultDTO);
    				}
        		}
        		//Doutorado
        		Doutorado d = cv.getDadosGerais().getFormacaoAcademicaTitulacao().getDoutorado();
        		if(d != null){
        			String titulo = d.getTituloDaDissertacaoTese();
    				Integer anoConclusao = SidUtil.convertInteger(d.getAnoDeConclusao());
    				if(!SidUtil.isNullOrEmpty(titulo) && anoConclusao != null && SidUtil.isAValidDate(anoConclusao)){
    					resultDTO = new ResultDTO(ResultType.DOCTORADO.getDescription(), titulo);
    					lista.add(resultDTO);
    				}
        		}
        	}
        	
        	//Areas de Atuacao (sem ano)
        	if(cv.getDadosGerais().getAreasDeAtuacao() != null){
        		List<AreaDeAtuacao> as = cv.getDadosGerais().getAreasDeAtuacao().getAreasDeAtuacao();
        		for(AreaDeAtuacao a : as){
        			String nomeEspecialidade = a.getNomeDaEspecialidade();
        			if(!SidUtil.isNullOrEmpty(nomeEspecialidade)){
        				resultDTO = new ResultDTO(ResultType.AREAS_ATUACACO.getDescription(), nomeEspecialidade);
    					lista.add(resultDTO);
        			}
        		}
        	}
        }
        
        //Dados complementares
        if(cv.getDadosComplementares() != null){
        	//Formacao Complementar
        	if(cv.getDadosComplementares().getFormacaoComplementar() != null){
        		//Outros
        		List<Outros> outros = cv.getDadosComplementares().getFormacaoComplementar().getOutros();
        		if(outros != null && !outros.isEmpty()){
        			for(Outros o : outros){
        				String nomeCurso = o.getNomeCurso();
        				Integer anoConclusao = SidUtil.convertInteger(o.getAnoDeConclusao());
        				if(!SidUtil.isNullOrEmpty(nomeCurso) && anoConclusao != null && SidUtil.isAValidDate(anoConclusao)){
        					resultDTO = new ResultDTO(ResultType.FORMACAO_COMPLEMENTAR.getDescription(), nomeCurso);
        					lista.add(resultDTO);
        				}
        			}
        		}
        	}
        }
        
        //Producao Bibliografica
        if(cv.getProBibliografica() != null){
        	//Artigos publicados
        	if(cv.getProBibliografica().getArtigosPublicados() != null){
        		//Artigos publicados
        		List<ArtigoPublicado> aps = cv.getProBibliografica().getArtigosPublicados().getArtigosPublicados();
        		for(ArtigoPublicado ap : aps){
        			if(ap.getDadosBasicosArtigo() != null){
        				String titulo = ap.getDadosBasicosArtigo().getTituloDoArtigo();
        				Integer anoArtigo = SidUtil.convertInteger(ap.getDadosBasicosArtigo().getAnoDoArtigo());
        				if(!SidUtil.isNullOrEmpty(titulo) && anoArtigo != null && SidUtil.isAValidDate(anoArtigo)){
        					resultDTO = new ResultDTO(ResultType.ARTIGOS_PUBLICACOS.getDescription(), titulo);
        					lista.add(resultDTO);
        				}
        			}
        		}
        	}
        }
        return lista;
	}
	
	private List<String> getWordsFromList(List<ResultDTO> list){
		List<String> words = new ArrayList<String>();
		String[] tokens = null;
		for(ResultDTO r : list){
			tokens = r.getTexto().split(" ");
			words.addAll(Arrays.asList(tokens));
		}
		return words;
	}
}