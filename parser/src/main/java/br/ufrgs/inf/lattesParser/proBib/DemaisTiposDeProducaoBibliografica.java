package br.ufrgs.inf.lattesParser.proBib;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.proBib.outProdBib.OutraProducacaoBibliografica;

@XmlRootElement(name="DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA")
public class DemaisTiposDeProducaoBibliografica {
	
	private ArrayList<OutraProducacaoBibliografica> outrasProducacaoBibliograficas;

	@XmlElement(name="OUTRA-PRODUCAO-BIBLIOGRAFICA")
	public ArrayList<OutraProducacaoBibliografica> getOutrasProducacaoBibliograficas() {
		return outrasProducacaoBibliograficas;
	}
	public void setOutrasProducacaoBibliograficas(
			ArrayList<OutraProducacaoBibliografica> outrasProducacaoBibliograficas) {
		this.outrasProducacaoBibliograficas = outrasProducacaoBibliograficas;
	}
	
	

}