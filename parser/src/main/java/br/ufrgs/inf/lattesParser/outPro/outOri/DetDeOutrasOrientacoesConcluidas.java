package br.ufrgs.inf.lattesParser.outPro.outOri;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
public class DetDeOutrasOrientacoesConcluidas {
	
	private String nomeDoOrientando;
	private String codigoInstituicao;
	private String nomeDaInstituicao;
	private String codigoCurso;
	private String nomeDoCurso;
	private String flagBolsa;
	private String codigoAgenciaFinanciadora;
	private String nomeDaAgencia;
	private String tipoDeOrientacaoConcluida;
	private String numeroDePaginas;
	private String numeroIdOrientado;
	private String nomeDoCursoIngles;
	
	@XmlAttribute(name="NOME-DO-ORIENTADO")
	public String getNomeDoOrientando() {
		return nomeDoOrientando;
	}
	public void setNomeDoOrientando(String nomeDoOrientando) {
		this.nomeDoOrientando = nomeDoOrientando;
	}
	
	@XmlAttribute(name="CODIGO-INSTITUICAO")
	public String getCodigoInstituicao() {
		return codigoInstituicao;
	}
	public void setCodigoInstituicao(String codigoInstituicao) {
		this.codigoInstituicao = codigoInstituicao;
	}
	
	@XmlAttribute(name="NOME-DA-INSTITUICAO")
	public String getNomeDaInstituicao() {
		return nomeDaInstituicao;
	}
	public void setNomeDaInstituicao(String nomeDaInstituicao) {
		this.nomeDaInstituicao = nomeDaInstituicao;
	}
	
	@XmlAttribute(name="CODIGO-CURSO")
	public String getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	@XmlAttribute(name="NOME-DO-CURSO")
	public String getNomeDoCurso() {
		return nomeDoCurso;
	}
	public void setNomeDoCurso(String nomeDoCurso) {
		this.nomeDoCurso = nomeDoCurso;
	}
	
	@XmlAttribute(name="FLAG-BOLSA")
	public String getFlagBolsa() {
		return flagBolsa;
	}
	public void setFlagBolsa(String flagBolsa) {
		this.flagBolsa = flagBolsa;
	}
	
	@XmlAttribute(name="CODIGO-AGENCIA-FINANCIADORA")
	public String getCodigoAgenciaFinanciadora() {
		return codigoAgenciaFinanciadora;
	}
	public void setCodigoAgenciaFinanciadora(String codigoAgenciaFinanciadora) {
		this.codigoAgenciaFinanciadora = codigoAgenciaFinanciadora;
	}
	
	@XmlAttribute(name="NOME-DA-AGENCIA")
	public String getNomeDaAgencia() {
		return nomeDaAgencia;
	}
	public void setNomeDaAgencia(String nomeDaAgencia) {
		this.nomeDaAgencia = nomeDaAgencia;
	}
	
	@XmlAttribute(name="TIPO-DE-ORIENTACAO-CONCLUIDA")
	public String getTipoDeOrientacaoConcluida() {
		return tipoDeOrientacaoConcluida;
	}
	public void setTipoDeOrientacaoConcluida(String tipoDeOrientacaoConcluida) {
		this.tipoDeOrientacaoConcluida = tipoDeOrientacaoConcluida;
	}
	
	@XmlAttribute(name="NUMERO-DE-PAGINAS")
	public String getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(String numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	@XmlAttribute(name="NUMERO-ID-ORIENTADO")
	public String getNumeroIdOrientado() {
		return numeroIdOrientado;
	}
	public void setNumeroIdOrientado(String numeroIdOrientado) {
		this.numeroIdOrientado = numeroIdOrientado;
	}
	
	@XmlAttribute(name="NOME-DO-CURSO-INGLES")
	public String getNomeDoCursoIngles() {
		return nomeDoCursoIngles;
	}
	public void setNomeDoCursoIngles(String nomeDoCursoIngles) {
		this.nomeDoCursoIngles = nomeDoCursoIngles;
	}
}