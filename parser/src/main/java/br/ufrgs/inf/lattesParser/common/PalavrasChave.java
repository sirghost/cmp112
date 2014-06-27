package br.ufrgs.inf.lattesParser.common;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="PALAVRAS-CHAVE")
public class PalavrasChave {
	
	private String palavraChave1;
	private String palavraChave2;
	private String palavraChave3;
	private String palavraChave4;
	private String palavraChave5;
	private String palavraChave6;
	
	@XmlAttribute(name="PALAVRA-CHAVE-1")
	public String getPalavraChave1() {
		return palavraChave1;
	}
	public void setPalavraChave1(String palavraChave1) {
		this.palavraChave1 = palavraChave1;
	}
	
	@XmlAttribute(name="PALAVRA-CHAVE-2")
	public String getPalavraChave2() {
		return palavraChave2;
	}
	public void setPalavraChave2(String palavraChave2) {
		this.palavraChave2 = palavraChave2;
	}
	
	@XmlAttribute(name="PALAVRA-CHAVE-3")
	public String getPalavraChave3() {
		return palavraChave3;
	}
	public void setPalavraChave3(String palavraChave3) {
		this.palavraChave3 = palavraChave3;
	}
	
	@XmlAttribute(name="PALAVRA-CHAVE-4")
	public String getPalavraChave4() {
		return palavraChave4;
	}
	public void setPalavraChave4(String palavraChave4) {
		this.palavraChave4 = palavraChave4;
	}
	
	@XmlAttribute(name="PALAVRA-CHAVE-5")
	public String getPalavraChave5() {
		return palavraChave5;
	}
	public void setPalavraChave5(String palavraChave5) {
		this.palavraChave5 = palavraChave5;
	}
	
	@XmlAttribute(name="PALAVRA-CHAVE-6")
	public String getPalavraChave6() {
		return palavraChave6;
	}
	public void setPalavraChave6(String palavraChave6) {
		this.palavraChave6 = palavraChave6;
	}
}