package br.ufrgs.inf.sid.business.uploadcv;

public class ResultDTO {
	
	private String type;
	private String texto;
	
	public ResultDTO(String type, String texto) {
		this.type = type;
		this.texto = texto;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
}