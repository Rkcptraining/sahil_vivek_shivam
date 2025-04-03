package com.whatsapp.service;

import java.util.ArrayList;

import com.whatsapp.entity.WhatsappUser;

public interface WhatsappServiceInterface {

	String createProfileService(WhatsappUser wu);

	WhatsappUser viewProfileService(WhatsappUser wu);

	String editProfileService(String email, String password);

	String deleteProfileService(String email);

	ArrayList<WhatsappUser> viewAllProfileService();

}
