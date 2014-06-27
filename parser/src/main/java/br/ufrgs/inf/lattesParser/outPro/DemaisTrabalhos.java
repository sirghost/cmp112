package br.ufrgs.inf.lattesParser.outPro;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;
import br.ufrgs.inf.lattesParser.outPro.demTra.DadosBasicosDeDemaisTrabalhos;
import br.ufrgs.inf.lattesParser.outPro.demTra.DetalhamentoDeDemaisTrabalhos;

@XmlRootElement(name="DEMAIS-TRABALHOS")
public class DemaisTrabalhos extends DocumentoProducao {
	
	private DadosBasicosDeDemaisTrabalhos dadosBasicosDemaisTrabalhos;
	private DetalhamentoDeDemaisTrabalhos detalhamentoDemaisTrabalhos;
	
	@XmlElement(name = "DADOS-BASICOS-DE-DEMAIS-TRABALHOS")
	public DadosBasicosDeDemaisTrabalhos getDadosBasicosDemaisTrabalhos() {
		return dadosBasicosDemaisTrabalhos;
	}
	public void setDadosBasicosDemaisTrabalhos(
			DadosBasicosDeDemaisTrabalhos dadosBasicosDemaisTrabalhos) {
		this.dadosBasicosDemaisTrabalhos = dadosBasicosDemaisTrabalhos;
	}
	
	@XmlElement(name = "DETALHAMENTO-DE-DEMAIS-TRABALHOS")
	public DetalhamentoDeDemaisTrabalhos getDetalhamentoDemaisTrabalhos() {
		return detalhamentoDemaisTrabalhos;
	}
	public void setDetalhamentoDemaisTrabalhos(
			DetalhamentoDeDemaisTrabalhos detalhamentoDemaisTrabalhos) {
		this.detalhamentoDemaisTrabalhos = detalhamentoDemaisTrabalhos;
	}
}