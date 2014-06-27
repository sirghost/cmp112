package br.ufrgs.inf.sid.persistence.domain.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.ufrgs.inf.sid.persistence.AbstractHibernateDAO;
import br.ufrgs.inf.sid.persistence.domain.PessoaDAO;
import br.ufrgs.inf.sid.persistence.model.Pessoa;

@Repository("pessoaDAO")
@Transactional
public class PessoaDAOImpl extends AbstractHibernateDAO<Pessoa> implements PessoaDAO {

	public PessoaDAOImpl() {
		setClazz(Pessoa.class);
	}

	public Pessoa getPessoaByCode(String code) {
		Criteria criteria = getCurrentSession().createCriteria(Pessoa.class);
		criteria.add(Restrictions.eq("code", code));
		return (Pessoa)criteria.uniqueResult();
	}
	
	public void savePessoa(Pessoa pessoa) {
		save(pessoa);
	}

	public void updatePessoa(Pessoa pessoa) {
		update(pessoa);
	}
}