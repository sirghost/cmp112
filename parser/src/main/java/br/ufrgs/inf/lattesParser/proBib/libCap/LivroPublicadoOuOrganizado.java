package br.ufrgs.inf.lattesParser.proBib.libCap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

@XmlRootElement(name="LIVRO-PUBLICADO-OU-ORGANIZADO")
public class LivroPublicadoOuOrganizado extends DocumentoProducao {
	
	private DadosBasicosDoLivro dadosBasicosLivro;
	private DetalhamentoDoLivro detalhamentoLivro;
	
	@XmlElement(name = "DADOS-BASICOS-DO-LIVRO")
	public DadosBasicosDoLivro getDadosBasicosLivro() {
		return dadosBasicosLivro;
	}
	public void setDadosBasicosLivro(DadosBasicosDoLivro dadosBasicosLivro) {
		this.dadosBasicosLivro = dadosBasicosLivro;
	}
	
	@XmlElement(name = "DETALHAMENTO-DO-LIVRO")
	public DetalhamentoDoLivro getDetalhamentoLivro() {
		return detalhamentoLivro;
	}
	public void setDetalhamentoLivro(DetalhamentoDoLivro detalhamentoLivro) {
		this.detalhamentoLivro = detalhamentoLivro;
	}
}