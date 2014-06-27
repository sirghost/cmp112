package br.ufrgs.inf.lattesParser.proTec.outProTec;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DO-MATERIAL-DIDATICO-OU-INSTRUCIONAL")
public class DetDoMaterialDidacticoOuInstrucional {
	
	private String finalidade;
	private String finalidadeIngles;
	
	@XmlAttribute(name="FINALIDADE")
	public String getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	
	@XmlAttribute(name="FINALIDADE-INGLES")
	public String getFinalidadeIngles() {
		return finalidadeIngles;
	}
	public void setFinalidadeIngles(String finalidadeIngles) {
		this.finalidadeIngles = finalidadeIngles;
	}
}