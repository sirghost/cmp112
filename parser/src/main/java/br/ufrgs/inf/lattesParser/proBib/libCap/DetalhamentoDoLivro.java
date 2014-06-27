package br.ufrgs.inf.lattesParser.proBib.libCap;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DO-LIVRO")
public class DetalhamentoDoLivro {
	
	private String numeroDeVolumes;
	private String numeroDePaginas;
	private String isbn;
	private String numeroDaEdicaoRevisao;
	private String numeroDaSerie;
	private String cidadeDaEditora;
	private String nomeDaEditora;
	
	@XmlAttribute(name="NUMERO-DE-VOLUMES")
	public String getNumeroDeVolumes() {
		return numeroDeVolumes;
	}
	public void setNumeroDeVolumes(String numeroDeVolumes) {
		this.numeroDeVolumes = numeroDeVolumes;
	}
	
	@XmlAttribute(name="NUMERO-DE-PAGINAS")
	public String getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(String numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	@XmlAttribute(name="ISBN")
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	@XmlAttribute(name="NUMERO-DA-EDICAO-REVISAO")
	public String getNumeroDaEdicaoRevisao() {
		return numeroDaEdicaoRevisao;
	}
	public void setNumeroDaEdicaoRevisao(String numeroDaEdicaoRevisao) {
		this.numeroDaEdicaoRevisao = numeroDaEdicaoRevisao;
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