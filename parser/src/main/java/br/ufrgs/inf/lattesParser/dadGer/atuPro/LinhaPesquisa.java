package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="LINHA-DE-PESQUISA")
public class LinhaPesquisa {

	private String sequenciaLinha;
	private String tituloDaLinhaDePesquisa;
	private String flagLinhaDePesquisaAtiva;
	private String objetivosLinhaDePesquisaString;
	private String tituloDaLinhaDePesquisaIngles;
	private String objetivosLinhaDePesquisaIngles;
	
	//TODO:
	private ArrayList<AreasDoConhecimento> areasDoConhecimento;
	
	@XmlAttribute(name="SEQUENCIA-LINHA")
	public String getSequenciaLinha() {
		return sequenciaLinha;
	}
	public void setSequenciaLinha(String sequenciaLinha) {
		this.sequenciaLinha = sequenciaLinha;
	}
	
	@XmlAttribute(name="TITULO-DA-LINHA-DE-PESQUISA")
	public String getTituloDaLinhaDePesquisa() {
		return tituloDaLinhaDePesquisa;
	}
	public void setTituloDaLinhaDePesquisa(String tituloDaLinhaDePesquisa) {
		this.tituloDaLinhaDePesquisa = tituloDaLinhaDePesquisa;
	}
	
	@XmlAttribute(name="FLAG-LINHA-DE-PESQUISA-ATIVA")
	public String getFlagLinhaDePesquisaAtiva() {
		return flagLinhaDePesquisaAtiva;
	}
	public void setFlagLinhaDePesquisaAtiva(String flagLinhaDePesquisaAtiva) {
		this.flagLinhaDePesquisaAtiva = flagLinhaDePesquisaAtiva;
	}
	
	@XmlAttribute(name="OBJETIVOS-LINHA-DE-PESQUISA")
	public String getObjetivosLinhaDePesquisaString() {
		return objetivosLinhaDePesquisaString;
	}
	public void setObjetivosLinhaDePesquisaString(
			String objetivosLinhaDePesquisaString) {
		this.objetivosLinhaDePesquisaString = objetivosLinhaDePesquisaString;
	}
	
	@XmlAttribute(name="TITULO-DA-LINHA-DE-PESQUISA-INGLES")
	public String getTituloDaLinhaDePesquisaIngles() {
		return tituloDaLinhaDePesquisaIngles;
	}
	public void setTituloDaLinhaDePesquisaIngles(
			String tituloDaLinhaDePesquisaIngles) {
		this.tituloDaLinhaDePesquisaIngles = tituloDaLinhaDePesquisaIngles;
	}
	
	@XmlAttribute(name="OBJETIVOS-LINHA-DE-PESQUISA-INGLES")
	public String getObjetivosLinhaDePesquisaIngles() {
		return objetivosLinhaDePesquisaIngles;
	}
	public void setObjetivosLinhaDePesquisaIngles(
			String objetivosLinhaDePesquisaIngles) {
		this.objetivosLinhaDePesquisaIngles = objetivosLinhaDePesquisaIngles;
	}
}