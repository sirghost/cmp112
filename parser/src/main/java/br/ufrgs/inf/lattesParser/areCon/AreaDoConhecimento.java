package br.ufrgs.inf.lattesParser.areCon;

import javax.xml.bind.annotation.XmlAttribute;

public class AreaDoConhecimento {

	private String nomeGrandeAreaDoConhecimento;
	private String nomeDaAreaDoConhecimento;
	private String NomeDaSubAreaDoConhecimento;
	private String nomeDaEspecialidade;
	
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
		return NomeDaSubAreaDoConhecimento;
	}
	public void setNomeDaSubAreaDoConhecimento(String nomeDaSubAreaDoConhecimento) {
		NomeDaSubAreaDoConhecimento = nomeDaSubAreaDoConhecimento;
	}
	
	@XmlAttribute(name="NOME-DA-ESPECIALIDADE")
	public String getNomeDaEspecialidade() {
		return nomeDaEspecialidade;
	}
	public void setNomeDaEspecialidade(String nomeDaEspecialidade) {
		this.nomeDaEspecialidade = nomeDaEspecialidade;
	}
}