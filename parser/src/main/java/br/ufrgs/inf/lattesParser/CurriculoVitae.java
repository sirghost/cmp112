package br.ufrgs.inf.lattesParser;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

import br.ufrgs.inf.lattesParser.dadCom.DadosComplementares;
import br.ufrgs.inf.lattesParser.dadGer.DadosGerais;
import br.ufrgs.inf.lattesParser.outPro.OutraProducao;
import br.ufrgs.inf.lattesParser.proBib.ProducaoBibliografica;
import br.ufrgs.inf.lattesParser.proTec.ProducaoTecnica;

/**
 * Created by jkmvsanchez on 5/9/14.
 *
 */
@XmlRootElement(name="CURRICULO-VITAE")
public class CurriculoVitae {
	
	private String sistemaOrigemXML;
	private String dataAtualizacao;
	private String horaAtualizacao;
	private String numeroIdentificador;
	
	private DadosGerais dadosGerais;
	private ProducaoBibliografica proBibliografica;
	private ProducaoTecnica producaoTecnica;
	private OutraProducao outraProducao;
	private DadosComplementares dadosComplementares;
	
	@XmlAttribute(name="SISTEMA-ORIGEM-XML")
	public String getSistemaOrigemXML() {
		return sistemaOrigemXML;
	}
	public void setSistemaOrigemXML(String sistemaOrigemXML) {
		this.sistemaOrigemXML = sistemaOrigemXML;
	}
	
	@XmlAttribute(name="DATA-ATUALIZACAO")
	public String getDataAtualizacao() {
		return dataAtualizacao;
	}
	public void setDataAtualizacao(String dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}
	
	@XmlAttribute(name="HORA-ATUALIZACAO")
	public String getHoraAtualizacao() {
		return horaAtualizacao;
	}
	public void setHoraAtualizacao(String horaAtualizacao) {
		this.horaAtualizacao = horaAtualizacao;
	}
	
	@XmlAttribute(name="NUMERO-IDENTIFICADOR")
	public String getNumeroIdentificador() {
		return numeroIdentificador;
	}
	public void setNumeroIdentificador(String numeroIdentificador) {
		this.numeroIdentificador = numeroIdentificador;
	}
	
	@XmlElement(name="DADOS-GERAIS")
	public DadosGerais getDadosGerais() {
		return dadosGerais;
	}
	public void setDadosGerais(DadosGerais dadosGerais) {
		this.dadosGerais = dadosGerais;
	}
	
	@XmlElement(name="PRODUCAO-BIBLIOGRAFICA")
	public ProducaoBibliografica getProBibliografica() {
		return proBibliografica;
	}
	public void setProBibliografica(ProducaoBibliografica proBibliografica) {
		this.proBibliografica = proBibliografica;
	}
	
	@XmlElement(name="PRODUCAO-TECNICA")
	public ProducaoTecnica getProducaoTecnica() {
		return producaoTecnica;
	}
	public void setProducaoTecnica(ProducaoTecnica producaoTecnica) {
		this.producaoTecnica = producaoTecnica;
	}
	
	@XmlElement(name="OUTRA-PRODUCAO")
	public OutraProducao getOutraProducao() {
		return outraProducao;
	}
	public void setOutraProducao(OutraProducao outraProducao) {
		this.outraProducao = outraProducao;
	}
	
	@XmlElement(name="DADOS-COMPLEMENTARES")
	public DadosComplementares getDadosComplementares() {
		return dadosComplementares;
	}
	public void setDadosComplementares(DadosComplementares dadosComplementares) {
		this.dadosComplementares = dadosComplementares;
	}
}