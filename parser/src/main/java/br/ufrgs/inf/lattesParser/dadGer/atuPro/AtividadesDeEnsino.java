package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ATIVIDADES-DE-ENSINO")
public class AtividadesDeEnsino {
	
	private ArrayList<Ensino> ensino;

	@XmlElement(name = "ENSINO")
	public ArrayList<Ensino> getEnsino() {
		return ensino;
	}
	public void setEnsino(ArrayList<Ensino> ensino) {
		this.ensino = ensino;
	}
}
