package br.ufrgs.inf.lattesParser.dadGer;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.dadCom.DadosComplementares;
import br.ufrgs.inf.lattesParser.dadGer.areAtu.AreasDeAtuacao;
import br.ufrgs.inf.lattesParser.dadGer.atuPro.AtuacoesProfissionais;
import br.ufrgs.inf.lattesParser.dadGer.forAcaTit.FormacaoAcademicaTitulacao;
import br.ufrgs.inf.lattesParser.dadGer.idiomas.Idiomas;
import br.ufrgs.inf.lattesParser.dadGer.outInfRel.OutrasInformacoesRelevantes;
import br.ufrgs.inf.lattesParser.dadGer.resumoCv.ResumoCV;

/**
 * 
 *	Missing Endereco -> Endereco Profissional
 */
@XmlRootElement(name="DADOS-GERAIS")
public class DadosGerais {

	private String nomeCompleto;
	private String nomeEmCitacoesBibliograficas;
	private String nacionalidade;
	private String paisDeNascimento;
	private String ufNascimento;
	private String cidadeNascimento;
	private String persmissaoDeDivulgacao;
	private String dataFalecimento;
	private String siglaPaisNacionalidade;
	private String paisdeNacionalidade;
	
	private ResumoCV resumoCv;
	private OutrasInformacoesRelevantes outrasInformacoesRelevantes;
	//
	private FormacaoAcademicaTitulacao formacaoAcademicaTitulacao;
	private AtuacoesProfissionais atuacoesProfissionais;
	private AreasDeAtuacao areasDeAtuacao;
	private Idiomas idiomas;
	
	@XmlAttribute(name="NOME-COMPLETO")
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	@XmlAttribute(name="NOME-EM-CITACOES-BIBLIOGRAFICAS")
	public String getNomeEmCitacoesBibliograficas() {
		return nomeEmCitacoesBibliograficas;
	}
	public void setNomeEmCitacoesBibliograficas(String nomeEmCitacoesBibliograficas) {
		this.nomeEmCitacoesBibliograficas = nomeEmCitacoesBibliograficas;
	}
		
	@XmlAttribute(name="NACIONALIDADE")
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	@XmlAttribute(name="PAIS-DE-NASCIMENTO")
	public String getPaisDeNascimento() {
		return paisDeNascimento;
	}
	public void setPaisDeNascimento(String paisDeNascimento) {
		this.paisDeNascimento = paisDeNascimento;
	}
	
	@XmlAttribute(name="UF-NASCIMENTO")
	public String getUfNascimento() {
		return ufNascimento;
	}
	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}
	
	@XmlAttribute(name="CIDADE-NASCIMENTO")
	public String getCidadeNascimento() {
		return cidadeNascimento;
	}
	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}
	
	@XmlAttribute(name="PERMISSAO-DE-DIVULGACAO")
	public String getPersmissaoDeDivulgacao() {
		return persmissaoDeDivulgacao;
	}
	public void setPersmissaoDeDivulgacao(String persmissaoDeDivulgacao) {
		this.persmissaoDeDivulgacao = persmissaoDeDivulgacao;
	}
	
	@XmlAttribute(name="DATA-FALECIMENTO")
	public String getDataFalecimento() {
		return dataFalecimento;
	}
	public void setDataFalecimento(String dataFalecimento) {
		this.dataFalecimento = dataFalecimento;
	}
	
	@XmlAttribute(name="SIGLA-PAIS-NACIONALIDADE")
	public String getSiglaPaisNacionalidade() {
		return siglaPaisNacionalidade;
	}
	public void setSiglaPaisNacionalidade(String siglaPaisNacionalidade) {
		this.siglaPaisNacionalidade = siglaPaisNacionalidade;
	}
	
	@XmlAttribute(name="PAIS-DE-NACIONALIDADE")
	public String getPaisdeNacionalidade() {
		return paisdeNacionalidade;
	}
	public void setPaisdeNacionalidade(String paisdeNacionalidade) {
		this.paisdeNacionalidade = paisdeNacionalidade;
	}
	
	@XmlElement(name="RESUMO-CV")
	public ResumoCV getResumoCv() {
		return resumoCv;
	}
	public void setResumoCv(ResumoCV resumoCv) {
		this.resumoCv = resumoCv;
	}
	
	@XmlElement(name="OUTRAS-INFORMACOES-RELEVANTES")
	public OutrasInformacoesRelevantes getOutrasInformacoesRelevantes() {
		return outrasInformacoesRelevantes;
	}
	public void setOutrasInformacoesRelevantes(
			OutrasInformacoesRelevantes outrasInformacoesRelevantes) {
		this.outrasInformacoesRelevantes = outrasInformacoesRelevantes;
	}
	
	@XmlElement(name="FORMACAO-ACADEMICA-TITULACAO")
	public FormacaoAcademicaTitulacao getFormacaoAcademicaTitulacao() {
		return formacaoAcademicaTitulacao;
	}
	public void setFormacaoAcademicaTitulacao(
			FormacaoAcademicaTitulacao formacaoAcademicaTitulacao) {
		this.formacaoAcademicaTitulacao = formacaoAcademicaTitulacao;
	}
	
	@XmlElement(name="ATUACOES-PROFISSIONAIS")
	public AtuacoesProfissionais getAtuacoesProfissionais() {
		return atuacoesProfissionais;
	}
	public void setAtuacoesProfissionais(AtuacoesProfissionais atuacoesProfissionais) {
		this.atuacoesProfissionais = atuacoesProfissionais;
	}
	
	@XmlElement(name="AREAS-DE-ATUACAO")
	public AreasDeAtuacao getAreasDeAtuacao() {
		return areasDeAtuacao;
	}
	public void setAreasDeAtuacao(AreasDeAtuacao areasDeAtuacao) {
		this.areasDeAtuacao = areasDeAtuacao;
	}
	
	@XmlElement(name="IDIOMAS")
	public Idiomas getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(Idiomas idiomas) {
		this.idiomas = idiomas;
	}
}