package com.system;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		user c=new user();
		Scanner sc=new Scanner(System.in);
		int Pid = 0;
		String Product;
		String Username;
		inventory inv=new inventory();  
		do {
		Username=sc.next();
		try {
			 String name=Username;
		     if(!Username.equalsIgnoreCase("admin")) { 
		    	 throw new invalid();
		     }   
		} 
		catch( NumberFormatException n)
		{
			System.out.println("Numbers found in username");
		}
		catch(invalid i){
			System.out.println("Invalid Username");
			System.out.println("Give the correct user name:");
		}
	
		}while(!Username.equals("admin"));
		
		
			
		if(Username.equals("admin"))
		{
			
			int opt;
			do {
				System.out.println("1.ADD\n2.UPDATE\n3.SEARCH\n4.REMOVE\n5.SHOW\n6.LOGIN AGAIN.\n7.LOGOUT");
				opt=sc.nextInt();
				switch(opt) {
				case 1:
				/*System.out.println("ADDING BY ADMIN");
				c=new user();
				c.setPid(sc.nextInt());
				c.setProduct(sc.next());
				c.setPrice(sc.next());
				inv.add(c);*/
				System.out.println("Enter the product details:Pid/Product/Price");
				c.setPid(sc.nextInt());
				c.setProduct(sc.next());
				c.setPrice(sc.next());
				inv.add(c);
				
				break;
				case 2:
				System.out.println("Enter the product ID to update");
				int PID=sc.nextInt();
				c.setPid(PID);
				System.out.println("Enter the details to update:PRODUCT/PRICE");
				//c=inv.search(Product);
				
				c.setProduct(sc.next());
				c.setPrice(sc.next());
				inv.update(c);
				break;
				case 3:
				System.out.println("SEARCHING BY ADMIN");
				Product=sc.next();
				c=inv.search(Product);
				System.out.println("Product: "+c.getPid());
				System.out.println("Product: "+c.getProduct());
				System.out.println("Price: "+c.getPrice());
				break;
				case 4:
				System.out.println("ENTER THE PRODUCT ID TO DELETE");
				Pid=sc.nextInt();
				inv.remove(Pid);
				break;
				case 5:
				System.out.println("SHOWING BY ADMIN");
				inv.show();
				break;
				case 6:
					String Username1=sc.next();
					if(Username1.equals("user")) {
						System.out.println("SHOWING ONLY THE DETAILS");
						inv.show();
						Username=Username1;
					}
					break;
				}
				if(Username.equals("user")) {
					break;
				}
				}while(opt<=6);
		
			
		}
		if(Username.equals("users"))
		{
			System.out.println("SHOWING ONLY THE DETAILS");
			inv.show();
		}
	}
}
