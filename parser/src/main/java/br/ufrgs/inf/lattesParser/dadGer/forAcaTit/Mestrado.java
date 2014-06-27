package br.ufrgs.inf.lattesParser.dadGer.forAcaTit;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.areCon.AreasDoConhecimento;
import br.ufrgs.inf.lattesParser.common.PalavrasChave;
import br.ufrgs.inf.lattesParser.common.SetoresDeAtividade;

@XmlRootElement(name="MESTRADO")
public class Mestrado {
	
	private String sequenciaFormacao;
	private String nivel;
	private String codigoInstituicao;
	private String nomeInstituicao;
	private String codigoCurso;
	private String nomeCurso;
	private String codigoAreaCurso;
	private String statusDoCurso;
	private String anoDeInicio;
	private String anoDeConclusao;
	private String flagBolsa;
	private String tipoMestrado;
	private String codigoInstituicaoDout;
	private String nomeInstituicaoDout;
	private String codigoInstituicaoOutraDout;
	private String nomeInstituicaoOutraDout;
	private String nomeOrientadorDout;
	private String codigoFinancidora;
	private String nomeAgencia;
	private String anoDeObtencaoDoTitulo;
	private String tituloDaDissertacaoTese;
	private String nomeCompletoDoOrientador;
	private String numeroIdOrientador;
	private String codigoCursoCapes;
	private String tituloDaDissertacaTeseIngles;
	private String nomeCursoIngles;
	private String nomeDoCoOrientador;
	
	//TODO: Improve
	private PalavrasChave palavrasChave;
	private AreasDoConhecimento areasDoConhecimento;
	private SetoresDeAtividade setoresDeAtividade;
	
	@XmlAttribute(name="SEQUENCIA-FORMACAO")
	public String getSequenciaFormacao() {
		return sequenciaFormacao;
	}
	public void setSequenciaFormacao(String sequenciaFormacao) {
		this.sequenciaFormacao = sequenciaFormacao;
	}
	
	@XmlAttribute(name="NIVEL")
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
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
	
	@XmlAttribute(name="CODIGO-CURSO")
	public String getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	
	@XmlAttribute(name="NOME-CURSO")
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
	@XmlAttribute(name="CODIGO-AREA-CURSO")
	public String getCodigoAreaCurso() {
		return codigoAreaCurso;
	}
	public void setCodigoAreaCurso(String codigoAreaCurso) {
		this.codigoAreaCurso = codigoAreaCurso;
	}
	
	@XmlAttribute(name="STATUS-DO-CURSO")
	public String getStatusDoCurso() {
		return statusDoCurso;
	}
	public void setStatusDoCurso(String statusDoCurso) {
		this.statusDoCurso = statusDoCurso;
	}
	
	@XmlAttribute(name="ANO-DE-INICIO")
	public String getAnoDeInicio() {
		return anoDeInicio;
	}
	public void setAnoDeInicio(String anoDeInicio) {
		this.anoDeInicio = anoDeInicio;
	}
	
	@XmlAttribute(name="ANO-DE-CONCLUSAO")
	public String getAnoDeConclusao() {
		return anoDeConclusao;
	}
	public void setAnoDeConclusao(String anoDeConclusao) {
		this.anoDeConclusao = anoDeConclusao;
	}
	
	@XmlAttribute(name="FLAG-BOLSA")
	public String getFlagBolsa() {
		return flagBolsa;
	}
	public void setFlagBolsa(String flagBolsa) {
		this.flagBolsa = flagBolsa;
	}
	
	@XmlAttribute(name="TIPO-MESTRADO")
	public String getTipoMestrado() {
		return tipoMestrado;
	}
	public void setTipoMestrado(String tipoMestrado) {
		this.tipoMestrado = tipoMestrado;
	}
	
	@XmlAttribute(name="CODIGO-INSTITUICAO-DOUT")
	public String getCodigoInstituicaoDout() {
		return codigoInstituicaoDout;
	}
	public void setCodigoInstituicaoDout(String codigoInstituicaoDout) {
		this.codigoInstituicaoDout = codigoInstituicaoDout;
	}
	
	@XmlAttribute(name="NOME-INSTITUICAO-DOUT")
	public String getNomeInstituicaoDout() {
		return nomeInstituicaoDout;
	}
	public void setNomeInstituicaoDout(String nomeInstituicaoDout) {
		this.nomeInstituicaoDout = nomeInstituicaoDout;
	}

	@XmlAttribute(name="CODIGO-INSTITUICAO-OUTRA-DOUT")
	public String getCodigoInstituicaoOutraDout() {
		return codigoInstituicaoOutraDout;
	}
	public void setCodigoInstituicaoOutraDout(String codigoInstituicaoOutraDout) {
		this.codigoInstituicaoOutraDout = codigoInstituicaoOutraDout;
	}
	
