package com.springmvc.eshop.dao;

import java.util.List;

import com.springmvc.eshop.domain.EshopUser;

public interface RegistrationDao {

	boolean register(EshopUser user);

	boolean updateProfile(EshopUser user);

	List<EshopUser> getAllRegistrations();

	EshopUser getProfile(String userName);

}
