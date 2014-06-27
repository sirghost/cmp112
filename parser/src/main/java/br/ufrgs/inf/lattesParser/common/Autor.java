package br.ufrgs.inf.lattesParser.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AUTOR")
public class Autor {
	
	private String nomeCompletoDoAutor;
	private String nomeParaCitacao;
	private String ordemDeAutoria;
	private String nroIdCnpq;
	
	@XmlAttribute(name="NOME-COMPLETO-DO-AUTOR")
	public String getNomeCompletoDoAutor() {
		return nomeCompletoDoAutor;
	}
	public void setNomeCompletoDoAutor(String nomeCompletoDoAutor) {
		this.nomeCompletoDoAutor = nomeCompletoDoAutor;
	}
	
	@XmlAttribute(name="NOME-PARA-CITACAO")
	public String getNomeParaCitacao() {
		return nomeParaCitacao;
	}
	public void setNomeParaCitacao(String nomeParaCitacao) {
		this.nomeParaCitacao = nomeParaCitacao;
	}
	
	@XmlAttribute(name="ORDEM-DE-AUTORIA")
	public String getOrdemDeAutoria() {
		return ordemDeAutoria;
	}
	public void setOrdemDeAutoria(String ordemDeAutoria) {
		this.ordemDeAutoria = ordemDeAutoria;
	}
	
	@XmlAttribute(name="NRO-ID-CNPQ")
	public String getNroIdCnpq() {
		return nroIdCnpq;
	}
	public void setNroIdCnpq(String nroIdCnpq) {
		this.nroIdCnpq = nroIdCnpq;
	}
}