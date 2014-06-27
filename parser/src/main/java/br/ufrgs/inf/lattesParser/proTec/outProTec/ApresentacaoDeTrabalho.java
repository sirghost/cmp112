package br.ufrgs.inf.lattesParser.proTec.outProTec;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

@XmlRootElement(name="APRESENTACAO-DE-TRABALHO")
public class ApresentacaoDeTrabalho extends DocumentoProducao {
	
	private DadosBasicosDaApresentacaoDeTrabalho dadosBasicosApresentacaoTrabalho;
	private DetalhamentoDaApresentacaoDeTrabalho detalhamentoApresentacaoTrabalho;
	
	@XmlElement(name = "DADOS-BASICOS-DA-APRESENTACAO-DE-TRABALHO")
	public DadosBasicosDaApresentacaoDeTrabalho getDadosBasicosApresentacaoTrabalho() {
		return dadosBasicosApresentacaoTrabalho;
	}
	public void setDadosBasicosApresentacaoTrabalho(
			DadosBasicosDaApresentacaoDeTrabalho dadosBasicosApresentacaoTrabalho) {
		this.dadosBasicosApresentacaoTrabalho = dadosBasicosApresentacaoTrabalho;
	}
	
	@XmlElement(name = "DETALHAMENTO-DA-APRESENTACAO-DE-TRABALHO")
	public DetalhamentoDaApresentacaoDeTrabalho getDetalhamentoApresentacaoTrabalho() {
		return detalhamentoApresentacaoTrabalho;
	}
	public void setDetalhamentoApresentacaoTrabalho(
			DetalhamentoDaApresentacaoDeTrabalho detalhamentoApresentacaoTrabalho) {
		this.detalhamentoApresentacaoTrabalho = detalhamentoApresentacaoTrabalho;
	}
}