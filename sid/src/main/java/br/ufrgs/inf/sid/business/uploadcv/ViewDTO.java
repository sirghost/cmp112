package br.ufrgs.inf.sid.business.uploadcv;

import java.util.List;

import br.ufrgs.inf.sid.solr.SidSolr;

public class ViewDTO {

	private List<SidSolr> solrData;
	private List<ResultDTO> cvData;
	
	public ViewDTO(List<SidSolr> solrData, List<ResultDTO> cvData) {
		this.solrData = solrData;
		this.cvData = cvData;
	}
	
	public List<SidSolr> getSolrData() {
		return solrData;
	}
	public void setSolrData(List<SidSolr> solrData) {
		this.solrData = solrData;
	}
	public List<ResultDTO> getCvData() {
		return cvData;
	}
	public void setCvData(List<ResultDTO> cvData) {
		this.cvData = cvData;
	}
}