package br.ufrgs.inf.lattesParser.dadGer.forAcaTit;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DOUTORADO")
public class EnsinoMeioSegundoGrau {
	
	private String sequenciaFormacao;
	private String nivel;
	private String codigoInstituicao;
	private String nomeInstituicao;
	private String statusDoCurso;
	private String anoDeInicio;
	private String anoDeConclusao;
	
	@XmlAttribute(name="SEQUENCIA-FORMACAO")
	public String getSequenciaFormacao() {
		return sequenciaFormacao;
	}
	public void setSequenciaFormacao(String sequenciaFormacao) {
		this.sequenciaFormacao = sequenciaFormacao;
	}
	
	@XmlAttribute(name="NIVEL")
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	
	@XmlAttribute(name="CODIGO-INSTITUICAO")
	public String getCodigoInstituicao() {
		return codigoInstituicao;
	}
	public void setCodigoInstituicao(String codigoInstituicao) {
		this.codigoInstituicao = codigoInstituicao;
	}
	
	@XmlAttribute(name="NOME-INSTITUICAO")
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	
	@XmlAttribute(name="STATUS-DO-CURSO")
	public String getStatusDoCurso() {
		return statusDoCurso;
	}
	public void setStatusDoCurso(String statusDoCurso) {
		this.statusDoCurso = statusDoCurso;
	}
	
	@XmlAttribute(name="ANO-DE-INICIO")
	public String getAnoDeInicio() {
		return anoDeInicio;
	}
	public void setAnoDeInicio(String anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
	}
	
	@XmlAttribute(name="ANO-DE-CONCLUSAO")
	public String getAnoDeConclusao() {
		return anoDeConclusao;
	}
	public void setAnoDeConclusao(String anoDeConclusao) {
		this.anoDeConclusao = anoDeConclusao;
	}
}