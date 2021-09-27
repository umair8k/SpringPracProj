package com.nt.comp;

public class DTDC implements Courier {
	

	public DTDC() {
	   System.out.println("DTDC: 0-param Constructor");
	}

	@Override
	public String delivery(int oid) {
		
		return oid+" Order Id is deliverd by DTDC";
	}

}
