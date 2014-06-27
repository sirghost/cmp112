package br.ufrgs.inf.lattesParser.proBib;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PRODUCAO-BIBLIOGRAFICA")
public class ProducaoBibliografica {
	
	private TrabalhosEmEventos trabalhosEmEventos;
	private ArtigosPublicados artigosPublicados;
	private LivrosCapitulos livrosCapitulos;
	private TextosEmJornaisOuRevistas textosJornaisRevistas;
	private DemaisTiposDeProducaoBibliografica outraProducaoBibliografica;

	@XmlElement(name="TRABALHOS-EM-EVENTOS")
	public TrabalhosEmEventos getTrabalhosEmEventos() {
		return trabalhosEmEventos;
	}
	public void setTrabalhosEmEventos(TrabalhosEmEventos trabalhosEmEventos) {
		this.trabalhosEmEventos = trabalhosEmEventos;
	}
	
	@XmlElement(name="ARTIGOS-PUBLICADOS")
	public ArtigosPublicados getArtigosPublicados() {
		return artigosPublicados;
	}
	public void setArtigosPublicados(ArtigosPublicados artigosPublicados) {
		this.artigosPublicados = artigosPublicados;
	}
	
	@XmlElement(name="LIVROS-E-CAPITULOS")
	public LivrosCapitulos getLivrosCapitulos() {
		return livrosCapitulos;
	}
	public void setLivrosCapitulos(LivrosCapitulos livrosCapitulos) {
		this.livrosCapitulos = livrosCapitulos;
	}
	
	@XmlElement(name="TEXTOS-EM-JORNAIS-OU-REVISTAS")
	public TextosEmJornaisOuRevistas getTextosJornaisRevistas() {
		return textosJornaisRevistas;
	}
	public void setTextosJornaisRevistas(
			TextosEmJornaisOuRevistas textosJornaisRevistas) {
		this.textosJornaisRevistas = textosJornaisRevistas;
	}
	
	@XmlElement(name="DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA")
	public DemaisTiposDeProducaoBibliografica getOutraProducaoBibliografica() {
		return outraProducaoBibliografica;
	}
	public void setOutraProducaoBibliografica(
			DemaisTiposDeProducaoBibliografica outraProducaoBibliografica) {
		this.outraProducaoBibliografica = outraProducaoBibliografica;
	}	
}