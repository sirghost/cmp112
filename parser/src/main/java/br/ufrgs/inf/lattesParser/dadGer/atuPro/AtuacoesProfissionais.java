package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ATUACOES-PROFISSIONAIS")
public class AtuacoesProfissionais {
	
	private ArrayList<AtuacaoProfissional> atuacaoProfissionals;

	@XmlElement(name = "ATUACAO-PROFISSIONAL")
	public ArrayList<AtuacaoProfissional> getAtuacaoProfissionals() {
		return atuacaoProfissionals;
	}

	public void setAtuacaoProfissionals(
			ArrayList<AtuacaoProfissional> atuacaoProfissionals) {
		this.atuacaoProfissionals = atuacaoProfissionals;
	}
}