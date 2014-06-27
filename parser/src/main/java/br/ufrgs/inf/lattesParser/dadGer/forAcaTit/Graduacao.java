package br.ufrgs.inf.lattesParser.dadGer.forAcaTit;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="GRADUACAO")
public class Graduacao {

	private String sequenciaFormacao;
	private String nivel;
	private String tituloDoTrabalhoDeConclusaoDeCurso;
	private String nomeDoOrientador;
	private String codigoInstituicao;
	private String nomeInstituicao;
	private String codigoCurso;
	private String nomeCurso;
	private String codigoAreaCurso;
	private String statusDoCurso;
	private String anoDeInicio;
	private String anoDeConclusao;
	private String flagBolsa;
	private String tipoGraduacao;
	private String codigoInstituicaoGrad;
	private String nomeInstituicaoGrad;
	private String codigoInstituicaoOutraGrad;
	private String nomeInstituicaoOutraGrad;
	private String nomeOrientadorGrad;
	private String codigoAgenciaFinanciadora;
	private String nomeAgencia;
	private String numeroIdOrientador;
	private String codigoCursoCapes;
	private String tituloDoTrabalhoDeConclusaoDeCursoIngles;
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
	
	@XmlAttribute(name="TITULO-DO-TRABALHO-DE-CONCLUSAO-DE-CURSO")
	public String getTituloDoTrabalhoDeConclusaoDeCurso() {
		return tituloDoTrabalhoDeConclusaoDeCurso;
	}
	public void setTituloDoTrabalhoDeConclusaoDeCurso(
			String tituloDoTrabalhoDeConclusaoDeCurso) {
		this.tituloDoTrabalhoDeConclusaoDeCurso = tituloDoTrabalhoDeConclusaoDeCurso;
	}
	
	@XmlAttribute(name="NOME-DO-ORIENTADOR")
	public String getNomeDoOrientador() {
		return nomeDoOrientador;
	}
	public void setNomeDoOrientador(String nomeDoOrientador) {
		this.nomeDoOrientador = nomeDoOrientador;
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
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getCodigoAreaCurso() {
		return codigoAreaCurso;
	}
	public void setCodigoAreaCurso(String codigoAreaCurso) {
		this.codigoAreaCurso = codigoAreaCurso;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getStatusDoCurso() {
		return statusDoCurso;
	}
	public void setStatusDoCurso(String statusDoCurso) {
		this.statusDoCurso = statusDoCurso;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getAnoDeInicio() {
		return anoDeInicio;
	}
	public void setAnoDeInicio(String anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getAnoDeConclusao() {
		return anoDeConclusao;
	}
	public void setAnoDeConclusao(String anoDeConclusao) {
		this.anoDeConclusao = anoDeConclusao;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getFlagBolsa() {
		return flagBolsa;
	}
	public void setFlagBolsa(String flagBolsa) {
		this.flagBolsa = flagBolsa;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getTipoGraduacao() {
		return tipoGraduacao;
	}
	public void setTipoGraduacao(String tipoGraduacao) {
		this.tipoGraduacao = tipoGraduacao;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getCodigoInstituicaoGrad() {
		return codigoInstituicaoGrad;
	}
	public void setCodigoInstituicaoGrad(String codigoInstituicaoGrad) {
		this.codigoInstituicaoGrad = codigoInstituicaoGrad;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getNomeInstituicaoGrad() {
		return nomeInstituicaoGrad;
	}
	public void setNomeInstituicaoGrad(String nomeInstituicaoGrad) {
		this.nomeInstituicaoGrad = nomeInstituicaoGrad;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getCodigoInstituicaoOutraGrad() {
		return codigoInstituicaoOutraGrad;
	}
	public void setCodigoInstituicaoOutraGrad(String codigoInstituicaoOutraGrad) {
		this.codigoInstituicaoOutraGrad = codigoInstituicaoOutraGrad;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getNomeInstituicaoOutraGrad() {
		return nomeInstituicaoOutraGrad;
	}
	public void setNomeInstituicaoOutraGrad(String nomeInstituicaoOutraGrad) {
		this.nomeInstituicaoOutraGrad = nomeInstituicaoOutraGrad;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getNomeOrientadorGrad() {
		return nomeOrientadorGrad;
	}
	public void setNomeOrientadorGrad(String nomeOrientadorGrad) {
		this.nomeOrientadorGrad = nomeOrientadorGrad;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getCodigoAgenciaFinanciadora() {
		return codigoAgenciaFinanciadora;
	}
	public void setCodigoAgenciaFinanciadora(String codigoAgenciaFinanciadora) {
		this.codigoAgenciaFinanciadora = codigoAgenciaFinanciadora;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getNomeAgencia() {
		return nomeAgencia;
	}
	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getNumeroIdOrientador() {
		return numeroIdOrientador;
	}
	public void setNumeroIdOrientador(String numeroIdOrientador) {
		this.numeroIdOrientador = numeroIdOrientador;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getCodigoCursoCapes() {
		return codigoCursoCapes;
	}
	public void setCodigoCursoCapes(String codigoCursoCapes) {
		this.codigoCursoCapes = codigoCursoCapes;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getTituloDoTrabalhoDeConclusaoDeCursoIngles() {
		return tituloDoTrabalhoDeConclusaoDeCursoIngles;
	}
	public void setTituloDoTrabalhoDeConclusaoDeCursoIngles(
			String tituloDoTrabalhoDeConclusaoDeCursoIngles) {
		this.tituloDoTrabalhoDeConclusaoDeCursoIngles = tituloDoTrabalhoDeConclusaoDeCursoIngles;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}
	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
	}	
}