package br.ufrgs.inf.lattesParser.outPro.demTra;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DE-DEMAIS-TRABALHOS")
public class DetalhamentoDeDemaisTrabalhos {
	
	private String finalidade;
	private String local;
	
	@XmlAttribute(name="FINALIDADE")
	public String getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	
	@XmlAttribute(name="LOCAL")
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
}