package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PROJETO-DE-PESQUISA")
public class ProjetoDePesquisa {
	
	private String sequenciaProjeto;
	private String anoInicio;
	private String anoFim;
	private String nomeProjeto;
	private String situacao;
	private String natureza;
	private String numeroTecnicoNivelMedio;
	private String numeroGraduacao;
	private String numeroEspecializacao;
	private String numeroMestradoAcademico;
	private String numeroMestradoProf;
	private String numeroDoutorado;
	private String descricaoDoProjeto;
	private String descricaoDoProjetoIngles;
	private String nomeDoProjetoIngles;
	private String flagPotencialInovacao;
	
	private EquipeDoProjeto equipeDoProjeto;
	private FinanciadoresDoProjeto financiadoresDoProjeto;
	private ProducoesCtDoProjeto producoesCtDoProjeto;
	private Orientacoes orientacoes;
	
	@XmlAttribute(name = "SEQUENCIA-PROJETO")
	public String getSequenciaProjeto() {
		return sequenciaProjeto;
	}
	public void setSequenciaProjeto(String sequenciaProjeto) {
		this.sequenciaProjeto = sequenciaProjeto;
	}
	
	@XmlAttribute(name = "ANO-INICIO")
	public String getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}
	
	@XmlAttribute(name = "ANO-FIM")
	public String getAnoFim() {
		return anoFim;
	}
	public void setAnoFim(String anoFim) {
		this.anoFim = anoFim;
	}
	
	@XmlAttribute(name = "NOME-DO-PROJETO")
	public String getNomeProjeto() {
		return nomeProjeto;
	}
	public void setNomeProjeto(String nomeProjeto) {
		this.nomeProjeto = nomeProjeto;
	}
	
	@XmlAttribute(name = "SITUACAO")
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	@XmlAttribute(name = "NATUREZA")
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	
	@XmlAttribute(name = "NUMERO_TECNICO_NIVEL_MEDIO")
	public String getNumeroTecnicoNivelMedio() {
		return numeroTecnicoNivelMedio;
	}
	public void setNumeroTecnicoNivelMedio(String numeroTecnicoNivelMedio) {
		this.numeroTecnicoNivelMedio = numeroTecnicoNivelMedio;
	}
	
	@XmlAttribute(name = "NUMERO-GRADUACAO")
	public String getNumeroGraduacao() {
		return numeroGraduacao;
	}
	public void setNumeroGraduacao(String numeroGraduacao) {
		this.numeroGraduacao = numeroGraduacao;
	}
	
	@XmlAttribute(name = "NUMERO-ESPECIALIZACAO")
	public String getNumeroEspecializacao() {
		return numeroEspecializacao;
	}
	public void setNumeroEspecializacao(String numeroEspecializacao) {
		this.numeroEspecializacao = numeroEspecializacao;
	}
	
	@XmlAttribute(name = "NUMERO-MESTRADO-ACADEMICO")
	public String getNumeroMestradoAcademico() {
		return numeroMestradoAcademico;
	}
	public void setNumeroMestradoAcademico(String numeroMestradoAcademico) {
		this.numeroMestradoAcademico = numeroMestradoAcademico;
	}
	
	@XmlAttribute(name = "NUMERO-MESTRADO-PROF")
	public String getNumeroMestradoProf() {
		return numeroMestradoProf;
	}
	public void setNumeroMestradoProf(String numeroMestradoProf) {
		this.numeroMestradoProf = numeroMestradoProf;
	}
	
	@XmlAttribute(name = "NUMERO-DOUTORADO")
	public String getNumeroDoutorado() {
		return numeroDoutorado;
	}
	public void setNumeroDoutorado(String numeroDoutorado) {
		this.numeroDoutorado = numeroDoutorado;
	}
	
	@XmlAttribute(name = "DESCRICAO-DO-PROJETO")
	public String getDescricaoDoProjeto() {
		return descricaoDoProjeto;
	}
	public void setDescricaoDoProjeto(String descricaoDoProjeto) {
		this.descricaoDoProjeto = descricaoDoProjeto;
	}
	
	@XmlAttribute(name = "DESCRICAO-DO-PROJETO-INGLES")
	public String getDescricaoDoProjetoIngles() {
		return descricaoDoProjetoIngles;
	}
	public void setDescricaoDoProjetoIngles(String descricaoDoProjetoIngles) {
		this.descricaoDoProjetoIngles = descricaoDoProjetoIngles;
	}
	
	@XmlAttribute(name = "NOME-DO-PROJETO-INGLES")
	public String getNomeDoProjetoIngles() {
		return nomeDoProjetoIngles;
	}
	public void setNomeDoProjetoIngles(String nomeDoProjetoIngles) {
		this.nomeDoProjetoIngles = nomeDoProjetoIngles;
	}
	
	@XmlAttribute(name = "FLAG-POTENCIAL-INOVACAO")
	public String getFlagPotencialInovacao() {
		return flagPotencialInovacao;
	}
	public void setFlagPotencialInovacao(String flagPotencialInovacao) {
		this.flagPotencialInovacao = flagPotencialInovacao;
	}
	
	@XmlElement(name = "EQUIPE-DO-PROJETO")
	public EquipeDoProjeto getEquipeDoProjeto() {
		return equipeDoProjeto;
	}
	public void setEquipeDoProjeto(EquipeDoProjeto equipeDoProjeto) {
		this.equipeDoProjeto = equipeDoProjeto;
	}
	
	@XmlElement(name = "FINANCIADORES-DO-PROJETO")
	public FinanciadoresDoProjeto getFinanciadoresDoProjeto() {
		return financiadoresDoProjeto;
	}
	public void setFinanciadoresDoProjeto(
			FinanciadoresDoProjeto financiadoresDoProjeto) {
		this.financiadoresDoProjeto = financiadoresDoProjeto;
	}
	
	@XmlElement(name = "PRODUCOES-CT-DO-PROJETO")
	public ProducoesCtDoProjeto getProducoesCtDoProjeto() {
		return producoesCtDoProjeto;
	}
	public void setProducoesCtDoProjeto(ProducoesCtDoProjeto producoesCtDoProjeto) {
		this.producoesCtDoProjeto = producoesCtDoProjeto;
	}
	
	@XmlElement(name = "ORIENTACOES")
	public Orientacoes getOrientacoes() {
		return orientacoes;
	}
	public void setOrientacoes(Orientacoes orientacoes) {
		this.orientacoes = orientacoes;
	}	
}