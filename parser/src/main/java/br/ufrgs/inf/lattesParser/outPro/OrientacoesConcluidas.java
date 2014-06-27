package br.ufrgs.inf.lattesParser.outPro;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.outPro.oriDou.OrientacoesConcluidasParaDoutorado;
import br.ufrgs.inf.lattesParser.outPro.oriMes.OrientacoesConcluidasParaMestrado;
import br.ufrgs.inf.lattesParser.outPro.oriPosDou.OrientacoesConcluidasParaPosDoutorado;
import br.ufrgs.inf.lattesParser.outPro.outOri.OutrasOrientacoesConcluidas;

@XmlRootElement(name="ORIENTACOES-CONCLUIDAS")
public class OrientacoesConcluidas {
	
	private ArrayList<OrientacoesConcluidasParaMestrado> oriConcluidasParaMestrado;
	private ArrayList<OrientacoesConcluidasParaDoutorado> oriConcluidasParaDoutorado;
	private ArrayList<OrientacoesConcluidasParaPosDoutorado> oriConcluidasParaPosDoutorado;
	private ArrayList<OutrasOrientacoesConcluidas> outConcluidas;
	
	@XmlElement(name="ORIENTACOES-CONCLUIDAS-PARA-MESTRADO")
	public ArrayList<OrientacoesConcluidasParaMestrado> getOriConcluidasParaMestrado() {
		return oriConcluidasParaMestrado;
	}
	public void setOriConcluidasParaMestrado(
			ArrayList<OrientacoesConcluidasParaMestrado> oriConcluidasParaMestrado) {
		this.oriConcluidasParaMestrado = oriConcluidasParaMestrado;
	}
	
	@XmlElement(name="ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO")
	public ArrayList<OrientacoesConcluidasParaDoutorado> getOriConcluidasParaDoutorado() {
		return oriConcluidasParaDoutorado;
	}
	public void setOriConcluidasParaDoutorado(
			ArrayList<OrientacoesConcluidasParaDoutorado> oriConcluidasParaDoutorado) {
		this.oriConcluidasParaDoutorado = oriConcluidasParaDoutorado;
	}
	
	@XmlElement(name="ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
	public ArrayList<OrientacoesConcluidasParaPosDoutorado> getOriConcluidasParaPosDoutorado() {
		return oriConcluidasParaPosDoutorado;
	}
	public void setOriConcluidasParaPosDoutorado(
			ArrayList<OrientacoesConcluidasParaPosDoutorado> oriConcluidasParaPosDoutorado) {
		this.oriConcluidasParaPosDoutorado = oriConcluidasParaPosDoutorado;
	}
	
	@XmlElement(name="OUTRAS-ORIENTACOES-CONCLUIDAS")
	public ArrayList<OutrasOrientacoesConcluidas> getOutConcluidas() {
		return outConcluidas;
	}
	public void setOutConcluidas(
			ArrayList<OutrasOrientacoesConcluidas> outConcluidas) {
		this.outConcluidas = outConcluidas;
	}	
}