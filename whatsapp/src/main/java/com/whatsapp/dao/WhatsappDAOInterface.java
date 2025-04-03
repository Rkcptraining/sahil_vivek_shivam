package com.whatsapp.dao;

import java.util.ArrayList;

import com.whatsapp.entity.WhatsappUser;

public interface WhatsappDAOInterface {
	public int createProfileDAO(WhatsappUser wu);
	public int deleteProfile(String email);
	public int editProfile(String email, String password);
	public WhatsappUser viewProfileDAO(WhatsappUser wu);
	public ArrayList<WhatsappUser> viewAllProfileDAO();
}
