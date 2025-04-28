package com.facebookweb.service;

import com.facebookweb.entity.FacebookUser;

public interface FacebookServiceInterface {

	int createProfileService(FacebookUser fb);

	boolean loginUserService(FacebookUser f);

	FacebookUser viewProfileService(FacebookUser fb);

	int editProfileService(FacebookUser fb);

}
