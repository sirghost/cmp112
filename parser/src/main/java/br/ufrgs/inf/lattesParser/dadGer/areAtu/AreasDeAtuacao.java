package br.ufrgs.inf.lattesParser.dadGer.areAtu;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AREAS-DE-ATUACAO")
public class AreasDeAtuacao {
	
	private ArrayList<AreaDeAtuacao> areasDeAtuacao;

	@XmlElement(name = "AREA-DE-ATUACAO")
	public ArrayList<AreaDeAtuacao> getAreasDeAtuacao() {
		return areasDeAtuacao;
	}
	public void setAreasDeAtuacao(ArrayList<AreaDeAtuacao> areasDeAtuacao) {
		this.areasDeAtuacao = areasDeAtuacao;
	}
}