package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FINANCIADORES-DO-PROJETO")
public class FinanciadoresDoProjeto {

	private ArrayList<FinanciadorDoProjeto> financiadorDoProjeto;

	@XmlElement(name = "FINANCIADOR-DO-PROJETO")
	public ArrayList<FinanciadorDoProjeto> getFinanciadorDoProjeto() {
		return financiadorDoProjeto;
	}
	public void setFinanciadorDoProjeto(
			ArrayList<FinanciadorDoProjeto> financiadorDoProjeto) {
		this.financiadorDoProjeto = financiadorDoProjeto;
	}
}