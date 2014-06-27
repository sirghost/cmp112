package br.ufrgs.inf.lattesParser.proTec;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DO-TRABALHO-TECNICO")
public class DetalhamentoDoTrabalhoTecnico {
	
	private String finalidade;
	private String duracaoEmMeses;
	private String numeroDePaginas;
	private String disponibilidade;
	private String institucaoFinanciadora;
	private String cidadeDoTrabalho;
	private String finalidadeIngles;
	
	@XmlAttribute(name="FINALIDADE")
	public String getFinalidade() {
		return finalidade;
	}
	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	
	@XmlAttribute(name="DURACAO-EM-MESES")
	public String getDuracaoEmMeses() {
		return duracaoEmMeses;
	}
	public void setDuracaoEmMeses(String duracaoEmMeses) {
		this.duracaoEmMeses = duracaoEmMeses;
	}
	
	@XmlAttribute(name="NUMERO-DE-PAGINAS")
	public String getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(String numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	@XmlAttribute(name="DISPONIBILIDADE")
	public String getDisponibilidade() {
		return disponibilidade;
	}
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	@XmlAttribute(name="INSTITUICAO-FINANCIADORA")
	public String getInstitucaoFinanciadora() {
		return institucaoFinanciadora;
	}
	public void setInstitucaoFinanciadora(String institucaoFinanciadora) {
		this.institucaoFinanciadora = institucaoFinanciadora;
	}
	
	@XmlAttribute(name="CIDADE-DO-TRABALHO")
	public String getCidadeDoTrabalho() {
		return cidadeDoTrabalho;
	}
	public void setCidadeDoTrabalho(String cidadeDoTrabalho) {
		this.cidadeDoTrabalho = cidadeDoTrabalho;
	}
	
	@XmlAttribute(name="FINALIDADE-INGLES")
	public String getFinalidadeIngles() {
		return finalidadeIngles;
	}
	public void setFinalidadeIngles(String finalidadeIngles) {
		this.finalidadeIngles = finalidadeIngles;
	}
}