package br.ufrgs.inf.sid.business.populate;

import br.ufrgs.inf.sid.business.util.Message;
import br.ufrgs.inf.sid.persistence.model.Pessoa;

public interface Populate {
	public void savePessoa(Pessoa pessoa);
	public Message updatePessoaWithAreas(String pessoaCode, Integer[] areaIds);
	public void populateWithACMData();
}