package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="EXTENSAO-UNIVERSITARIA")
public class ExtensaoUniversitaria {
	
	private String sequenciaFuncaoAtividade;
	private String flagPeriodo;
	private String mesInicio;
	private String anoInicio;
	private String mesFim;
	private String anoFim;
	private String codigoOrgao;
	private String nomeOrgao;
	private String codigoUnidade;
	private String nomeUnidade;
	private String atividadeDeExtensaoRealizada;
	
	@XmlAttribute(name = "SEQUENCIA-FUNCAO-ATIVIDADE")
	public String getSequenciaFuncaoAtividade() {
		return sequenciaFuncaoAtividade;
	}
	public void setSequenciaFuncaoAtividade(String sequenciaFuncaoAtividade) {
		this.sequenciaFuncaoAtividade = sequenciaFuncaoAtividade;
	}
	
	@XmlAttribute(name = "FLAG-PERIODO")
	public String getFlagPeriodo() {
		return flagPeriodo;
	}
	public void setFlagPeriodo(String flagPeriodo) {
		this.flagPeriodo = flagPeriodo;
	}
	
	@XmlAttribute(name = "MES-INICIO")
	public String getMesInicio() {
		return mesInicio;
	}
	public void setMesInicio(String mesInicio) {
		this.mesInicio = mesInicio;
	}
	
	@XmlAttribute(name = "ANO-INICIO")
	public String getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}
	
	@XmlAttribute(name = "MES-FIM")
	public String getMesFim() {
		return mesFim;
	}
	public void setMesFim(String mesFim) {
		this.mesFim = mesFim;
	}
	
	@XmlAttribute(name = "ANO-FIM")
	public String getAnoFim() {
		return anoFim;
	}
	public void setAnoFim(String anoFim) {
		anoFim = anoFim;
	}
	
	@XmlAttribute(name = "CODIGO-ORGAO")
	public String getCodigoOrgao() {
		return codigoOrgao;
	}
	public void setCodigoOrgao(String codigoOrgao) {
		this.codigoOrgao = codigoOrgao;
	}
	
	@XmlAttribute(name = "NOME-ORGAO")
	public String getNomeOrgao() {
		return nomeOrgao;
	}
	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}
	
	@XmlAttribute(name = "CODIGO-UNIDADE")
	public String getCodigoUnidade() {
		return codigoUnidade;
	}
	public void setCodigoUnidade(String codigoUnidade) {
		this.codigoUnidade = codigoUnidade;
	}
	
	@XmlAttribute(name = "NOME-UNIDADE")
	public String getNomeUnidade() {
		return nomeUnidade;
	}
	public void setNomeUnidade(String nomeUnidade) {
		this.nomeUnidade = nomeUnidade;
	}
	
	@XmlAttribute(name = "ATIVIDADE-DE-EXTENSAO-REALIZADA")
	public String getAtividadeDeExtensaoRealizada() {
		return atividadeDeExtensaoRealizada;
	}
	public void setAtividadeDeExtensaoRealizada(String atividadeDeExtensaoRealizada) {
		this.atividadeDeExtensaoRealizada = atividadeDeExtensaoRealizada;
	}
}