package com.epam.isp.first.before;

public class TestBefore {

	public static void main(String[] args) {
		
		System.out.println("Non buffered:");
		ServiceClient first = new HttpServiceClient("http:\\\\SomeUrl\\");
		first.sendData("Object 1");
		first.sendData("Object 2");
		first.flush();
		
		System.out.println("Buffered:");
		ServiceClient second = new BufferingHttpServiceClient("http:\\\\OtherUrl\\");
		second.sendData("Object 4");
		second.sendData("Object 5");
		second.sendData("Object 6");
		second.flush();
		
	}

}
