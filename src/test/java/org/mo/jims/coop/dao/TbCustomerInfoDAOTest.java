package org.mo.jims.coop.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mo.jims.coop.entity.CustomerInfo;
import org.mo.open.common.util.BaseTest;
import org.springframework.beans.factory.annotation.Autowired;

public class TbCustomerInfoDAOTest extends BaseTest {

	@Autowired
	private TbCustomerInfoDAO dao;
	@Test
	public void testSave() {
		CustomerInfo transientInstance = new CustomerInfo("12", "123", "12", "123", "312", "312", "3123", "132", "312", "123", "123");
		dao.save(transientInstance );
	}

	@Test
	public void testDelete() {
	}

}
