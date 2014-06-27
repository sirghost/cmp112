package br.ufrgs.inf.lattesParser.proTec.outProTec;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DETALHAMENTO-DE-EDITORACAO")
public class DetalhamentoDeEditoracao {
	
	private String numeroDePaginas;
	private String instituicaoPromotora;
	private String editora;
	private String cidade;
	
	@XmlAttribute(name="NUMERO-DE-PAGINAS")
	public String getNumeroDePaginas() {
		return numeroDePaginas;
	}
	public void setNumeroDePaginas(String numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	@XmlAttribute(name="INSTITUICAO-PROMOTORA")
	public String getInstituicaoPromotora() {
		return instituicaoPromotora;
	}
	public void setInstituicaoPromotora(String instituicaoPromotora) {
		this.instituicaoPromotora = instituicaoPromotora;
	}
	
	@XmlAttribute(name="EDITORA")
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	@XmlAttribute(name="CIDADE")
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
}