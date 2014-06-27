package br.ufrgs.inf.lattesParser.common;

import javax.xml.bind.annotation.XmlAttribute;

public class DadosBasicosOutraProducao extends DadosBasicosProducao {

	private String titulo;
	private String ano;
	private String pais;
	private String tituloIngles;
	
	@XmlAttribute(name="TITULO")
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@XmlAttribute(name="ANO")
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	@XmlAttribute(name="PAIS")
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	@XmlAttribute(name="TITULO-INGLES")
	public String getTituloIngles() {
		return tituloIngles;
	}
	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
	}	
}