package br.ufrgs.inf.lattesParser.outPro.outOri;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.common.DocumentoProducao;

//TODO: no autores
@XmlRootElement(name="OUTRAS-ORIENTACOES-CONCLUIDAS")
public class OutrasOrientacoesConcluidas extends DocumentoProducao {
	
	private DadBasDeOutrasOrientacoesConcluidas dadBasOutrasOrientacoesConcluidas;
	private DetDeOutrasOrientacoesConcluidas detOutrasOrientacoesConcluidas;
	
	@XmlElement(name = "DADOS-BASICOS-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
	public DadBasDeOutrasOrientacoesConcluidas getDadBasOutrasOrientacoesConcluidas() {
		return dadBasOutrasOrientacoesConcluidas;
	}
	public void setDadBasOutrasOrientacoesConcluidas(
			DadBasDeOutrasOrientacoesConcluidas dadBasOutrasOrientacoesConcluidas) {
		this.dadBasOutrasOrientacoesConcluidas = dadBasOutrasOrientacoesConcluidas;
	}
	
	@XmlElement(name = "DETALHAMENTO-DE-OUTRAS-ORIENTACOES-CONCLUIDAS")
	public DetDeOutrasOrientacoesConcluidas getDetOutrasOrientacoesConcluidas() {
		return detOutrasOrientacoesConcluidas;
	}
	public void setDetOutrasOrientacoesConcluidas(
			DetDeOutrasOrientacoesConcluidas detOutrasOrientacoesConcluidas) {
		this.detOutrasOrientacoesConcluidas = detOutrasOrientacoesConcluidas;
	}
}