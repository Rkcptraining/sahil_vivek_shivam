package com.whatsapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.whatsapp.entity.WhatsappUser;

public class WhatsappDAO implements WhatsappDAOInterface{

	public int createProfileDAO(WhatsappUser wu) {
		int i=0;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp", "root", "rajesh");

		PreparedStatement ps = con.prepareStatement("insert into whatsappuser values(?,?,?,?)");
		ps.setString(1, wu.getName());
		ps.setString(2, wu.getPassword());
		ps.setString(3, wu.getEmail());
		ps.setString(4, wu.getAddress());

		i = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int deleteProfile(String email)  {
		int i =0;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp", "root", "rajesh");

		PreparedStatement ps = con.prepareStatement("delete from whatsappuser where email=?");
		ps.setString(1, email);
		

		i = ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	public int editProfile(String email, String password) {
		int i =0;
		try {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp", "root", "rajesh");

		PreparedStatement ps = con.prepareStatement("update whatsappuser set password=? where email=?");
		ps.setString(1, password);
		ps.setString(2, email);
		

		i= ps.executeUpdate();
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public WhatsappUser viewProfileDAO(WhatsappUser wu) {
		WhatsappUser ww=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp", "root", "rajesh");

			PreparedStatement ps = con.prepareStatement("select * from whatsappuser where email=?");
			ps.setString(1, wu.getEmail());
			
			ResultSet res=  ps.executeQuery();
			
			if(res.next()) {
				String name= res.getString(1);
				String password= res.getString(2);
				String email= res.getString(3);
				String address= res.getString(4);
				
				ww=new WhatsappUser();
				ww.setName(name);
				ww.setPassword(password);
				ww.setEmail(email);
				ww.setAddress(address);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ww;
	}

	@Override
	public ArrayList<WhatsappUser> viewAllProfileDAO() {
		ArrayList<WhatsappUser> ww=new ArrayList<WhatsappUser>();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp", "root", "rajesh");

			PreparedStatement ps = con.prepareStatement("select * from whatsappuser ");
						
			ResultSet res=  ps.executeQuery();
			
			while(res.next()) {
				String name= res.getString(1);
				String password= res.getString(2);
				String email= res.getString(3);
				String address= res.getString(4);
				
				WhatsappUser ww1=new WhatsappUser();
				ww1.setName(name);
				ww1.setPassword(password);
				ww1.setEmail(email);
				ww1.setAddress(address);
				
				ww.add(ww1);
			}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ww;
	}

}











