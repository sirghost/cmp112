package br.ufrgs.inf.lattesParser.proBib.jorRev;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DADOS-BASICOS-DO-TEXTO")
public class DadosBasicosDoTexto {

	private String natureza;
	private String tituloDoTexto;
	private String anoDoTexto;
	private String paisDePublicacao;
	private String tituloDoTextoIngles;
	
	@XmlAttribute(name="NATUREZA")
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	
	@XmlAttribute(name="TITULO-DO-TEXTO")
	public String getTituloDoTexto() {
		return tituloDoTexto;
	}
	public void setTituloDoTexto(String tituloDoTexto) {
		this.tituloDoTexto = tituloDoTexto;
	}
	
	@XmlAttribute(name="ANO-DO-TEXTO")
	public String getAnoDoTexto() {
		return anoDoTexto;
	}
	public void setAnoDoTexto(String anoDoTexto) {
		this.anoDoTexto = anoDoTexto;
	}
	
	@XmlAttribute(name="PAIS-DE-PUBLICACAO")
	public String getPaisDePublicacao() {
		return paisDePublicacao;
	}
	public void setPaisDePublicacao(String paisDePublicacao) {
		this.paisDePublicacao = paisDePublicacao;
	}
	
	@XmlAttribute(name="TITULO-DO-TEXTO-INGLES")
	public String getTituloDoTextoIngles() {
		return tituloDoTextoIngles;
	}
	public void setTituloDoTextoIngles(String tituloDoTextoIngles) {
		this.tituloDoTextoIngles = tituloDoTextoIngles;
	}
}