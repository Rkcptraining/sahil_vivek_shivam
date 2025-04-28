package com.facebookweb.service;

import com.facebookweb.dao.FacebookDAO;
import com.facebookweb.dao.FacebookDAOInterface;
import com.facebookweb.entity.FacebookUser;

public class FacebookService implements FacebookServiceInterface {

	@Override
	public int createProfileService(FacebookUser fb) {
		FacebookDAOInterface fDao=new FacebookDAO();
		return fDao.createProfileDAO(fb);
	}

	@Override
	public boolean loginUserService(FacebookUser f) {
		FacebookDAOInterface fDao=new FacebookDAO();
		return fDao.loginUserDAO(f);
	}

	@Override
	public FacebookUser viewProfileService(FacebookUser fb) {
		FacebookDAOInterface fDao=new FacebookDAO();
		return fDao.viewUserDAO(fb);
	}

	@Override
	public int editProfileService(FacebookUser fb) {
		FacebookDAOInterface fDao=new FacebookDAO();
		return fDao.editProfileDAO(fb);
	}

}
