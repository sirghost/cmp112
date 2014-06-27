package br.ufrgs.inf.lattesParser.dadGer.forAcaTit;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FORMACAO-ACADEMICA-TITULACAO")
public class FormacaoAcademicaTitulacao {
	
	private Graduacao graduacao;
	private Mestrado mestrado;
	private Doutorado doutorado;
	private EnsinoMeioSegundoGrau ensinoMeioSegundoGrau;

	@XmlElement(name="GRADUACAO")
	public Graduacao getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(Graduacao graduacao) {
		this.graduacao = graduacao;
	}
	
	@XmlElement(name="MESTRADO")
	public Mestrado getMestrado() {
		return mestrado;
	}
	public void setMestrado(Mestrado mestrado) {
		this.mestrado = mestrado;
	}

	@XmlElement(name="DOUTORADO")
	public Doutorado getDoutorado() {
		return doutorado;
	}
	public void setDoutorado(Doutorado doutorado) {
		this.doutorado = doutorado;
	}

	@XmlElement(name="ENSINO-MEDIO-SEGUNDO-GRAU")
	public EnsinoMeioSegundoGrau getEnsinoMeioSegundoGrau() {
		return ensinoMeioSegundoGrau;
	}
	public void setEnsinoMeioSegundoGrau(EnsinoMeioSegundoGrau ensinoMeioSegundoGrau) {
		this.ensinoMeioSegundoGrau = ensinoMeioSegundoGrau;
	}
}