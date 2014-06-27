package br.ufrgs.inf.lattesParser.proBib;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.proBib.libCap.CapitulosDeLivrosPublicados;
import br.ufrgs.inf.lattesParser.proBib.libCap.LivrosPublicadosOuOrganizados;

@XmlRootElement(name="LIVROS-E-CAPITULOS")
public class LivrosCapitulos {

	private LivrosPublicadosOuOrganizados livrosPublicadosOrganizados;
	private CapitulosDeLivrosPublicados capitulosLivrosPublicados;

	@XmlElement(name = "LIVROS-PUBLICADOS-OU-ORGANIZADOS")
	public LivrosPublicadosOuOrganizados getLivrosPublicadosOrganizados() {
		return livrosPublicadosOrganizados;
	}
	public void setLivrosPublicadosOrganizados(
			LivrosPublicadosOuOrganizados livrosPublicadosOrganizados) {
		this.livrosPublicadosOrganizados = livrosPublicadosOrganizados;
	}
	
	@XmlElement(name = "CAPITULOS-DE-LIVROS-PUBLICADOS")
	public CapitulosDeLivrosPublicados getCapitulosLivrosPublicados() {
		return capitulosLivrosPublicados;
	}
	public void setCapitulosLivrosPublicados(
			CapitulosDeLivrosPublicados capitulosLivrosPublicados) {
		this.capitulosLivrosPublicados = capitulosLivrosPublicados;
	}	
}