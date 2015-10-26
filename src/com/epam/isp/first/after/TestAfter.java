package com.epam.isp.first.after;

import com.epam.isp.first.after.HttpServiceClient;
import com.epam.isp.first.after.ServiceClient;
import com.epam.isp.first.after.BufferingHttpServiceClient;

public class TestAfter {

	public static void main(String[] args) {

		System.out.println("Non buffered:");
		ServiceClient first = new HttpServiceClient("http:\\\\SomeUrl\\");
		first.sendData("Object 1");
		first.sendData("Object 2");

		
		System.out.println("Buffered:");
		BufferingServiceClient second = new BufferingHttpServiceClient("http:\\\\OtherUrl\\");
		second.sendData("Object 4");
		second.sendData("Object 5");
		second.sendData("Object 6");
		second.flush();
		
	}

}
