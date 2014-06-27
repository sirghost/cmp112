package br.ufrgs.inf.lattesParser.proTec.outProTec;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DADOS-BASICOS-DA-APRESENTACAO-DE-TRABALHO")
public class DadosBasicosDaApresentacaoDeTrabalho {
	
	private String natureza;
	private String titulo;
	private String ano;
	private String pais;
	private String idioma;
	private String flagRelevancia;
	private String tituloIngles;
	private String flagDivulgacaoCientifica;
	
	@XmlAttribute(name="NATUREZA")
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	
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
	
	@XmlAttribute(name="IDIOMA")
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	@XmlAttribute(name="FLAG-RELEVANCIA")
	public String getFlagRelevancia() {
		return flagRelevancia;
	}
	public void setFlagRelevancia(String flagRelevancia) {
		this.flagRelevancia = flagRelevancia;
	}
	
	@XmlAttribute(name="TITULO-INGLES")
	public String getTituloIngles() {
		return tituloIngles;
	}
	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
	}
	
	@XmlAttribute(name="FLAG-DIVULGACAO-CIENTIFICA")
	public String getFlagDivulgacaoCientifica() {
		return flagDivulgacaoCientifica;
	}
	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}
}