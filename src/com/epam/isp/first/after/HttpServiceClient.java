package com.epam.isp.first.after;

import com.epam.isp.first.before.Channel;

public class HttpServiceClient extends ServiceClient {

	public HttpServiceClient(String serviceUri) {
		super(serviceUri);
	}

	@Override
	public void sendData(Object data) {

		Channel channel = new Channel(getServiceUri());
		channel.send(data);
	}

}
