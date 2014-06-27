package br.ufrgs.inf.lattesParser.proTec.outProTec;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DadosBasicosProducao;

@XmlRootElement(name="DADOS-BASICOS-DO-MATERIAL-DIDATICO-OU-INSTRUCIONAL")
public class DadBasDoMaterialDidacticoOuInstrucional extends DadosBasicosProducao {
	
	private String natureza;
	private String titulo;
	private String ano;
	private String pais;
	private String tituloIngles;
	private String naturezaIngles;
	
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
	
	@XmlAttribute(name="TITULO-INGLES")
	public String getTituloIngles() {
		return tituloIngles;
	}
	public void setTituloIngles(String tituloIngles) {
		this.tituloIngles = tituloIngles;
	}
	
	@XmlAttribute(name="NATUREZA-INGLES")
	public String getNaturezaIngles() {
		return naturezaIngles;
	}
	public void setNaturezaIngles(String naturezaIngles) {
		this.naturezaIngles = naturezaIngles;
	}	
}