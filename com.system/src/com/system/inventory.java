package com.system;
import java.sql.Connection;


import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import com.mysql.cj.xdevapi.Result;

public class inventory extends user{
    
	Statement stmt;
	ResultSet rs;
	String qry=null;
	dbutil db=new dbutil();
	int count;
	Connection con;
	
	

	List<user> list=new ArrayList();
	public void add(user c) {

		//list.add(c);
	
		try {
			Connection con=db.getDBConnection();
			stmt=con.createStatement();
			qry="Insert into user(Pid,Product,Price) values('"+c.getPid()+"','"+c.getProduct()+"','"+c.getPrice()+"')";
			count=stmt.executeUpdate(qry);
			if(count==1) {
				System.out.print("Inserted Sucessfully");
			}
			else {
				throw new Exception();
			}
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	public void show() {
		/*for(user c: list) {
			System.out.println("Product: "+c.getProduct());
			System.out.println("Price: "+c.getPrice());
		}*/
		try {
			con=db.getDBConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from user");
			while(rs.next())
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" ");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	
	public user search(String product) {
		for(int i=0;i<list.size();i++) {
			if(product.equals(list.get(i).getProduct())) {
				return list.get(i);
			}
		}
		return null;
	}
	
	
	public void update(user c) {
		try {
			con=db.getDBConnection();
			stmt=con.createStatement();
			count=stmt.executeUpdate("update user set Product='"+c.getProduct()+"',Price='"+c.getPrice()+"' where Pid="+c.getPid()+"");
	        System.out.print("Updated Successfully");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		


	}

	
	
	public void remove(int Pid) {
		/*for(int i=0;i<list.size();i++) {
			if(product.equals(list.get(i).getProduct())) {
				list.remove(i);
			}
		}*/
		try {
			Connection con=db.getDBConnection();
			stmt=con.createStatement();
			qry="delete from user where Pid="+Pid+"";
			count=stmt.executeUpdate(qry);
		    System.out.print("DELETION SUCCESSFUL");
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	
}


