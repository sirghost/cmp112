package br.ufrgs.inf.lattesParser.proBib;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.proBib.jorRev.TextoEmJornalOuRevista;

@XmlRootElement(name="TEXTOS-EM-JORNAIS-OU-REVISTAS")
public class TextosEmJornaisOuRevistas {
	
	private ArrayList<TextoEmJornalOuRevista> textoJornalOuRevistas;

	@XmlElement(name = "TEXTO-EM-JORNAL-OU-REVISTA")
	public ArrayList<TextoEmJornalOuRevista> getTextoJornalOuRevistas() {
		return textoJornalOuRevistas;
	}
	public void setTextoJornalOuRevistas(
			ArrayList<TextoEmJornalOuRevista> textoJornalOuRevistas) {
		this.textoJornalOuRevistas = textoJornalOuRevistas;
	}
}