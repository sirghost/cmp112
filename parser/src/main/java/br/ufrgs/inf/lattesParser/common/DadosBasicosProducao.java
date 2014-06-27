package br.ufrgs.inf.lattesParser.common;

import javax.xml.bind.annotation.XmlAttribute;

public class DadosBasicosProducao {

	private String idioma;
	private String meioDeDivulgacao;
	private String homePageDoTrabalho;
	private String flagRelevancia;
	private String doi;
	private String flagDivulgacaoCientifica;
	
	@XmlAttribute(name="IDIOMA")
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	@XmlAttribute(name="MEIO-DE-DIVULGACAO")
	public String getMeioDeDivulgacao() {
		return meioDeDivulgacao;
	}
	public void setMeioDeDivulgacao(String meioDeDivulgacao) {
		this.meioDeDivulgacao = meioDeDivulgacao;
	}
	
	@XmlAttribute(name="HOME-PAGE-DO-TRABALHO")
	public String getHomePageDoTrabalho() {
		return homePageDoTrabalho;
	}
	public void setHomePageDoTrabalho(String homePageDoTrabalho) {
		this.homePageDoTrabalho = homePageDoTrabalho;
	}
	
	@XmlAttribute(name="FLAG-RELEVANCIA")
	public String getFlagRelevancia() {
		return flagRelevancia;
	}
	public void setFlagRelevancia(String flagRelevancia) {
		this.flagRelevancia = flagRelevancia;
	}
	
	@XmlAttribute(name="DOI")
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	
	@XmlAttribute(name="FLAG-DIVULGACAO-CIENTIFICA")
	public String getFlagDivulgacaoCientifica() {
		return flagDivulgacaoCientifica;
	}
	public void setFlagDivulgacaoCientifica(String flagDivulgacaoCientifica) {
		this.flagDivulgacaoCientifica = flagDivulgacaoCientifica;
	}
}