package org.mo.jims.coop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mo.jims.coop.entity.ProviderInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbProviderInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see org.mo.jims.coop.entity.TbProviderInfo
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TbProviderInfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbProviderInfoDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String ABBREVIATION = "abbreviation";
	public static final String ADDRESS = "address";
	public static final String POSTAL_CODE = "postalCode";
	public static final String PHONE = "phone";
	public static final String FAX = "fax";
	public static final String CONTACTS = "contacts";
	public static final String TELEPHONE = "telephone";
	public static final String DEPOSIT_BANK = "depositBank";
	public static final String EMAIL = "email";

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

	public void save(ProviderInfo transientInstance) {
		log.debug("saving TbProviderInfo instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(ProviderInfo persistentInstance) {
		log.debug("deleting TbProviderInfo instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

}