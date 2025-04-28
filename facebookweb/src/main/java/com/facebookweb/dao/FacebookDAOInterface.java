package com.facebookweb.dao;

import com.facebookweb.entity.FacebookUser;

public interface FacebookDAOInterface {

	int createProfileDAO(FacebookUser fb);

	boolean loginUserDAO(FacebookUser f);

	FacebookUser viewUserDAO(FacebookUser fb);

	int editProfileDAO(FacebookUser fb);

}
