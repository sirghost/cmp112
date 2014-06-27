package br.ufrgs.inf.lattesParser.dadGer.outInfRel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="OUTRAS-INFORMACOES-RELEVANTES")
public class OutrasInformacoesRelevantes {
	
	private String OutrasInformacoesRelevantes;

	@XmlAttribute(name="OUTRAS-INFORMACOES-RELEVANTES")
	public String getOutrasInformacoesRelevantes() {
		return OutrasInformacoesRelevantes;
	}

	public void setOutrasInformacoesRelevantes(String outrasInformacoesRelevantes) {
		OutrasInformacoesRelevantes = outrasInformacoesRelevantes;
	}
}