	@XmlAttribute(name="NOME-INSTITUICAO-OUTRA-DOU")
	public String getNomeInstituicaoOutraDout() {
		return nomeInstituicaoOutraDout;
	}
	public void setNomeInstituicaoOutraDout(String nomeInstituicaoOutraDout) {
		this.nomeInstituicaoOutraDout = nomeInstituicaoOutraDout;
	}
	
	@XmlAttribute(name="NOME-ORIENTADOR-DOUT")
	public String getNomeOrientadorDout() {
		return nomeOrientadorDout;
	}
	public void setNomeOrientadorDout(String nomeOrientadorDout) {
		this.nomeOrientadorDout = nomeOrientadorDout;
	}
	
	@XmlAttribute(name="CODIGO-AGENCIA-FINANCIADORA")
	public String getCodigoFinancidora() {
		return codigoFinancidora;
	}
	public void setCodigoFinancidora(String codigoFinancidora) {
		this.codigoFinancidora = codigoFinancidora;
	}
	
	@XmlAttribute(name="NOME-AGENCIA")
	public String getNomeAgencia() {
		return nomeAgencia;
	}
	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}
	
	@XmlAttribute(name="ANO-DE-OBTENCAO-DO-TITULO")
	public String getAnoDeObtencaoDoTitulo() {
		return anoDeObtencaoDoTitulo;
	}
	public void setAnoDeObtencaoDoTitulo(String anoDeObtencaoDoTitulo) {
		this.anoDeObtencaoDoTitulo = anoDeObtencaoDoTitulo;
	}
	
	@XmlAttribute(name="TITULO-DA-DISSERTACAO-TESE")
	public String getTituloDaDissertacaoTese() {
		return tituloDaDissertacaoTese;
	}
	public void setTituloDaDissertacaoTese(String tituloDaDissertacaoTese) {
		this.tituloDaDissertacaoTese = tituloDaDissertacaoTese;
	}
	
	@XmlAttribute(name="NOME-COMPLETO-DO-ORIENTADOR")
	public String getNomeCompletoDoOrientador() {
		return nomeCompletoDoOrientador;
	}
	public void setNomeCompletoDoOrientador(String nomeCompletoDoOrientador) {
		this.nomeCompletoDoOrientador = nomeCompletoDoOrientador;
	}
	
	@XmlAttribute(name="NUMERO-ID-ORIENTADOR")
	public String getNumeroIdOrientador() {
		return numeroIdOrientador;
	}
	public void setNumeroIdOrientador(String numeroIdOrientador) {
		this.numeroIdOrientador = numeroIdOrientador;
	}
	
	@XmlAttribute(name="CODIGO-CURSO-CAPES")
	public String getCodigoCursoCapes() {
		return codigoCursoCapes;
	}
	public void setCodigoCursoCapes(String codigoCursoCapes) {
		this.codigoCursoCapes = codigoCursoCapes;
	}
	
	@XmlAttribute(name="TITULO-DA-DISSERTACAO-TESE-INGLES")
	public String getTituloDaDissertacaTeseIngles() {
		return tituloDaDissertacaTeseIngles;
	}
	public void setTituloDaDissertacaTeseIngles(String tituloDaDissertacaTeseIngles) {
		this.tituloDaDissertacaTeseIngles = tituloDaDissertacaTeseIngles;
	}
	
	@XmlAttribute(name="NOME-CURSO-INGLES")
	public String getNomeCursoIngles() {
		return nomeCursoIngles;
	}
	public void setNomeCursoIngles(String nomeCursoIngles) {
		this.nomeCursoIngles = nomeCursoIngles;
	}
	
	@XmlAttribute(name="NOME-DO-CO-ORIENTADOR")
	public String getNomeDoCoOrientador() {
		return nomeDoCoOrientador;
	}
	public void setNomeDoCoOrientador(String nomeDoCoOrientador) {
		this.nomeDoCoOrientador = nomeDoCoOrientador;
	}
	
	@XmlElement(name="PALAVRAS-CHAVE")
	public PalavrasChave getPalavrasChave() {
		return palavrasChave;
	}
	public void setPalavrasChave(PalavrasChave palavrasChave) {
		this.palavrasChave = palavrasChave;
	}
	
	@XmlElement(name="AREAS-DO-CONHECIMENTO")
	public AreasDoConhecimento getAreasDoConhecimento() {
		return areasDoConhecimento;
	}
	public void setAreasDoConhecimento(AreasDoConhecimento areasDoConhecimento) {
		this.areasDoConhecimento = areasDoConhecimento;
	}
	
	@XmlElement(name="SETORES-DE-ATIVIDADE")
	public SetoresDeAtividade getSetoresDeAtividade() {
		return setoresDeAtividade;
	}
	public void setSetoresDeAtividade(SetoresDeAtividade setoresDeAtividade) {
		this.setoresDeAtividade = setoresDeAtividade;
	}	
}