package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ATIVIDADES-DE-PARTICIPACAO-EM-PROJETO")
public class AtividadesDeParticipacaoEmProjeto {

	private ArrayList<ParticipacaoEmProjeto> participacaoEmProjeto;

	@XmlElement(name = "PARTICIPACAO-EM-PROJETO")
	public ArrayList<ParticipacaoEmProjeto> getParticipacaoEmProjeto() {
		return participacaoEmProjeto;
	}
	public void setParticipacaoEmProjeto(
			ArrayList<ParticipacaoEmProjeto> participacaoEmProjeto) {
		this.participacaoEmProjeto = participacaoEmProjeto;
	}
}