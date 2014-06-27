package br.ufrgs.inf.lattesParser.proBib.libCap;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DadosBasicosProducao;

@XmlRootElement(name="DADOS-BASICOS-DO-CAPITULO")
public class DadosBasicosDoCapitulo extends DadosBasicosProducao {
	
	private String tipo;
	private String tituloDoCapituloDoLivro;
	private String ano;
	private String paisDePublicacao;
	private String tituloDoCapituloDoLivroIngles;
	
	@XmlAttribute(name="TIPO")
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@XmlAttribute(name="TITULO-DO-CAPITULO-DO-LIVRO")
	public String getTituloDoCapituloDoLivro() {
		return tituloDoCapituloDoLivro;
	}
	public void setTituloDoCapituloDoLivro(String tituloDoCapituloDoLivro) {
		this.tituloDoCapituloDoLivro = tituloDoCapituloDoLivro;
	}
	
	@XmlAttribute(name="ANO")
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	@XmlAttribute(name="PAIS-DE-PUBLICACAO")
	public String getPaisDePublicacao() {
		return paisDePublicacao;
	}
	public void setPaisDePublicacao(String paisDePublicacao) {
		this.paisDePublicacao = paisDePublicacao;
	}
	
	@XmlAttribute(name="TITULO-DO-CAPITULO-DO-LIVRO-INGLES")
	public String getTituloDoCapituloDoLivroIngles() {
		return tituloDoCapituloDoLivroIngles;
	}
	public void setTituloDoCapituloDoLivroIngles(
			String tituloDoCapituloDoLivroIngles) {
		this.tituloDoCapituloDoLivroIngles = tituloDoCapituloDoLivroIngles;
	}
}