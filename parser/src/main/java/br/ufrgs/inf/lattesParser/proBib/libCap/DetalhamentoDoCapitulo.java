package br.ufrgs.inf.lattesParser.proBib.libCap;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DO-CAPITULO")
public class DetalhamentoDoCapitulo {
	
	private String tituloDoLivro;
	private String numeroDeVolumes;
	private String paginaInicial;
	private String paginaFinal;
	private String isbn;
	private String organizadores;
	private String numeroEdicaoRevisao;
	private String numeroDaSerie;
	private String cidadeDaEditora;
	private String nomeDaEditora;
	
	@XmlAttribute(name="TITULO-DO-LIVRO")
	public String getTituloDoLivro() {
		return tituloDoLivro;
	}
	public void setTituloDoLivro(String tituloDoLivro) {
		this.tituloDoLivro = tituloDoLivro;
	}
	
	@XmlAttribute(name="NUMERO-DE-VOLUMES")
	public String getNumeroDeVolumes() {
		return numeroDeVolumes;
	}
	public void setNumeroDeVolumes(String numeroDeVolumes) {
		this.numeroDeVolumes = numeroDeVolumes;
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
	
	@XmlAttribute(name="ORGANIZADORES")
	public String getOrganizadores() {
		return organizadores;
	}
	public void setOrganizadores(String organizadores) {
		this.organizadores = organizadores;
	}
	
	@XmlAttribute(name="NUMERO-DA-EDICAO-REVISAO")
	public String getNumeroEdicaoRevisao() {
		return numeroEdicaoRevisao;
	}
	public void setNumeroEdicaoRevisao(String numeroEdicaoRevisao) {
		this.numeroEdicaoRevisao = numeroEdicaoRevisao;
	}
	
	@XmlAttribute(name="NUMERO-DA-SERIE")
	public String getNumeroDaSerie() {
		return numeroDaSerie;
	}
	public void setNumeroDaSerie(String numeroDaSerie) {
		this.numeroDaSerie = numeroDaSerie;
	}
	
	@XmlAttribute(name="CIDADE-DA-EDITORA")
	public String getCidadeDaEditora() {
		return cidadeDaEditora;
	}
	public void setCidadeDaEditora(String cidadeDaEditora) {
		this.cidadeDaEditora = cidadeDaEditora;
	}
	
	@XmlAttribute(name="NOME-DA-EDITORA")
	public String getNomeDaEditora() {
		return nomeDaEditora;
	}
	public void setNomeDaEditora(String nomeDaEditora) {
		this.nomeDaEditora = nomeDaEditora;
	}
}