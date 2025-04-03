package com.whatsapp.controller;

import java.util.Scanner;

import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.entity.WhatsappUser;

public interface WhatsappControllerInterface {
	
	 void createProfileController();//by default method of an interface will be public and abstract.

	 void viewProfileController();

	 void editProfileController();

	 void deleteProfileController();
	 
	 int i=8; //variable by default will be public, final i.e. constant and static i.e. without object can be used

	void viewAllProfileController();

}
