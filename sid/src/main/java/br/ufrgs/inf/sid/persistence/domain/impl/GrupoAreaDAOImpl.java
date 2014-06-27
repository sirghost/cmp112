package br.ufrgs.inf.sid.persistence.domain.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.ufrgs.inf.sid.persistence.AbstractHibernateDAO;
import br.ufrgs.inf.sid.persistence.domain.GrupoAreaDAO;
import br.ufrgs.inf.sid.persistence.model.GrupoArea;

@Repository("grupoAreaDAO")
@Transactional
public class GrupoAreaDAOImpl extends AbstractHibernateDAO<GrupoArea> implements GrupoAreaDAO {

	public GrupoAreaDAOImpl() {
		setClazz(GrupoArea.class);
	}

	public void saveGrupoArea(GrupoArea grupoArea) {
		save(grupoArea);		
	}
}