package com.whatsapp.service;

import java.util.ArrayList;

import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.dao.WhatsappDAOInterface;
import com.whatsapp.entity.WhatsappUser;
import com.whatsapp.exception.UserNotFoundException;

public class WhatsappService implements WhatsappServiceInterface {

	@Override
	public String createProfileService(WhatsappUser wu) {
		WhatsappDAOInterface wd = new WhatsappDAO();

		int i = wd.createProfileDAO(wu);

		if (i > 0) {
			return "Profile Created successfully";
		} else {
			return "oops can not register you!";
		}

	}

	@Override
	public WhatsappUser viewProfileService(WhatsappUser wu) {
		WhatsappDAOInterface wd = new WhatsappDAO();

		WhatsappUser w1 = wd.viewProfileDAO(wu);
		try {
		if (w1 != null) {
			return w1;
		} else {
			throw new UserNotFoundException("User Profile Not Available for given email id "+wu.getEmail());
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String editProfileService(String email, String password) {
		WhatsappDAOInterface wd = new WhatsappDAO();

		int result = wd.editProfile(email, password);
		if (result > 0) {
			return "Profile edited successfully";
		} else {
			return "oops can not edit you!";
		}
	}

	@Override
	public String deleteProfileService(String email) {
		WhatsappDAOInterface wd = new WhatsappDAO();

		int result = wd.deleteProfile(email);
		if (result > 0) {
			return "Profile deleted successfully";
		} else {
			return "oops can not delete you!";
		}
	}

	@Override
	public ArrayList<WhatsappUser> viewAllProfileService() {
		WhatsappDAOInterface wd = new WhatsappDAO();
		ArrayList<WhatsappUser> allUsers = wd.viewAllProfileDAO();
		return allUsers;
	}

}
