package br.ufrgs.inf.lattesParser.proBib.jorRev;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

@XmlRootElement(name="TEXTO-EM-JORNAL-OU-REVISTA")
public class TextoEmJornalOuRevista extends DocumentoProducao {

	private DadosBasicosDoTexto dadosBasicosTexto;
	private DetalhamentoDoTexto detalhamentoTexto;
	
	@XmlElement(name = "DADOS-BASICOS-DO-TEXTO")
	public DadosBasicosDoTexto getDadosBasicosTexto() {
		return dadosBasicosTexto;
	}
	public void setDadosBasicosTexto(DadosBasicosDoTexto dadosBasicosTexto) {
		this.dadosBasicosTexto = dadosBasicosTexto;
	}
	
	@XmlElement(name = "DETALHAMENTO-DO-TEXTO")
	public DetalhamentoDoTexto getDetalhamentoTexto() {
		return detalhamentoTexto;
	}
	public void setDetalhamentoTexto(DetalhamentoDoTexto detalhamentoTexto) {
		this.detalhamentoTexto = detalhamentoTexto;
	}	
}