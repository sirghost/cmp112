package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="INTEGRANTES-DO-PROJETO")
public class IntegrantesDoProjeto {

	private String nomeCompleto;
	private String nomeParaCitacao;
	private String ordemDeIntegracao;
	private String flagResponsavel;
	private String nroIdCnpq;
	
	@XmlAttribute(name="NOME-COMPLETO")
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	@XmlAttribute(name="NOME-PARA-CITACAO")
	public String getNomeParaCitacao() {
		return nomeParaCitacao;
	}
	public void setNomeParaCitacao(String nomeParaCitacao) {
		this.nomeParaCitacao = nomeParaCitacao;
	}
	
	@XmlAttribute(name="ORDEM-DE-INTEGRACAO")
	public String getOrdemDeIntegracao() {
		return ordemDeIntegracao;
	}
	public void setOrdemDeIntegracao(String ordemDeIntegracao) {
		this.ordemDeIntegracao = ordemDeIntegracao;
	}
	
	@XmlAttribute(name="FLAG-RESPONSAVEL")
	public String getFlagResponsavel() {
		return flagResponsavel;
	}
	public void setFlagResponsavel(String flagResponsavel) {
		this.flagResponsavel = flagResponsavel;
	}
	
	@XmlAttribute(name="NRO-ID-CNPQ")
	public String getNroIdCnpq() {
		return nroIdCnpq;
	}
	public void setNroIdCnpq(String nroIdCnpq) {
		this.nroIdCnpq = nroIdCnpq;
	}
}