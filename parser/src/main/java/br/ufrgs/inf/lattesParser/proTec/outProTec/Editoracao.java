package br.ufrgs.inf.lattesParser.proTec.outProTec;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

@XmlRootElement(name="EDITORACAO")
public class Editoracao extends DocumentoProducao {

	private DadosBasicosDeEditoracao dadosBasicosEditoracao;
	private DetalhamentoDeEditoracao detalhamentoEditoracao;
	
	@XmlElement(name = "DADOS-BASICOS-DE-EDITORACAO")
	public DadosBasicosDeEditoracao getDadosBasicosEditoracao() {
		return dadosBasicosEditoracao;
	}
	public void setDadosBasicosEditoracao(
			DadosBasicosDeEditoracao dadosBasicosEditoracao) {
		this.dadosBasicosEditoracao = dadosBasicosEditoracao;
	}
	
	@XmlElement(name = "DETALHAMENTO-DE-EDITORACAO")
	public DetalhamentoDeEditoracao getDetalhamentoEditoracao() {
		return detalhamentoEditoracao;
	}
	public void setDetalhamentoEditoracao(
			DetalhamentoDeEditoracao detalhamentoEditoracao) {
		this.detalhamentoEditoracao = detalhamentoEditoracao;
	}
}