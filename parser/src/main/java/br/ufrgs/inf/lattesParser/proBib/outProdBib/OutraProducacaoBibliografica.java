package br.ufrgs.inf.lattesParser.proBib.outProdBib;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

@XmlRootElement(name="OUTRA-PRODUCAO-BIBLIOGRAFICA")
public class OutraProducacaoBibliografica extends DocumentoProducao {

	private DadosBasicosDeOutraProducao dadosBasicosOutraProducao;
	private DetalhamentoDeOutraProducao detalhamentoOutraProducao;
	
	@XmlElement(name = "DADOS-BASICOS-DE-OUTRA-PRODUCAO")
	public DadosBasicosDeOutraProducao getDadosBasicosOutraProducao() {
		return dadosBasicosOutraProducao;
	}
	public void setDadosBasicosOutraProducao(
			DadosBasicosDeOutraProducao dadosBasicosOutraProducao) {
		this.dadosBasicosOutraProducao = dadosBasicosOutraProducao;
	}
	
	@XmlElement(name = "DETALHAMENTO-DE-OUTRA-PRODUCAO")
	public DetalhamentoDeOutraProducao getDetalhamentoOutraProducao() {
		return detalhamentoOutraProducao;
	}
	public void setDetalhamentoOutraProducao(
			DetalhamentoDeOutraProducao detalhamentoOutraProducao) {
		this.detalhamentoOutraProducao = detalhamentoOutraProducao;
	}
}