package br.ufrgs.inf.lattesParser.proBib.artPub;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DadosBasicosProducao;

@XmlRootElement(name="DADOS-BASICOS-DO-ARTIGO")
public class DadosBasicosDoArtigo extends DadosBasicosProducao {

	private String natureza;
	private String tituloDoArtigo;
	private String anoDoArtigo;
	private String paisDePublicacao;
	private String tituloDoArtigoIngles;
	
	@XmlAttribute(name="NATUREZA")
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	
	@XmlAttribute(name="TITULO-DO-ARTIGO")
	public String getTituloDoArtigo() {
		return tituloDoArtigo;
	}
	public void setTituloDoArtigo(String tituloDoArtigo) {
		this.tituloDoArtigo = tituloDoArtigo;
	}
	
	@XmlAttribute(name="ANO-DO-ARTIGO")
	public String getAnoDoArtigo() {
		return anoDoArtigo;
	}
	public void setAnoDoArtigo(String anoDoArtigo) {
		this.anoDoArtigo = anoDoArtigo;
	}
	
	@XmlAttribute(name="PAIS-DE-PUBLICACAO")
	public String getPaisDePublicacao() {
		return paisDePublicacao;
	}
	public void setPaisDePublicacao(String paisDePublicacao) {
		this.paisDePublicacao = paisDePublicacao;
	}
	
	@XmlAttribute(name="TITULO-DO-ARTIGO-INGLES")	
	public String getTituloDoArtigoIngles() {
		return tituloDoArtigoIngles;
	}
	public void setTituloDoArtigoIngles(String tituloDoArtigoIngles) {
		this.tituloDoArtigoIngles = tituloDoArtigoIngles;
	}	
}