package br.ufrgs.inf.lattesParser.proTec;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DADOS-BASICOS-DO-TRABALHO-TECNICO")
public class DadosBasicosDoTrabalhoTecnico {
	
	private String natureza;
	private String tituloDoTrabalhoTecnico;
	private String ano;
	private String pais;
	private String idioma;
	private String meioDeDivulgacao;
	private String homePageDoTrabalho;
	private String flagRevelancia;
	private String doi;
	private String tituloDoTrabalhoTecnicoIngles;
		
	@XmlAttribute(name="NATUREZA")
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	
	@XmlAttribute(name="TITULO-DO-TRABALHO-TECNICO")
	public String getTituloDoTrabalhoTecnico() {
		return tituloDoTrabalhoTecnico;
	}
	public void setTituloDoTrabalhoTecnico(String tituloDoTrabalhoTecnico) {
		this.tituloDoTrabalhoTecnico = tituloDoTrabalhoTecnico;
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
	public String getFlagRevelancia() {
		return flagRevelancia;
	}
	public void setFlagRevelancia(String flagRevelancia) {
		this.flagRevelancia = flagRevelancia;
	}
	
	@XmlAttribute(name="DOI")
	public String getDoi() {
		return doi;
	}
	public void setDoi(String doi) {
		this.doi = doi;
	}
	
	@XmlAttribute(name="TITULO-DO-TRABALHO-TECNICO-INGLES")
	public String getTituloDoTrabalhoTecnicoIngles() {
		return tituloDoTrabalhoTecnicoIngles;
	}
	public void setTituloDoTrabalhoTecnicoIngles(
			String tituloDoTrabalhoTecnicoIngles) {
		this.tituloDoTrabalhoTecnicoIngles = tituloDoTrabalhoTecnicoIngles;
	}
}