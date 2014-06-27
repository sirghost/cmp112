package br.ufrgs.inf.lattesParser.proBib;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.proBib.artPub.ArtigoPublicado;

@XmlRootElement(name="ARTIGOS-PUBLICADOS")
public class ArtigosPublicados {

	private ArrayList<ArtigoPublicado> artigosPublicados;

	@XmlElement(name = "ARTIGO-PUBLICADO")
	public ArrayList<ArtigoPublicado> getArtigosPublicados() {
		return artigosPublicados;
	}
	public void setArtigosPublicados(ArrayList<ArtigoPublicado> artigosPublicados) {
		this.artigosPublicados = artigosPublicados;
	}	
}