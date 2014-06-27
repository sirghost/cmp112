package br.ufrgs.inf.lattesParser.proBib;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.proBib.traEve.TrabalhoEmEventos;

@XmlRootElement(name="TRABALHOS-EM-EVENTOS")
public class TrabalhosEmEventos {
	
	private ArrayList<TrabalhoEmEventos> trabalhosEventos;

	@XmlElement(name = "TRABALHO-EM-EVENTOS")
	public ArrayList<TrabalhoEmEventos> getTrabalhosEventos() {
		return trabalhosEventos;
	}
	public void setTrabalhosEventos(ArrayList<TrabalhoEmEventos> trabalhosEventos) {
		this.trabalhosEventos = trabalhosEventos;
	}
}