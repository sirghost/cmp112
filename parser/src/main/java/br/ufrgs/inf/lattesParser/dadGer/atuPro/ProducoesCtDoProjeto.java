package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PRODUCOES-CT-DO-PROJETO")
public class ProducoesCtDoProjeto {

	private ArrayList<ProducaoCtDoProjeto> producaoCtDoProjeto;

	@XmlElement(name = "PRODUCAO-CT-DO-PROJETO")
	public ArrayList<ProducaoCtDoProjeto> getProducaoCtDoProjeto() {
		return producaoCtDoProjeto;
	}
	public void setProducaoCtDoProjeto(
			ArrayList<ProducaoCtDoProjeto> producaoCtDoProjeto) {
		this.producaoCtDoProjeto = producaoCtDoProjeto;
	}
}