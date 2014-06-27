package br.ufrgs.inf.lattesParser.proBib.jorRev;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DO-TEXTO")
public class DetalhamentoDoTexto {

	private String tituloDoJornalOuRevista;
	private String issn;
	private String dataPublicacao;
	private String volume;
	private String paginaInicial;
	private String paginaFinal;
	private String localDePublicacao;
	
	@XmlAttribute(name="TITULO-DO-JORNAL-OU-REVISTA")
	public String getTituloDoJornalOuRevista() {
		return tituloDoJornalOuRevista;
	}
	public void setTituloDoJornalOuRevista(String tituloDoJornalOuRevista) {
		this.tituloDoJornalOuRevista = tituloDoJornalOuRevista;
	}
	
	@XmlAttribute(name="ISSN")
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	
	@XmlAttribute(name="DATA-DE-PUBLICACAO")
	public String getDataPublicacao() {
		return dataPublicacao;
	}
	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}
	
	@XmlAttribute(name="VOLUME")
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
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