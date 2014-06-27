package br.ufrgs.inf.lattesParser.proTec.outProTec;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

@XmlRootElement(name="ORGANIZACAO-DE-EVENTO")
public class OrganizacaoDeEvento extends DocumentoProducao {

	private DadosBasicosDaOrganizacaoDeEvento dadosBasicosOrganizacaoDeEvento;
	private DetalhamentoDaOrganizacaoDeEvento detalhamentoOrganizacaoDeEvento;
	
	@XmlElement(name = "DADOS-BASICOS-DA-ORGANIZACAO-DE-EVENTO")
	public DadosBasicosDaOrganizacaoDeEvento getDadosBasicosOrganizacaoDeEvento() {
		return dadosBasicosOrganizacaoDeEvento;
	}
	public void setDadosBasicosOrganizacaoDeEvento(
			DadosBasicosDaOrganizacaoDeEvento dadosBasicosOrganizacaoDeEvento) {
		this.dadosBasicosOrganizacaoDeEvento = dadosBasicosOrganizacaoDeEvento;
	}
	
	@XmlElement(name = "DETALHAMENTO-DA-ORGANIZACAO-DE-EVENTO")
	public DetalhamentoDaOrganizacaoDeEvento getDetalhamentoOrganizacaoDeEvento() {
		return detalhamentoOrganizacaoDeEvento;
	}
	public void setDetalhamentoOrganizacaoDeEvento(
			DetalhamentoDaOrganizacaoDeEvento detalhamentoOrganizacaoDeEvento) {
		this.detalhamentoOrganizacaoDeEvento = detalhamentoOrganizacaoDeEvento;
	}	
}