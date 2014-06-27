package br.ufrgs.inf.lattesParser.proTec.outProTec;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

//TODO: field names
@XmlRootElement(name="DESENVOLVIMENTO-DE-MATERIAL-DIDATICO-OU-INSTRUCIONAL")
public class DesDeMaterialDidacticoOuInstruccional extends DocumentoProducao {
	
	private DadBasDoMaterialDidacticoOuInstrucional dadBasDoMaterialDidacticoOuInstrucional;
	private DetDoMaterialDidacticoOuInstrucional detDoMaterialDidacticoOuInstrucional;
	
	@XmlElement(name = "DADOS-BASICOS-DO-MATERIAL-DIDATICO-OU-INSTRUCIONAL")
	public DadBasDoMaterialDidacticoOuInstrucional getDadBasDoMaterialDidacticoOuInstrucional() {
		return dadBasDoMaterialDidacticoOuInstrucional;
	}
	public void setDadBasDoMaterialDidacticoOuInstrucional(
			DadBasDoMaterialDidacticoOuInstrucional dadBasDoMaterialDidacticoOuInstrucional) {
		this.dadBasDoMaterialDidacticoOuInstrucional = dadBasDoMaterialDidacticoOuInstrucional;
	}
	
	@XmlElement(name = "DETALHAMENTO-DO-MATERIAL-DIDATICO-OU-INSTRUCIONAL")
	public DetDoMaterialDidacticoOuInstrucional getDetDoMaterialDidacticoOuInstrucional() {
		return detDoMaterialDidacticoOuInstrucional;
	}
	public void setDetDoMaterialDidacticoOuInstrucional(
			DetDoMaterialDidacticoOuInstrucional detDoMaterialDidacticoOuInstrucional) {
		this.detDoMaterialDidacticoOuInstrucional = detDoMaterialDidacticoOuInstrucional;
	}
}