package com.epam.isp.first.before;

public class Channel {
	private String serviceUri;
	
	public Channel(String serviceUri) {
		this.serviceUri = serviceUri;
	}
	
	public void send(Object data) {
		System.out.println("Sending to URI: " + serviceUri + " data: " + data.toString());
	}
}
