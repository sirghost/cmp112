package br.ufrgs.inf.lattesParser.common;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import br.ufrgs.inf.lattesParser.areCon.AreasDoConhecimento;

public class DocumentoProducao {

	private String sequenciaProducao;
	private ArrayList<Autor> autores;
	private PalavrasChave palavrasChave;
	private AreasDoConhecimento areasDoConhecimento;
	private SetoresDeAtividade setoresAtividade;
	private InformacoesAdicionais informacoesAdicionais;

	@XmlAttribute(name="SEQUENCIA-PRODUCAO")
	public String getSequenciaProducao() {
		return sequenciaProducao;
	}
	public void setSequenciaProducao(String sequenciaProducao) {
		this.sequenciaProducao = sequenciaProducao;
	}		
	
	@XmlElement(name = "AUTORES")
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}
	
	@XmlElement(name = "PALAVRAS-CHAVE")	
	public PalavrasChave getPalavrasChave() {
		return palavrasChave;
	}
	public void setPalavrasChave(PalavrasChave palavrasChave) {
		this.palavrasChave = palavrasChave;
	}
	
	@XmlElement(name = "AREAS-DO-CONHECIMENTO")
	public AreasDoConhecimento getAreasDoConhecimento() {
		return areasDoConhecimento;
	}
	public void setAreasDoConhecimento(AreasDoConhecimento areasDoConhecimento) {
		this.areasDoConhecimento = areasDoConhecimento;
	}
	
	@XmlElement(name = "SETORES-DE-ATIVIDADE")
	public SetoresDeAtividade getSetoresAtividade() {
		return setoresAtividade;
	}
	public void setSetoresAtividade(SetoresDeAtividade setoresAtividade) {
		this.setoresAtividade = setoresAtividade;
	}
	
	@XmlElement(name = "INFORMACOES-ADICIONAIS")
	public InformacoesAdicionais getInformacoesAdicionais() {
		return informacoesAdicionais;
	}
	public void setInformacoesAdicionais(InformacoesAdicionais informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}	
}