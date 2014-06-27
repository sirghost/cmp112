package br.ufrgs.inf.lattesParser.proTec;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import br.ufrgs.inf.lattesParser.proTec.outProTec.ApresentacaoDeTrabalho;
import br.ufrgs.inf.lattesParser.proTec.outProTec.DesDeMaterialDidacticoOuInstruccional;
import br.ufrgs.inf.lattesParser.proTec.outProTec.Editoracao;
import br.ufrgs.inf.lattesParser.proTec.outProTec.OrganizacaoDeEvento;

@XmlRootElement(name="DEMAIS-TIPOS-DE-PRODUCAO-TECNICA")
public class DemaisTiposDeProducaoTenica {

	private ArrayList<ApresentacaoDeTrabalho> apresentacaoTrabalhos;
	//DesenvolvimentoDeMaterialDidacticoOuInstruccional
	private ArrayList<DesDeMaterialDidacticoOuInstruccional> desDidacticoOuInstruccional;
	private ArrayList<Editoracao> editoracao;
	private ArrayList<OrganizacaoDeEvento> organizacaoEventos;
	
	@XmlElement(name = "APRESENTACAO-DE-TRABALHO")
	public ArrayList<ApresentacaoDeTrabalho> getApresentacaoTrabalhos() {
		return apresentacaoTrabalhos;
	}
	public void setApresentacaoTrabalhos(
			ArrayList<ApresentacaoDeTrabalho> apresentacaoTrabalhos) {
		this.apresentacaoTrabalhos = apresentacaoTrabalhos;
	}
	
	@XmlElement(name = "DESENVOLVIMENTO-DE-MATERIAL-DIDATICO-OU-INSTRUCIONAL")
	public ArrayList<DesDeMaterialDidacticoOuInstruccional> getDesDidacticoOuInstruccional() {
		return desDidacticoOuInstruccional;
	}
	public void setDesDidacticoOuInstruccional(
			ArrayList<DesDeMaterialDidacticoOuInstruccional> desDidacticoOuInstruccional) {
		this.desDidacticoOuInstruccional = desDidacticoOuInstruccional;
	}
	
	@XmlElement(name = "EDITORACAO")
	public ArrayList<Editoracao> getEditoracao() {
		return editoracao;
	}
	public void setEditoracao(ArrayList<Editoracao> editoracao) {
		this.editoracao = editoracao;
	}
	
	@XmlElement(name = "ORGANIZACAO-DE-EVENTO")
	public ArrayList<OrganizacaoDeEvento> getOrganizacaoEventos() {
		return organizacaoEventos;
	}
	public void setOrganizacaoEventos(
			ArrayList<OrganizacaoDeEvento> organizacaoEventos) {
		this.organizacaoEventos = organizacaoEventos;
	}
}