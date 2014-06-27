package br.ufrgs.inf.sid.solr;

import org.apache.solr.client.solrj.beans.Field;

public class SidSolr {

	@Field("area_id")
	private String areaId;
	
	@Field("nome")
	private String nome;
	
	@Field("grupo")
	private String grupo;
	
	@Field("subareas_pt")
	private String[] SubareasPt;
	
	@Field("subareas_en")
	private String[] SubareasEn;

	public SidSolr() {}

	public SidSolr(String areaId, String nome, String grupo,
			String[] subareasPt, String[] subareasEn) {
		this.areaId = areaId;
		this.nome = nome;
		this.grupo = grupo;
		SubareasPt = subareasPt;
		SubareasEn = subareasEn;
	}

	public String getAreaId() {
		return areaId;
	}
	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String[] getSubareasPt() {
		return SubareasPt;
	}
	public void setSubareasPt(String[] subareasPt) {
		SubareasPt = subareasPt;
	}

	public String[] getSubareasEn() {
		return SubareasEn;
	}
	public void setSubareasEn(String[] subareasEn) {
		SubareasEn = subareasEn;
	}	
}