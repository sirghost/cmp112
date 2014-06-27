package br.ufrgs.inf.lattesParser.dadCom;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="OUTROS")
public class Outros {
	
	private String sequenciaFormacao;
	private String nivel;
	private String cargaHoraria;
	private String codigoInstituicao;
	private String nomeInstituicao;
	private String codigoCurso;
	private String nomeCurso;
	private String statusDoCurso;
	private String anoDeInicio;
	private String anoDeConclusao;
	private String nomeCursoIngles;
	
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
	
	@XmlAttribute(name="CARGA-HORARIA")
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
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
	
	@XmlAttribute(name="CODIGO-CURSO")
	public String getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	@XmlAttribute(name="NOME-CURSO")
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
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
	
	@XmlAttribute(name="NOME-CURSO-INGLES")
	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}
	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
	}
}