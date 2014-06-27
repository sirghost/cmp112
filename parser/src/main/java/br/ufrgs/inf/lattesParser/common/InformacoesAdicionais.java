package br.ufrgs.inf.lattesParser.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="INFORMACOES-ADICIONAIS")
public class InformacoesAdicionais {

	private String descricaoInformacoesAdicionais;
	private String descricaoInformacoesAdicionaisIngles;
	
	@XmlAttribute(name="DESCRICAO-INFORMACOES-ADICIONAIS")
	public String getDescricaoInformacoesAdicionais() {
		return descricaoInformacoesAdicionais;
	}
	public void setDescricaoInformacoesAdicionais(
			String descricaoInformacoesAdicionais) {
		this.descricaoInformacoesAdicionais = descricaoInformacoesAdicionais;
	}
	
	@XmlAttribute(name="DESCRICAO-INFORMACOES-ADICIONAIS-INGLES")
	public String getDescricaoInformacoesAdicionaisIngles() {
		return descricaoInformacoesAdicionaisIngles;
	}
	public void setDescricaoInformacoesAdicionaisIngles(
			String descricaoInformacoesAdicionaisIngles) {
		this.descricaoInformacoesAdicionaisIngles = descricaoInformacoesAdicionaisIngles;
	}	
}