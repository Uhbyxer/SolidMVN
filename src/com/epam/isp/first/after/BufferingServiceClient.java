package com.epam.isp.first.after;

public abstract class BufferingServiceClient extends ServiceClient {

	public BufferingServiceClient(String serviceUri) {
		super(serviceUri);
	}

	public abstract void flush();
}
