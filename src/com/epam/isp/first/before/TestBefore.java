package com.epam.isp.first.before;

public class TestBefore {

	public static void main(String[] args) {
		
		System.out.println("Non buffered:");
		ServiceClient first = new HttpServiceClient();
		first.sendData("Object 1");
		first.sendData("Object 2");
		first.flush();
		
		
		
		
	}

}
