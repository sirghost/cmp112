package br.ufrgs.inf.lattesParser.outPro.outOri;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DadosBasicosOutraProducao;

@XmlRootElement(name="DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
public class DadBasDeOutrasOrientacoesConcluidas extends DadosBasicosOutraProducao {
	
	private String natureza;
	private String tipo;
	private String homePage; //not homePageDivulgacao
	private String tipoIngles;
	
	@XmlAttribute(name="NATUREZA")
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	
	@XmlAttribute(name="TIPO")
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@XmlAttribute(name="HOME-PAGE")
	public String getHomePage() {
		return homePage;
	}
	public void setHomePage(String homePage) {
		this.homePage = homePage;
	}
	
	@XmlAttribute(name="TIPO-INGLES")
	public String getTipoIngles() {
		return tipoIngles;
	}
	public void setTipoIngles(String tipoIngles) {
		this.tipoIngles = tipoIngles;
	}
}