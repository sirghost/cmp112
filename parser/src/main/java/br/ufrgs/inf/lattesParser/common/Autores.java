package br.ufrgs.inf.lattesParser.common;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AUTORES")
public class Autores {

	private ArrayList<Autor> autores;

	@XmlElement(name = "AUTORES")
	public ArrayList<Autor> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<Autor> autores) {
		this.autores = autores;
	}	
}