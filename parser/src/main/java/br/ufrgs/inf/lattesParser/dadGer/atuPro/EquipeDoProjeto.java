package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="EQUIPE-DO-PROJETO")
public class EquipeDoProjeto {
	
	private ArrayList<IntegrantesDoProjeto> integrantesDoProjeto;

	@XmlElement(name = "INTEGRANTES-DO-PROJETO")
	public ArrayList<IntegrantesDoProjeto> getIntegrantesDoProjeto() {
		return integrantesDoProjeto;
	}
	public void setIntegrantesDoProjeto(
			ArrayList<IntegrantesDoProjeto> integrantesDoProjeto) {
		this.integrantesDoProjeto = integrantesDoProjeto;
	}
}