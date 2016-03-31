package com.greatwideweb.samples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RawMySQLConnection {

	public static void main(String[] args) throws Exception {
		   Connection conn = null;
		   Statement stmt = null;
		   ResultSet rs = null;
		   try
		   {
		      Class.forName("com.mysql.jdbc.Driver");
		      conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/sandbox?user=sandbox&password=sandbox&database=sandbox");
		      stmt = conn.createStatement();
		      rs = stmt.executeQuery("select now()");
		      while(rs.next())
		    	  System.out.println(rs.getString(1));
		   }catch(Exception e){
		      throw e;
		   }finally{
		     rs.close();
		     stmt.close();
		     conn.close();
		   }
		}

}
