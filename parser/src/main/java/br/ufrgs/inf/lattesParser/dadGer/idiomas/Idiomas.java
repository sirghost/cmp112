package br.ufrgs.inf.lattesParser.dadGer.idiomas;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="IDIOMAS")
public class Idiomas {

	private ArrayList<Idioma> idiomas;

	@XmlElement(name = "IDIOMA")
	public ArrayList<Idioma> getIdiomas() {
		return idiomas;
	}
	public void setIdiomas(ArrayList<Idioma> idiomas) {
		this.idiomas = idiomas;
	}	
}