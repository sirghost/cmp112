package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ATIVIDADES-DE-PESQUISA-E-DESENVOLVIMENTO")
public class AtividadesDePesquisaEDesenvolvimento {

	private ArrayList<PesquisaEDesenvolvimento> pesEDesenvolvimento;

	@XmlElement(name = "PESQUISA-E-DESENVOLVIMENTO")
	public ArrayList<PesquisaEDesenvolvimento> getPesEDesenvolvimento() {
		return pesEDesenvolvimento;
	}
	public void setPesEDesenvolvimento(
			ArrayList<PesquisaEDesenvolvimento> pesEDesenvolvimento) {
		this.pesEDesenvolvimento = pesEDesenvolvimento;
	}	
}