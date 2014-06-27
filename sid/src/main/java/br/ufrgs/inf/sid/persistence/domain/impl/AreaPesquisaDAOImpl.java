package br.ufrgs.inf.sid.persistence.domain.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.ufrgs.inf.sid.persistence.AbstractHibernateDAO;
import br.ufrgs.inf.sid.persistence.domain.AreaPesquisaDAO;
import br.ufrgs.inf.sid.persistence.model.AreaPesquisa;
import br.ufrgs.inf.sid.persistence.model.Pessoa;

@Repository("areaPesquisaDAO")
@Transactional
public class AreaPesquisaDAOImpl extends AbstractHibernateDAO<AreaPesquisa> implements AreaPesquisaDAO {

	public AreaPesquisaDAOImpl() {
		setClazz(AreaPesquisa.class);
	}

	public AreaPesquisa getAreaPesquisaById(Integer id) {
		Criteria criteria = getCurrentSession().createCriteria(AreaPesquisa.class);
		criteria.add(Restrictions.eq("id", id));
		return (AreaPesquisa)criteria.uniqueResult();
	}	
	
	public void saveAreaPesquisa(AreaPesquisa areaPesquisa) {
		save(areaPesquisa);		
	}
}