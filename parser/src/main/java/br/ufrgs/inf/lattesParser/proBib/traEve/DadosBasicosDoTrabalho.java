package br.ufrgs.inf.lattesParser.proBib.traEve;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DadosBasicosProducao;

@XmlRootElement(name="DADOS-BASICOS-DO-TRABALHO")
public class DadosBasicosDoTrabalho extends DadosBasicosProducao {

	private String natureza;
	private String tituloDoTrabalho;
	private String anoDoTrabalho;
	private String paisDoEvento;
	private String tituloDoTrabalhoIngles;
	
	@XmlAttribute(name="NATUREZA")
	public String getNatureza() {
		return natureza;
	}
	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}
	
	@XmlAttribute(name="TITULO-DO-TRABALHO")
	public String getTituloDoTrabalho() {
		return tituloDoTrabalho;
	}
	public void setTituloDoTrabalho(String tituloDoTrabalho) {
		this.tituloDoTrabalho = tituloDoTrabalho;
	}
	
	@XmlAttribute(name="ANO-DO-TRABALHO")
	public String getAnoDoTrabalho() {
		return anoDoTrabalho;
	}
	public void setAnoDoTrabalho(String anoDoTrabalho) {
		this.anoDoTrabalho = anoDoTrabalho;
	}
	
	@XmlAttribute(name="PAIS-DO-EVENTO")
	public String getPaisDoEvento() {
		return paisDoEvento;
	}
	public void setPaisDoEvento(String paisDoEvento) {
		this.paisDoEvento = paisDoEvento;
	}
	
	@XmlAttribute(name="TITULO-DO-TRABALHO-INGLES")
	public String getTituloDoTrabalhoIngles() {
		return tituloDoTrabalhoIngles;
	}
	public void setTituloDoTrabalhoIngles(String tituloDoTrabalhoIngles) {
		this.tituloDoTrabalhoIngles = tituloDoTrabalhoIngles;
	}
}