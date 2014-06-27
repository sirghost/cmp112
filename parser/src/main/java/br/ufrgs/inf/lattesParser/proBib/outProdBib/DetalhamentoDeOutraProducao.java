package br.ufrgs.inf.lattesParser.proBib.outProdBib;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DE-OUTRA-PRODUCAO")
public class DetalhamentoDeOutraProducao {
	
	private String editora;
	private String cidadeDaEditora;
	private String numeroDePaginas;
	private String issnIsbn;
	
	@XmlAttribute(name="EDITORA")
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@XmlAttribute(name="CIDADE-DA-EDITORA")
	public String getCidadeDaEditora() {
		return cidadeDaEditora;
	}
	public void setCidadeDaEditora(String cidadeDaEditora) {
		this.cidadeDaEditora = cidadeDaEditora;
	}
	
	@XmlAttribute(name="NUMERO-DE-PAGINAS")
	public String getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(String numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	@XmlAttribute(name="ISSN-ISBN")
	public String getIssnIsbn() {
		return issnIsbn;
	}
	public void setIssnIsbn(String issnIsbn) {
		this.issnIsbn = issnIsbn;
	}
}