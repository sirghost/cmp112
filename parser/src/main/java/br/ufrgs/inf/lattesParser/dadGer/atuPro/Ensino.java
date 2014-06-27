package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ENSINO")
public class Ensino {
	
	private String sequenciaFuncaoAtividade;
	private String flagPeriodo;
	private String tipoEnsino;
	private String mesInicio;
	private String anoInicio;
	private String mesFim;
	private String anoFim;
	private String codigoOrgao;
	private String nomeOrgao;
	private String codigoCurso;
	private String nomeCurso;
	private String nomeCursoIngles;
	private ArrayList<Disciplina> disciplinas;	
	
	@XmlAttribute(name="SEQUENCIA-FUNCAO-ATIVIDADE")
	public String getSequenciaFuncaoAtividade() {
		return sequenciaFuncaoAtividade;
	}
	public void setSequenciaFuncaoAtividade(String sequenciaFuncaoAtividade) {
		this.sequenciaFuncaoAtividade = sequenciaFuncaoAtividade;
	}
	
	@XmlAttribute(name="FLAG-PERIODO")
	public String getFlagPeriodo() {
		return flagPeriodo;
	}
	public void setFlagPeriodo(String flagPeriodo) {
		this.flagPeriodo = flagPeriodo;
	}
	
	@XmlAttribute(name="TIPO-ENSINO")
	public String getTipoEnsino() {
		return tipoEnsino;
	}
	public void setTipoEnsino(String tipoEnsino) {
		this.tipoEnsino = tipoEnsino;
	}
	
	@XmlAttribute(name="MES-INICIO")
	public String getMesInicio() {
		return mesInicio;
	}
	public void setMesInicio(String mesInicio) {
		this.mesInicio = mesInicio;
	}
	
	@XmlAttribute(name="ANO-INICIO")
	public String getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}
	
	@XmlAttribute(name="MES-FIM")
	public String getMesFim() {
		return mesFim;
	}
	public void setMesFim(String mesFim) {
		this.mesFim = mesFim;
	}
	
	@XmlAttribute(name="ANO-FIM")
	public String getAnoFim() {
		return anoFim;
	}
	public void setAnoFim(String anoFim) {
		this.anoFim = anoFim;
	}
	
	@XmlAttribute(name="CODIGO-ORGAO")
	public String getCodigoOrgao() {
		return codigoOrgao;
	}
	public void setCodigoOrgao(String codigoOrgao) {
		this.codigoOrgao = codigoOrgao;
	}
	
	@XmlAttribute(name="NOME-ORGAO")
	public String getNomeOrgao() {
		return nomeOrgao;
	}
	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
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
	
	@XmlAttribute(name="NOME-CURSO-INGLES")
	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}
	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
	}
	
	@XmlElement(name="DISCIPLINA")
	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}