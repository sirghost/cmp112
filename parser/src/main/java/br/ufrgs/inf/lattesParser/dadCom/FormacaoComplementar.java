package br.ufrgs.inf.lattesParser.dadCom;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FORMACAO-COMPLEMENTAR")
public class FormacaoComplementar {
	
	private ArrayList<Outros> outros;

	@XmlElement(name="OUTROS")
	public ArrayList<Outros> getOutros() {
		return outros;
	}
	public void setOutros(ArrayList<Outros> outros) {
		this.outros = outros;
	}
}