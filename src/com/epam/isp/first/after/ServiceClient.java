package com.epam.isp.first.after;

public abstract class ServiceClient {
	private String serviceUri;
	
	public ServiceClient(String serviceUri) {
		this.serviceUri = serviceUri;
	}
	
	public String getServiceUri() {
		return serviceUri;
	}
	
	public void setServiceUri(String serviceUri) {
		this.serviceUri = serviceUri;
	}
	
	public abstract void sendData(Object data);
	
}
