package com.epam.isp.first.before;



//http://habrahabr.ru/post/208442/
//http://igor.quatrocode.com/2008/09/solid-top-5.html

public abstract class ServiceClient {
	private String serviceUri;
	
	public ServiceClient(String serviceUri) {
		this.serviceUri = serviceUri;
	}
	
	public String getServiceUri() {
		return serviceUri;
	}

	public abstract void sendData(Object data);
	public abstract void flush();
	
}
