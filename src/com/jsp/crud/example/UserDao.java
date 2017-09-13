package com.jsp.crud.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDao 
{
	public static Connection getConnection()
	{
		Connection con=null;
		
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/details","root","password");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
		return con;
	}
	
	
	public static int save(User u)
	{
		int status=0;
		try
		{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement("insert into details.user(Name,password,Email,Sex,country)values(?,?,?,?,?)");
			ps.setString(1,u.getName());
			ps.setString(2,u.getPassword());
			ps.setString(3,u.getEmail());
			ps.setString(4,u.getSex());
			ps.setString(5,u.getCountry());
			status=ps.executeUpdate();  
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return status;
	}
}


