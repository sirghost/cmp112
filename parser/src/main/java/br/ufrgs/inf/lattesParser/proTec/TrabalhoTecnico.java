package br.ufrgs.inf.lattesParser.proTec;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

@XmlRootElement(name="TRABALHO-TECNICO")
public class TrabalhoTecnico extends DocumentoProducao {

	private DadosBasicosDoTrabalhoTecnico dadosBasicosTrabalhoTecnico;
	private DetalhamentoDoTrabalhoTecnico detalhamentoTrabalhoTecnico;
	
	@XmlElement(name = "DADOS-BASICOS-DO-TRABALHO-TECNICO")
	public DadosBasicosDoTrabalhoTecnico getDadosBasicosTrabalhoTecnico() {
		return dadosBasicosTrabalhoTecnico;
	}
	public void setDadosBasicosTrabalhoTecnico(
			DadosBasicosDoTrabalhoTecnico dadosBasicosTrabalhoTecnico) {
		this.dadosBasicosTrabalhoTecnico = dadosBasicosTrabalhoTecnico;
	}
	
	@XmlElement(name = "DETALHAMENTO-DO-TRABALHO-TECNICO")
	public DetalhamentoDoTrabalhoTecnico getDetalhamentoTrabalhoTecnico() {
		return detalhamentoTrabalhoTecnico;
	}
	public void setDetalhamentoTrabalhoTecnico(
			DetalhamentoDoTrabalhoTecnico detalhamentoTrabalhoTecnico) {
		this.detalhamentoTrabalhoTecnico = detalhamentoTrabalhoTecnico;
	}	
}