package br.ufrgs.inf.lattesParser.dadGer.areAtu;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="AREA-DE-ATUACAO")
public class AreaDeAtuacao {

	private String sequenciaAreaDeAtuacao;
	private String nomeGrandeAreaDoConhecimento;
	private String nomeDaAreaDoConhecimento;
	private String nomeDaSubAreaDoConhecimento;
	private String nomeDaEspecialidade;
	
	@XmlAttribute(name="SEQUENCIA-AREA-DE-ATUACAO")
	public String getSequenciaAreaDeAtuacao() {
		return sequenciaAreaDeAtuacao;
	}
	public void setSequenciaAreaDeAtuacao(String sequenciaAreaDeAtuacao) {
		this.sequenciaAreaDeAtuacao = sequenciaAreaDeAtuacao;
	}
	
	@XmlAttribute(name="NOME-GRANDE-AREA-DO-CONHECIMENTO")
	public String getNomeGrandeAreaDoConhecimento() {
		return nomeGrandeAreaDoConhecimento;
	}
	public void setNomeGrandeAreaDoConhecimento(String nomeGrandeAreaDoConhecimento) {
		this.nomeGrandeAreaDoConhecimento = nomeGrandeAreaDoConhecimento;
	}
	
	@XmlAttribute(name="NOME-DA-AREA-DO-CONHECIMENTO")
	public String getNomeDaAreaDoConhecimento() {
		return nomeDaAreaDoConhecimento;
	}
	public void setNomeDaAreaDoConhecimento(String nomeDaAreaDoConhecimento) {
		this.nomeDaAreaDoConhecimento = nomeDaAreaDoConhecimento;
	}
	
	@XmlAttribute(name="NOME-DA-SUB-AREA-DO-CONHECIMENTO")
	public String getNomeDaSubAreaDoConhecimento() {
		return nomeDaSubAreaDoConhecimento;
	}
	public void setNomeDaSubAreaDoConhecimento(String nomeDaSubAreaDoConhecimento) {
		this.nomeDaSubAreaDoConhecimento = nomeDaSubAreaDoConhecimento;
	}
	
	@XmlAttribute(name="NOME-DA-ESPECIALIDADE")
	public String getNomeDaEspecialidade() {
		return nomeDaEspecialidade;
	}
	public void setNomeDaEspecialidade(String nomeDaEspecialidade) {
		this.nomeDaEspecialidade = nomeDaEspecialidade;
	}	
}