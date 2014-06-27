package br.ufrgs.inf.lattesParser.outPro.demTra;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DadosBasicosOutraProducao;

@XmlRootElement(name="DADOS-BASICOS-DE-DEMAIS-TRABALHOS")
public class DadosBasicosDeDemaisTrabalhos extends DadosBasicosOutraProducao {
	
	private String natureza;
	private String naturezaIngles;
	
	@XmlAttribute(name="NATUREZA")
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	
	@XmlAttribute(name="NATUREZA-INGLES")
	public String getNaturezaIngles() {
		return naturezaIngles;
	}
	public void setNaturezaIngles(String naturezaIngles) {
		this.naturezaIngles = naturezaIngles;
	}
}