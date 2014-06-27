package br.ufrgs.inf.lattesParser.proBib.artPub;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DO-ARTIGO")
public class DetalhamentoDoArtigo {

	private String tituloDoPeriodicoOuRevista;
	private String issn;
	private String volume;
	private String fasciculo;
	private String serie;
	private String paginaInicial;
	private String paginaFinal;
	private String localDePublicacao;
	
	@XmlAttribute(name="TITULO-DO-PERIODICO-OU-REVISTA")
	public String getTituloDoPeriodicoOuRevista() {
		return tituloDoPeriodicoOuRevista;
	}
	public void setTituloDoPeriodicoOuRevista(String tituloDoPeriodicoOuRevista) {
		this.tituloDoPeriodicoOuRevista = tituloDoPeriodicoOuRevista;
	}
	
	@XmlAttribute(name="ISSN")
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
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
	
	@XmlAttribute(name="LOCAL-DE-PUBLICACAO")
	public String getLocalDePublicacao() {
		return localDePublicacao;
	}
	public void setLocalDePublicacao(String localDePublicacao) {
		this.localDePublicacao = localDePublicacao;
	}	
}