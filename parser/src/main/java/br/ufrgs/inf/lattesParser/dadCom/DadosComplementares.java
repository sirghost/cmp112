package br.ufrgs.inf.lattesParser.dadCom;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DADOS-COMPLEMENTARES")
public class DadosComplementares {
	
	private FormacaoComplementar formacaoComplementar;

	@XmlElement(name="FORMACAO-COMPLEMENTAR")
	public FormacaoComplementar getFormacaoComplementar() {
		return formacaoComplementar;
	}
	public void setFormacaoComplementar(FormacaoComplementar formacaoComplementar) {
		this.formacaoComplementar = formacaoComplementar;
	}
}