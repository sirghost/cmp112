package br.ufrgs.inf.lattesParser.dadGer.idiomas;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="IDIOMA")
public class Idioma {

	private String idioma;
	private String descricaoDoIdioma;
	private String proficienciaDeLeitura;
	private String proficienciaDeFala;
	private String proficienciaDeEscrita;
	private String proficienciaDeCompreensao;
	
	@XmlAttribute(name="IDIOMA")
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	@XmlAttribute(name="DESCRICAO-DO-IDIOMA")
	public String getDescricaoDoIdioma() {
		return descricaoDoIdioma;
	}
	public void setDescricaoDoIdioma(String descricaoDoIdioma) {
		this.descricaoDoIdioma = descricaoDoIdioma;
	}
	
	@XmlAttribute(name="PROFICIENCIA-DE-LEITURA")
	public String getProficienciaDeLeitura() {
		return proficienciaDeLeitura;
	}
	public void setProficienciaDeLeitura(String proficienciaDeLeitura) {
		this.proficienciaDeLeitura = proficienciaDeLeitura;
	}
	
	@XmlAttribute(name="PROFICIENCIA-DE-FALA")
	public String getProficienciaDeFala() {
		return proficienciaDeFala;
	}
	public void setProficienciaDeFala(String proficienciaDeFala) {
		this.proficienciaDeFala = proficienciaDeFala;
	}
	
	@XmlAttribute(name="PROFICIENCIA-DE-ESCRITA")
	public String getProficienciaDeEscrita() {
		return proficienciaDeEscrita;
	}
	public void setProficienciaDeEscrita(String proficienciaDeEscrita) {
		this.proficienciaDeEscrita = proficienciaDeEscrita;
	}
	
	@XmlAttribute(name="PROFICIENCIA-DE-COMPREENSAO")
	public String getProficienciaDeCompreensao() {
		return proficienciaDeCompreensao;
	}
	public void setProficienciaDeCompreensao(String proficienciaDeCompreensao) {
		this.proficienciaDeCompreensao = proficienciaDeCompreensao;
	}
}