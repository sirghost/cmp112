package br.ufrgs.inf.sid.solr;

import java.util.List;
import java.util.Set;

public interface ManagementSolr {
	public void saveAreaPesquisa(SidSolr area);
	public List<SidSolr> getAreasPesquisa(Set<String> search);
}