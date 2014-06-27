package br.ufrgs.inf.lattesParser.proBib.artPub;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

@XmlRootElement(name="ARTIGO-PUBLICADO")
public class ArtigoPublicado extends DocumentoProducao {

	private String ordemImportancia;
	private DadosBasicosDoArtigo dadosBasicosArtigo;
	private DetalhamentoDoArtigo detalhamentoDoArtigo;

	@XmlAttribute(name="ORDEM-IMPORTANCIA")
	public String getOrdemImportancia() {
		return ordemImportancia;
	}
	public void setOrdemImportancia(String ordemImportancia) {
		this.ordemImportancia = ordemImportancia;
	}
	
	@XmlElement(name = "DADOS-BASICOS-DO-ARTIGO")
	public DadosBasicosDoArtigo getDadosBasicosArtigo() {
		return dadosBasicosArtigo;
	}
	public void setDadosBasicosArtigo(DadosBasicosDoArtigo dadosBasicosArtigo) {
		this.dadosBasicosArtigo = dadosBasicosArtigo;
	}
	
	@XmlElement(name = "DETALHAMENTO-DO-ARTIGO")
	public DetalhamentoDoArtigo getDetalhamentoDoArtigo() {
		return detalhamentoDoArtigo;
	}
	public void setDetalhamentoDoArtigo(DetalhamentoDoArtigo detalhamentoDoArtigo) {
		this.detalhamentoDoArtigo = detalhamentoDoArtigo;
	}
}