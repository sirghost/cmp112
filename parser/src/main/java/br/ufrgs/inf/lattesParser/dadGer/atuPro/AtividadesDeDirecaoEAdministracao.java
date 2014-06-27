package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ATIVIDADES-DE-DIRECAO-E-ADMINISTRACAO")
public class AtividadesDeDirecaoEAdministracao {

	private ArrayList<DirecaoEAdministracao> direcaoEAdministracao;

	@XmlElement(name = "DIRECAO-E-ADMINISTRACAO")
	public ArrayList<DirecaoEAdministracao> getDirecaoEAdministracao() {
		return direcaoEAdministracao;
	}
	public void setDirecaoEAdministracao(
			ArrayList<DirecaoEAdministracao> direcaoEAdministracao) {
		this.direcaoEAdministracao = direcaoEAdministracao;
	}	
}