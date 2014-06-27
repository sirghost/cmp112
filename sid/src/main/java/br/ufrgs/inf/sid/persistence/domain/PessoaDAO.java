package br.ufrgs.inf.sid.persistence.domain;

import br.ufrgs.inf.sid.persistence.model.Pessoa;

public interface PessoaDAO {
	public Pessoa getPessoaByCode(String code);
	public void savePessoa(Pessoa pessoa);
	public void updatePessoa(Pessoa pessoa);
}