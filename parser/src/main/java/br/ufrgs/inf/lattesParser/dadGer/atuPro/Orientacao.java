package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ORIENTACAO")
public class Orientacao {

	private String sequenciaOrientacao;
	private String tituloOrientacao;
	private String tipoOrientacao;
	private String tituloOrientacaoIngles;
	
	@XmlAttribute(name = "SEQUENCIA-ORIENTACAO")
	public String getSequenciaOrientacao() {
		return sequenciaOrientacao;
	}
	public void setSequenciaOrientacao(String sequenciaOrientacao) {
		this.sequenciaOrientacao = sequenciaOrientacao;
	}
	
	@XmlAttribute(name = "TITULO-ORIENTACAO")
	public String getTituloOrientacao() {
		return tituloOrientacao;
	}
	public void setTituloOrientacao(String tituloOrientacao) {
		this.tituloOrientacao = tituloOrientacao;
	}
	
	@XmlAttribute(name = "TIPO-ORIENTACAO")
	public String getTipoOrientacao() {
		return tipoOrientacao;
	}
	public void setTipoOrientacao(String tipoOrientacao) {
		this.tipoOrientacao = tipoOrientacao;
	}
	
	@XmlAttribute(name = "TITULO-ORIENTACAO-INGLES")
	public String getTituloOrientacaoIngles() {
		return tituloOrientacaoIngles;
	}
	public void setTituloOrientacaoIngles(String tituloOrientacaoIngles) {
		this.tituloOrientacaoIngles = tituloOrientacaoIngles;
	}
}