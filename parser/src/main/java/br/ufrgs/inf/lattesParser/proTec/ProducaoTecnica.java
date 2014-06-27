package br.ufrgs.inf.lattesParser.proTec;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PRODUCAO-TECNICA")
public class ProducaoTecnica {
	
	private ArrayList<TrabalhoTecnico> trabalhosTecnicos;
	private DemaisTiposDeProducaoTenica outraProducaoTecnica;
	
	@XmlElement(name="TRABALHO-TECNICO")
	public ArrayList<TrabalhoTecnico> getTrabalhosTecnicos() {
		return trabalhosTecnicos;
	}
	public void setTrabalhosTecnicos(ArrayList<TrabalhoTecnico> trabalhosTecnicos) {
		this.trabalhosTecnicos = trabalhosTecnicos;
	}	
	
	@XmlElement(name="DEMAIS-TIPOS-DE-PRODUCAO-TECNICA")
	public DemaisTiposDeProducaoTenica getOutraProducaoTecnica() {
		return outraProducaoTecnica;
	}
	public void setOutraProducaoTecnica(
			DemaisTiposDeProducaoTenica outraProducaoTecnica) {
		this.outraProducaoTecnica = outraProducaoTecnica;
	}
}