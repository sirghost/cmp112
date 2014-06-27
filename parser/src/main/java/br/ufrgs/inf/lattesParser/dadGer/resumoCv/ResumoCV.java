package br.ufrgs.inf.lattesParser.dadGer.resumoCv;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RESUMO-CV")
public class ResumoCV {
	
	private String textoResumoCvRh;
	private String textoResumoCvRhEn;
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH")
	public String getTextoResumoCvRh() {
		return textoResumoCvRh;
	}
	public void setTextoResumoCvRh(String textoResumoCvRh) {
		this.textoResumoCvRh = textoResumoCvRh;
	}
	
	@XmlAttribute(name="TEXTO-RESUMO-CV-RH-EN")
	public String getTextoResumoCvRhEn() {
		return textoResumoCvRhEn;
	}
	public void setTextoResumoCvRhEn(String textoResumoCvRhEn) {
		this.textoResumoCvRhEn = textoResumoCvRhEn;
	}
}