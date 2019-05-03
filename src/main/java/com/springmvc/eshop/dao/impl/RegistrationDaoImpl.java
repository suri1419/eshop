package com.springmvc.eshop.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.springmvc.eshop.dao.RegistrationDao;
import com.springmvc.eshop.domain.EshopUser;
import com.springmvc.eshop.service.impl.RegistrationServiceImpl;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

	private Map<String, EshopUser> usersMap = new HashMap<String, EshopUser>();
	private static final Logger logger = LoggerFactory.getLogger(RegistrationServiceImpl.class);
	@Override
	public boolean register(EshopUser user) {
		usersMap.put(user.getUserName(), user);
		logger.info("User added succussfully...");
		return true;
	}

	@Override
	public boolean updateProfile(EshopUser user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<EshopUser> getAllRegistrations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EshopUser getProfile(String userName) {
		if (usersMap.containsKey(userName)) {
			logger.info("User exists and returning the user with username:" + userName);
			return usersMap.get(userName);
		}
		logger.info("User search failed. User doesnt exists with username:" + userName);
		return null;
	}

}
