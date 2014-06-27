package br.ufrgs.inf.lattesParser.proBib.traEve;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

@XmlRootElement(name="TRABALHO-EM-EVENTOS")
public class TrabalhoEmEventos extends DocumentoProducao {

	private DadosBasicosDoTrabalho dadosBasicosTrabalho;
	private DetalhamentoDoTrabalho detalhamentoTrabalho;
	
	@XmlElement(name = "DADOS-BASICOS-DO-TRABALHO")
	public DadosBasicosDoTrabalho getDadosBasicosTrabalho() {
		return dadosBasicosTrabalho;
	}
	public void setDadosBasicosTrabalho(DadosBasicosDoTrabalho dadosBasicosTrabalho) {
		this.dadosBasicosTrabalho = dadosBasicosTrabalho;
	}
	
	@XmlElement(name = "DETALHAMENTO-DO-TRABALHO")
	public DetalhamentoDoTrabalho getDetalhamentoTrabalho() {
		return detalhamentoTrabalho;
	}
	public void setDetalhamentoTrabalho(DetalhamentoDoTrabalho detalhamentoTrabalho) {
		this.detalhamentoTrabalho = detalhamentoTrabalho;
	}	
}