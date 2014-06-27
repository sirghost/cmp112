package br.ufrgs.inf.sid.business.util;

public enum ResultType {

	MESTRADO("Mestrado"),
	DOCTORADO("Doctorado"),
	AREAS_ATUACACO("Areas de Atuacao"),
	FORMACAO_COMPLEMENTAR("Formacao Complementar"),
	ARTIGOS_PUBLICACOS("Artigos Publicados");
	
	private String description;

	private ResultType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}