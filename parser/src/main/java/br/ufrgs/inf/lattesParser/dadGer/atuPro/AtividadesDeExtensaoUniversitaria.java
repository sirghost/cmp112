package br.ufrgs.inf.lattesParser.dadGer.atuPro;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ATIVIDADES-DE-EXTENSAO-UNIVERSITARIA")
public class AtividadesDeExtensaoUniversitaria {
	
	private ExtensaoUniversitaria extensaoUniversitaria;

	@XmlElement(name = "EXTENSAO-UNIVERSITARIA")
	public ExtensaoUniversitaria getExtensaoUniversitaria() {
		return extensaoUniversitaria;
	}
	public void setExtensaoUniversitaria(ExtensaoUniversitaria extensaoUniversitaria) {
		this.extensaoUniversitaria = extensaoUniversitaria;
	}
}