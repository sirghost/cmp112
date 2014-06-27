package br.ufrgs.inf.lattesParser.proBib.libCap;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="LIVROS-PUBLICADOS-OU-ORGANIZADOS")
public class LivrosPublicadosOuOrganizados {

	private ArrayList<LivroPublicadoOuOrganizado> livrosPublicadosOrganizados;

	@XmlElement(name="LIVRO-PUBLICADO-OU-ORGANIZADO")
	public ArrayList<LivroPublicadoOuOrganizado> getLivrosPublicadosOrganizados() {
		return livrosPublicadosOrganizados;
	}
	public void setLivrosPublicadosOrganizados(
			ArrayList<LivroPublicadoOuOrganizado> livrosPublicadosOrganizados) {
		this.livrosPublicadosOrganizados = livrosPublicadosOrganizados;
	}
}