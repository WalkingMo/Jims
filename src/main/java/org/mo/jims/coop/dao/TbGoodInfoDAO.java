package org.mo.jims.coop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mo.jims.coop.entity.GoodInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbGoodInfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see org.mo.jims.coop.entity.TbGoodInfo
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TbGoodInfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbGoodInfoDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String ABBREVIATION = "abbreviation";
	public static final String ORIGIN = "origin";
	public static final String UNIT_COST = "unitCost";
	public static final String PACK = "pack";
	public static final String APPROVAL_NUM = "approvalNum";
	public static final String BATCH_NUM = "batchNum";
	public static final String MEMO = "memo";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(GoodInfo transientInstance) {
		log.debug("saving TbGoodInfo instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(GoodInfo persistentInstance) {
		log.debug("deleting TbGoodInfo instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	
}