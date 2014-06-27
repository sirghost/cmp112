package br.ufrgs.inf.lattesParser.proTec.outProTec;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DA-APRESENTACAO-DE-TRABALHO")
public class DetalhamentoDaApresentacaoDeTrabalho {
	
	private String nomeDoEvento;
	private String institucaoPromotora;
	private String localDaApresentacao;
	private String cidadeDaApresentacao;
	private String nomeDoEventoIngles;
	
	@XmlAttribute(name="NOME-DO-EVENTO")
	public String getNomeDoEvento() {
		return nomeDoEvento;
	}
	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}
	
	@XmlAttribute(name="INSTITUICAO-PROMOTORA")
	public String getInstitucaoPromotora() {
		return institucaoPromotora;
	}
	public void setInstitucaoPromotora(String institucaoPromotora) {
		this.institucaoPromotora = institucaoPromotora;
	}
	
	@XmlAttribute(name="LOCAL-DA-APRESENTACAO")
	public String getLocalDaApresentacao() {
		return localDaApresentacao;
	}
	public void setLocalDaApresentacao(String localDaApresentacao) {
		this.localDaApresentacao = localDaApresentacao;
	}
	
	@XmlAttribute(name="CIDADE-DA-APRESENTACAO")
	public String getCidadeDaApresentacao() {
		return cidadeDaApresentacao;
	}
	public void setCidadeDaApresentacao(String cidadeDaApresentacao) {
		this.cidadeDaApresentacao = cidadeDaApresentacao;
	}
	
	@XmlAttribute(name="NOME-DO-EVENTO-INGLES")
	public String getNomeDoEventoIngles() {
		return nomeDoEventoIngles;
	}
	public void setNomeDoEventoIngles(String nomeDoEventoIngles) {
		this.nomeDoEventoIngles = nomeDoEventoIngles;
	}
}