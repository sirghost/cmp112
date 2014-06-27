package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement(name="DISCIPLINA")
public class Disciplina {
	
	private String sequenciaEspecificacao;
	private String descricao;

	@XmlAttribute(name="SEQUENCIA-ESPECIFICACAO")
	public String getSequenciaEspecificacao() {
		return sequenciaEspecificacao;
	}
	public void setSequenciaEspecificacao(String sequenciaEspecificacao) {
		this.sequenciaEspecificacao = sequenciaEspecificacao;
	}
	
	@XmlValue
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}	
}