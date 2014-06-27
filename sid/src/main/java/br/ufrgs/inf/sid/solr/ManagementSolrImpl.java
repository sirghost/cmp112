package br.ufrgs.inf.sid.solr;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.params.ModifiableSolrParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("managementSolr")
public class ManagementSolrImpl implements ManagementSolr {

	private static Logger logger = Logger.getLogger(ManagementSolrImpl.class);
	@Autowired private SolrServer solr;

	public void saveAreaPesquisa(SidSolr area) {
		if(area == null)
			return;
		try {
			solr.addBean(area);
			solr.commit();
		} catch (IOException e) {			
			logger.error(e.getMessage());
			throw new RuntimeException();
		} catch (SolrServerException e) {
			logger.error(e.getMessage());
			throw new RuntimeException();
		}
	}

	public List<SidSolr> getAreasPesquisa(Set<String> search) {
		List<SidSolr> lstAreas = null;
		try{
			StringBuffer strQuery = new StringBuffer();
			if(search != null){
				String[] words = search.toArray(new String[search.size()]);
				int i;				
				int max = words.length;
				for(i = 0; i < max; i++){
					String word = words[i].trim();
					if(!"".equals(word)){
						word = word.replace(":", "");
						strQuery.append("text");
						strQuery.append(":");
						strQuery.append(word);
						if(word.length() > 4){
							strQuery.append("~2 ");
						}
						
						if((i+1) != max){
							strQuery.append(" OR ");
						}
					}
				}
			}
			ModifiableSolrParams params = new ModifiableSolrParams();			
			params.set("q", strQuery.toString());
			QueryResponse response = solr.query(params);
			lstAreas = response.getBeans(SidSolr.class);
Long totalAreas = response.getResults().getNumFound();
System.out.println("totalAreas: " + totalAreas);
		} catch (SolrServerException e) {
			logger.error(e.getMessage());
			throw new RuntimeException();
		}
		return lstAreas;
	}
}