package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ATUACAO-PROFISSIONAL")
public class AtuacaoProfissional {

	private String codigoInstituicao;
	private String nomeInstituicao;
	private String sequenciaAtividade;
	private String sequenciaImportancia;
	
	private ArrayList<Vinculos> vinculos;
	private ArrayList<AtividadesDeDirecaoEAdministracao> atiDirAdministracao;
	private ArrayList<AtividadesDePesquisaEDesenvolvimento> atiPesDesenvolvimento;
	private ArrayList<AtividadesDeEnsino> atiEnsino;
	private ArrayList<AtividadesDeExtensaoUniversitaria> atiExtUniversitaria;
	private ArrayList<AtividadesDeParticipacaoEmProjeto> atiParEmProjeto;
	
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
	
	@XmlAttribute(name="SEQUENCIA-ATIVIDADE")
	public String getSequenciaAtividade() {
		return sequenciaAtividade;
	}
	public void setSequenciaAtividade(String sequenciaAtividade) {
		this.sequenciaAtividade = sequenciaAtividade;
	}
	
	@XmlAttribute(name="SEQUENCIA-IMPORTANCIA")
	public String getSequenciaImportancia() {
		return sequenciaImportancia;
	}
	public void setSequenciaImportancia(String sequenciaImportancia) {
		this.sequenciaImportancia = sequenciaImportancia;
	}
	
	@XmlElement(name = "VINCULOS")
	public ArrayList<Vinculos> getVinculos() {
		return vinculos;
	}
	public void setVinculos(ArrayList<Vinculos> vinculos) {
		this.vinculos = vinculos;
	}
	
	@XmlElement(name = "ATIVIDADES-DE-DIRECAO-E-ADMINISTRACAO")
	public ArrayList<AtividadesDeDirecaoEAdministracao> getAtiDirAdministracao() {
		return atiDirAdministracao;
	}
	public void setAtiDirAdministracao(
			ArrayList<AtividadesDeDirecaoEAdministracao> atiDirAdministracao) {
		this.atiDirAdministracao = atiDirAdministracao;
	}
	
	@XmlElement(name = "ATIVIDADES-DE-PESQUISA-E-DESENVOLVIMENTO")
	public ArrayList<AtividadesDePesquisaEDesenvolvimento> getAtiPesDesenvolvimento() {
		return atiPesDesenvolvimento;
	}
	public void setAtiPesDesenvolvimento(
			ArrayList<AtividadesDePesquisaEDesenvolvimento> atiPesDesenvolvimento) {
		this.atiPesDesenvolvimento = atiPesDesenvolvimento;
	}
	
	@XmlElement(name = "ATIVIDADES-DE-ENSINO")
	public ArrayList<AtividadesDeEnsino> getAtiEnsino() {
		return atiEnsino;
	}
	public void setAtiEnsino(ArrayList<AtividadesDeEnsino> atiEnsino) {
		this.atiEnsino = atiEnsino;
	}
	
	@XmlElement(name = "ATIVIDADES-DE-EXTENSAO-UNIVERSITARIA")
	public ArrayList<AtividadesDeExtensaoUniversitaria> getAtiExtUniversitaria() {
		return atiExtUniversitaria;
	}
	public void setAtiExtUniversitaria(
			ArrayList<AtividadesDeExtensaoUniversitaria> atiExtUniversitaria) {
		this.atiExtUniversitaria = atiExtUniversitaria;
	}
	
	@XmlElement(name = "ATIVIDADES-DE-PARTICIPACAO-EM-PROJETO")
	public ArrayList<AtividadesDeParticipacaoEmProjeto> getAtiParEmProjeto() {
		return atiParEmProjeto;
	}
	public void setAtiParEmProjeto(
			ArrayList<AtividadesDeParticipacaoEmProjeto> atiParEmProjeto) {
		this.atiParEmProjeto = atiParEmProjeto;
	}	
}