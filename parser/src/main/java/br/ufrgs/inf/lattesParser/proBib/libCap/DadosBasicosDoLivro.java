package br.ufrgs.inf.lattesParser.proBib.libCap;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DadosBasicosProducao;

@XmlRootElement(name="DADOS-BASICOS-DO-LIVRO")
public class DadosBasicosDoLivro extends DadosBasicosProducao {
	
	private String tipo;
	private String natureza;
	private String tituloDoLivro;
	private String ano;
	private String paisDePublicacao;
	private String tituloDoLivroIngles;
	
	@XmlAttribute(name="TIPO")
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@XmlAttribute(name="NATUREZA")
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	
	@XmlAttribute(name="TITULO-DO-LIVRO")
	public String getTituloDoLivro() {
		return tituloDoLivro;
	}
	public void setTituloDoLivro(String tituloDoLivro) {
		this.tituloDoLivro = tituloDoLivro;
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
		
	@XmlAttribute(name="TITULO-DO-LIVRO-INGLES")
	public String getTituloDoLivroIngles() {
		return tituloDoLivroIngles;
	}
	public void setTituloDoLivroIngles(String tituloDoLivroIngles) {
		this.tituloDoLivroIngles = tituloDoLivroIngles;
	}
}