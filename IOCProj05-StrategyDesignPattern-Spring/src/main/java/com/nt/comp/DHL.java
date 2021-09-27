package com.nt.comp;

public class DHL implements Courier {
	public DHL() {
		System.out.println("DHL: 0-param Constructor");	
	}
	@Override
	public String delivery(int oid) {
		return oid+" Order Id is deliverd by DHL";
	}

}
