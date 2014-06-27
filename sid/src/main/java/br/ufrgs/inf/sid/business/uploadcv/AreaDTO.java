package br.ufrgs.inf.sid.business.uploadcv;

public class AreaDTO {
	
	private Integer[] ids;
	private String pessoaCode;
	private String solrData;
	private String cvData;

	public AreaDTO() {}

	public AreaDTO(Integer[] ids) {
		this.ids = ids;
	}
	public Integer[] getIds() {
		return ids;
	}
	public void setIds(Integer[] ids) {
		this.ids = ids;
	}
	public String getPessoaCode() {
		return pessoaCode;
	}
	public void setPessoaCode(String pessoaCode) {
		this.pessoaCode = pessoaCode;
	}
	public String getSolrData() {
		return solrData;
	}
	public void setSolrData(String solrData) {
		this.solrData = solrData;
	}
	public String getCvData() {
		return cvData;
	}
	public void setCvData(String cvData) {
		this.cvData = cvData;
	}
}