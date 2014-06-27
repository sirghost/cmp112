package br.ufrgs.inf.lattesParser.proBib.libCap;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CAPITULOS-DE-LIVROS-PUBLICADOS")
public class CapitulosDeLivrosPublicados {

	private ArrayList<CapituloLivroPublicado> capituloLivroPublicados;

	@XmlElement(name="CAPITULO-DE-LIVRO-PUBLICADO")
	public ArrayList<CapituloLivroPublicado> getCapituloLivroPublicados() {
		return capituloLivroPublicados;
	}
	public void setCapituloLivroPublicados(
			ArrayList<CapituloLivroPublicado> capituloLivroPublicados) {
		this.capituloLivroPublicados = capituloLivroPublicados;
	}
}