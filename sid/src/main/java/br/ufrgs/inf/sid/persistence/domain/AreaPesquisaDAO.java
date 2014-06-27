package br.ufrgs.inf.sid.persistence.domain;

import br.ufrgs.inf.sid.persistence.model.AreaPesquisa;

public interface AreaPesquisaDAO {
	public AreaPesquisa getAreaPesquisaById(Integer id);
	public void saveAreaPesquisa(AreaPesquisa areaPesquisa);
}