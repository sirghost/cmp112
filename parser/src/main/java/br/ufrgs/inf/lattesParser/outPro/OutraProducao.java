package br.ufrgs.inf.lattesParser.outPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="OUTRA-PRODUCAO")
public class OutraProducao {
	
	private OrientacoesConcluidas orientacoesConcluidas;
	private ArrayList<DemaisTrabalhos> demaisTrabalhos;
	
	@XmlElement(name="ORIENTACOES-CONCLUIDAS")
	public OrientacoesConcluidas getOrientacoesConcluidas() {
		return orientacoesConcluidas;
	}
	public void setOrientacoesConcluidas(OrientacoesConcluidas orientacoesConcluidas) {
		this.orientacoesConcluidas = orientacoesConcluidas;
	}
	
	@XmlElement(name="DEMAIS-TRABALHOS")
	public ArrayList<DemaisTrabalhos> getDemaisTrabalhos() {
		return demaisTrabalhos;
	}
	public void setDemaisTrabalhos(ArrayList<DemaisTrabalhos> demaisTrabalhos) {
		this.demaisTrabalhos = demaisTrabalhos;
	}
}