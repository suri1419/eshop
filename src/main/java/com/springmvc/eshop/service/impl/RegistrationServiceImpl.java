package com.springmvc.eshop.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.eshop.dao.RegistrationDao;
import com.springmvc.eshop.domain.EshopUser;
import com.springmvc.eshop.service.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	private static final Logger logger = LoggerFactory.getLogger(RegistrationServiceImpl.class);
	@Autowired
	private RegistrationDao registrationDao;

	@Override
	public boolean register(EshopUser user) {
		// verify whether user exists (username, email)
		EshopUser daoUser = registrationDao.getProfile(user.getUserName());
		if (null == daoUser) {
			registrationDao.register(user);
			logger.info("user registered successfuly..");
			return true;
		} else {
			// if not call the persistence layer to insert
			// if exists throw error.

			logger.info("user exists with the username. registration failed");
		}
		return false;

	}

}
