package com.nt.comp;

public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart: 0-param Constructot");
	}

	@Override
	public String delivery(int oid) {
		
		return oid+" Order Id is delivered By BlueDart";
	}

}
