package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

//target class
public class Flipkart {
	//HAS-A Relation
	private Courier courier;
	public Flipkart() {
		System.out.println("Flipkart:: 0-param Constructor");
	}
	  
	public void setCourier(Courier courier) {
		System.out.println("Flipkart setCourier(-)");
		this.courier=courier;
	}
	public String shopping(String item[], float price[]) {
		float billAmnt=0.0f;
		//calculating billAmnt B.logic
		for(int i=0; i<item.length; ++i)
			billAmnt=billAmnt+price[i];
		//generating Random order id 
		int oid=new Random().nextInt(10000);
		//use courier for shipping 
		String status= courier.delivery(oid);
		String finalMsg=Arrays.toString(item)+" Are purchased with price"+Arrays.toString(price)+". Your Bill Ammount Is::"+billAmnt;
		return finalMsg+"::"+status;
			
	}

}
