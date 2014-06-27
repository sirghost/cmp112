package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FINANCIADOR-DO-PROJETO")
public class FinanciadorDoProjeto {

	private String sequenciaFinanciador;
	private String codigoInstituicao;
	private String nomeInstituicao;
	private String natureza;
	
	@XmlAttribute(name="SEQUENCIA-FINANCIADOR")
	public String getSequenciaFinanciador() {
		return sequenciaFinanciador;
	}
	public void setSequenciaFinanciador(String sequenciaFinanciador) {
		this.sequenciaFinanciador = sequenciaFinanciador;
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
	
	@XmlAttribute(name="NATUREZA")
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
}