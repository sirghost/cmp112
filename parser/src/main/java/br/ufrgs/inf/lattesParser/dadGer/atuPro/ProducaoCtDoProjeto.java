package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PRODUCAO-CT-DO-PROJETO")
public class ProducaoCtDoProjeto {
	
	private String sequenciaProducaoCt;
	private String tituloDaProducaoCt;
	private String tipoProducaoCt;
	private String tituloDaProducaoCtIngles;
	
	@XmlAttribute(name = "SEQUENCIA-PRODUCAO-CT")
	public String getSequenciaProducaoCt() {
		return sequenciaProducaoCt;
	}
	public void setSequenciaProducaoCt(String sequenciaProducaoCt) {
		this.sequenciaProducaoCt = sequenciaProducaoCt;
	}
	
	@XmlAttribute(name = "TITULO-DA-PRODUCAO-CT")
	public String getTituloDaProducaoCt() {
		return tituloDaProducaoCt;
	}
	public void setTituloDaProducaoCt(String tituloDaProducaoCt) {
		this.tituloDaProducaoCt = tituloDaProducaoCt;
	}
	
	@XmlAttribute(name = "TIPO-PRODUCAO-CT")
	public String getTipoProducaoCt() {
		return tipoProducaoCt;
	}
	public void setTipoProducaoCt(String tipoProducaoCt) {
		this.tipoProducaoCt = tipoProducaoCt;
	}
	
	@XmlAttribute(name = "TITULO-DA-PRODUCAO-CT-INGLES")
	public String getTituloDaProducaoCtIngles() {
		return tituloDaProducaoCtIngles;
	}
	public void setTituloDaProducaoCtIngles(String tituloDaProducaoCtIngles) {
		this.tituloDaProducaoCtIngles = tituloDaProducaoCtIngles;
	}
}