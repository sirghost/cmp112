package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="VINCULOS")
public class Vinculos {

	private String sequenciaHistorico;
	private String tipoDeVinculo;
	private String enquadramentoFuncional;
	private String cargaHorariaSemanal;
	private String flagDedicacaoExclusiva;
	private String mesInicio;
	private String anoInicio;
	private String mesFim;
	private String anoFim;
	private String outrasInformacoes;
	private String flagVinculoEmpregaticio;
	private String outroVinculoInformado;
	private String outroEnquadramentoFuncionalInformado;
	private String outroEnquadramentoFuncionalInformadoIngles;
	private String outrasInformacoesIngles;
	
	@XmlAttribute(name="SEQUENCIA-HISTORICO")
	public String getSequenciaHistorico() {
		return sequenciaHistorico;
	}
	public void setSequenciaHistorico(String sequenciaHistorico) {
		this.sequenciaHistorico = sequenciaHistorico;
	}
	
	@XmlAttribute(name="TIPO-DE-VINCULO")
	public String getTipoDeVinculo() {
		return tipoDeVinculo;
	}
	public void setTipoDeVinculo(String tipoDeVinculo) {
		this.tipoDeVinculo = tipoDeVinculo;
	}
	
	@XmlAttribute(name="ENQUADRAMENTO-FUNCIONAL")
	public String getEnquadramentoFuncional() {
		return enquadramentoFuncional;
	}
	public void setEnquadramentoFuncional(String enquadramentoFuncional) {
		this.enquadramentoFuncional = enquadramentoFuncional;
	}
	
	@XmlAttribute(name="CARGA-HORARIA-SEMANAL")
	public String getCargaHorariaSemanal() {
		return cargaHorariaSemanal;
	}
	public void setCargaHorariaSemanal(String cargaHorariaSemanal) {
		this.cargaHorariaSemanal = cargaHorariaSemanal;
	}
	
	@XmlAttribute(name="FLAG-DEDICACAO-EXCLUSIVA")
	public String getFlagDedicacaoExclusiva() {
		return flagDedicacaoExclusiva;
	}
	public void setFlagDedicacaoExclusiva(String flagDedicacaoExclusiva) {
		this.flagDedicacaoExclusiva = flagDedicacaoExclusiva;
	}
	
	@XmlAttribute(name="MES-INICIO")
	public String getMesInicio() {
		return mesInicio;
	}
	public void setMesInicio(String mesInicio) {
		this.mesInicio = mesInicio;
	}
	
	@XmlAttribute(name="ANO-INICIO")
	public String getAnoInicio() {
		return anoInicio;
	}
	public void setAnoInicio(String anoInicio) {
		this.anoInicio = anoInicio;
	}
	
	@XmlAttribute(name="MES-FIM")
	public String getMesFim() {
		return mesFim;
	}
	public void setMesFim(String mesFim) {
		this.mesFim = mesFim;
	}
	
	@XmlAttribute(name="ANO-FIM")
	public String getAnoFim() {
		return anoFim;
	}
	public void setAnoFim(String anoFim) {
		this.anoFim = anoFim;
	}
	
	@XmlAttribute(name="OUTRAS-INFORMACOES")
	public String getOutrasInformacoes() {
		return outrasInformacoes;
	}
	public void setOutrasInformacoes(String outrasInformacoes) {
		this.outrasInformacoes = outrasInformacoes;
	}
	
	@XmlAttribute(name="FLAG-VINCULO-EMPREGATICIO")
	public String getFlagVinculoEmpregaticio() {
		return flagVinculoEmpregaticio;
	}
	public void setFlagVinculoEmpregaticio(String flagVinculoEmpregaticio) {
		this.flagVinculoEmpregaticio = flagVinculoEmpregaticio;
	}
	
	@XmlAttribute(name="OUTRO-VINCULO-INFORMADO")
	public String getOutroVinculoInformado() {
		return outroVinculoInformado;
	}
	public void setOutroVinculoInformado(String outroVinculoInformado) {
		this.outroVinculoInformado = outroVinculoInformado;
	}
	
	@XmlAttribute(name="OUTRO-ENQUADRAMENTO-FUNCIONAL-INFORMADO")
	public String getOutroEnquadramentoFuncionalInformado() {
		return outroEnquadramentoFuncionalInformado;
	}
	public void setOutroEnquadramentoFuncionalInformado(
			String outroEnquadramentoFuncionalInformado) {
		this.outroEnquadramentoFuncionalInformado = outroEnquadramentoFuncionalInformado;
	}
	
	@XmlAttribute(name="OUTRO-ENQUADRAMENTO-FUNCIONAL-INFORMADO-INGLES")
	public String getOutroEnquadramentoFuncionalInformadoIngles() {
		return outroEnquadramentoFuncionalInformadoIngles;
	}
	public void setOutroEnquadramentoFuncionalInformadoIngles(
			String outroEnquadramentoFuncionalInformadoIngles) {
		this.outroEnquadramentoFuncionalInformadoIngles = outroEnquadramentoFuncionalInformadoIngles;
	}
	
	@XmlAttribute(name="OUTRAS-INFORMACOES-INGLES")
	public String getOutrasInformacoesIngles() {
		return outrasInformacoesIngles;
	}
	public void setOutrasInformacoesIngles(String outrasInformacoesIngles) {
		this.outrasInformacoesIngles = outrasInformacoesIngles;
	}
}