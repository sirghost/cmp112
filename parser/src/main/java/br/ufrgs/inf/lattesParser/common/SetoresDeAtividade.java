package br.ufrgs.inf.lattesParser.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="SETORES-DE-ATIVIDADE")
public class SetoresDeAtividade {

	private String setorDeAtividade1;
	private String setorDeAtividade2;
	private String setorDeAtividade3;
	
	@XmlAttribute(name="SETOR-DE-ATIVIDADE-1")
	public String getSetorDeAtividade1() {
		return setorDeAtividade1;
	}
	public void setSetorDeAtividade1(String setorDeAtividade1) {
		this.setorDeAtividade1 = setorDeAtividade1;
	}
	
	@XmlAttribute(name="SETOR-DE-ATIVIDADE-2")
	public String getSetorDeAtividade2() {
		return setorDeAtividade2;
	}
	public void setSetorDeAtividade2(String setorDeAtividade2) {
		this.setorDeAtividade2 = setorDeAtividade2;
	}
	
	@XmlAttribute(name="SETOR-DE-ATIVIDADE-3")
	public String getSetorDeAtividade3() {
		return setorDeAtividade3;
	}
	public void setSetorDeAtividade3(String setorDeAtividade3) {
		this.setorDeAtividade3 = setorDeAtividade3;
	}
}