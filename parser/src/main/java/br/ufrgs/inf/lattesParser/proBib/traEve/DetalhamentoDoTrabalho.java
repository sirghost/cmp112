package br.ufrgs.inf.lattesParser.proBib.traEve;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DO-TRABALHO")
public class DetalhamentoDoTrabalho {

	private String classificacaoDoEvento;
	private String nomeDoEvento;
	private String cidadeDoEvento;
	private String anoDeRealizacao;
	private String tituloDosAnaisOuProceedings;
	private String volume;
	private String fasciculo;
	private String serie;
	private String paginaInicial;
	private String paginaFinal;
	private String isbn;
	private String nomeDaEditora;
	private String cidadeDaEditora;
	
	@XmlAttribute(name="CLASSIFICACAO-DO-EVENTO")
	public String getClassificacaoDoEvento() {
		return classificacaoDoEvento;
	}
	public void setClassificacaoDoEvento(String classificacaoDoEvento) {
		this.classificacaoDoEvento = classificacaoDoEvento;
	}
	
	@XmlAttribute(name="NOME-DO-EVENTO")
	public String getNomeDoEvento() {
		return nomeDoEvento;
	}
	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}
	
	@XmlAttribute(name="CIDADE-DO-EVENTO")
	public String getCidadeDoEvento() {
		return cidadeDoEvento;
	}
	public void setCidadeDoEvento(String cidadeDoEvento) {
		this.cidadeDoEvento = cidadeDoEvento;
	}
	
	@XmlAttribute(name="ANO-DE-REALIZACAO")
	public String getAnoDeRealizacao() {
		return anoDeRealizacao;
	}
	public void setAnoDeRealizacao(String anoDeRealizacao) {
		this.anoDeRealizacao = anoDeRealizacao;
	}
	
	@XmlAttribute(name="TITULO-DOS-ANAIS-OU-PROCEEDINGS")
	public String getTituloDosAnaisOuProceedings() {
		return tituloDosAnaisOuProceedings;
	}
	public void setTituloDosAnaisOuProceedings(String tituloDosAnaisOuProceedings) {
		this.tituloDosAnaisOuProceedings = tituloDosAnaisOuProceedings;
	}
	
	@XmlAttribute(name="VOLUME")
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	
	@XmlAttribute(name="FASCICULO")
	public String getFasciculo() {
		return fasciculo;
	}
	public void setFasciculo(String fasciculo) {
		this.fasciculo = fasciculo;
	}
	
	@XmlAttribute(name="SERIE")
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	@XmlAttribute(name="PAGINA-INICIAL")
	public String getPaginaInicial() {
		return paginaInicial;
	}
	public void setPaginaInicial(String paginaInicial) {
		this.paginaInicial = paginaInicial;
	}
	
	@XmlAttribute(name="PAGINA-FINAL")
	public String getPaginaFinal() {
		return paginaFinal;
	}
	public void setPaginaFinal(String paginaFinal) {
		this.paginaFinal = paginaFinal;
	}
	
	@XmlAttribute(name="ISBN")
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@XmlAttribute(name="NOME-DA-EDITORA")
	public String getNomeDaEditora() {
		return nomeDaEditora;
	}
	public void setNomeDaEditora(String nomeDaEditora) {
		this.nomeDaEditora = nomeDaEditora;
	}
	
	@XmlAttribute(name="CIDADE-DA-EDITORA")
	public String getCidadeDaEditora() {
		return cidadeDaEditora;
	}
	public void setCidadeDaEditora(String cidadeDaEditora) {
		this.cidadeDaEditora = cidadeDaEditora;
	}	
}