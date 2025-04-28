package com.facebookweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.facebookweb.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface {

	@Override
	public int createProfileDAO(FacebookUser fb) {
		int i=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("insert into facebookuser values(?,?,?,?)");
			ps.setString(1,fb.getName() );
			ps.setString(2, fb.getPassword());
			ps.setString(3, fb.getEmail() );
			ps.setString(4,fb.getAddress());
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public boolean loginUserDAO(FacebookUser f) {
		boolean i=false;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("select * from facebookuser where email=? and password=?");
			ps.setString(1, f.getEmail() );
			ps.setString(2, f.getPassword());
			
			
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				i=true;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public FacebookUser viewUserDAO(FacebookUser fb) {
		FacebookUser ff=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("select * from facebookuser where email=? ");
			ps.setString(1, fb.getEmail() );
			
			
			
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				ff=new FacebookUser();
				ff.setName(res.getString(1));
				ff.setPassword(res.getString(2));
				ff.setEmail(res.getNString(3));
				ff.setAddress(res.getString(4));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return ff;
	}

	@Override
	public int editProfileDAO(FacebookUser fb) {
		int i=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rkcp","root","rajesh");
			
			PreparedStatement ps=con.prepareStatement("update facebookuser set name=?, password=?, address=? where email=?");
			ps.setString(1,fb.getName() );
			ps.setString(2, fb.getPassword());
			
			ps.setString(3,fb.getAddress());
			ps.setString(4, fb.getEmail() );
			
			i=ps.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return i;
	}

}
