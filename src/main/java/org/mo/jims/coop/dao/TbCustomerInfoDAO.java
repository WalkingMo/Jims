package org.mo.jims.coop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mo.jims.coop.entity.CustomerInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

/**
 * A data access object (DAO) providing persistence and search support for
 * TbCustomerInfo entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see org.mo.jims.coop.entity.TbCustomerInfo
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TbCustomerInfoDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TbCustomerInfoDAO.class);
	// property constants
	public static final String NAME = "name";
	public static final String ABBREVIATION = "abbreviation";
	public static final String ADDRESS = "address";
	public static final String POSTAL_CODE = "postalCode";
	public static final String PHONE = "phone";
	public static final String FAX = "fax";
	public static final String CONTACTS = "contacts";
	public static final String TELEPHONE = "telephone";
	public static final String EMAIL = "email";
	public static final String DEPOSIT_BANK = "depositBank";
	public static final String ACCOUNT_BANK = "accountBank";

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

	public void save(CustomerInfo transientInstance) {
		log.debug("saving TbCustomerInfo instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(CustomerInfo persistentInstance) {
		log.debug("deleting TbCustomerInfo instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	
}