package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ORIENTACOES")
public class Orientacoes {

	private ArrayList<Orientacao> orientacao;

	@XmlElement(name = "ORIENTACAO")
	public ArrayList<Orientacao> getOrientacao() {
		return orientacao;
	}
	public void setOrientacao(ArrayList<Orientacao> orientacao) {
		this.orientacao = orientacao;
	}
}