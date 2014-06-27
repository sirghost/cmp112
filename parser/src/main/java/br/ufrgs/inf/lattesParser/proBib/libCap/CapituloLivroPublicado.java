package br.ufrgs.inf.lattesParser.proBib.libCap;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

@XmlRootElement(name="CAPITULO-DE-LIVRO-PUBLICADO")
public class CapituloLivroPublicado extends DocumentoProducao {

	private DadosBasicosDoCapitulo dadosBasicosCapitulo;
	private DetalhamentoDoCapitulo detalhamentoCapitulo;
	
	@XmlElement(name="DADOS-BASICOS-DO-CAPITULO")
	public DadosBasicosDoCapitulo getDadosBasicosCapitulo() {
		return dadosBasicosCapitulo;
	}
	public void setDadosBasicosCapitulo(DadosBasicosDoCapitulo dadosBasicosCapitulo) {
		this.dadosBasicosCapitulo = dadosBasicosCapitulo;
	}
	
	@XmlElement(name="DETALHAMENTO-DO-CAPITULO")
	public DetalhamentoDoCapitulo getDetalhamentoCapitulo() {
		return detalhamentoCapitulo;
	}
	public void setDetalhamentoCapitulo(DetalhamentoDoCapitulo detalhamentoCapitulo) {
		this.detalhamentoCapitulo = detalhamentoCapitulo;
	}
}