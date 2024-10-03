package com.system;

public class user {
	int Pid;
	/**
	 * @return the pid
	 */
	public int getPid() {
		return Pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		Pid = pid;
	}
	String Product;
	String Price;
	
	
	public String getProduct() {
		return Product;
	}
	
	public void setProduct(String product) {
		Product = product;
	}
	/**
	 * @return the pass
	 */
	public String getPrice() {
		return Price;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPrice(String price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "user [Pid=" + Pid + ", Product=" + Product + ", Price=" + Price + "]";
	}
	
	
	
	

}
