package com.epam.isp.first.after;

import com.epam.isp.first.before.Buffer;
import com.epam.isp.first.before.Channel;

public class BufferingHttpServiceClient extends BufferingServiceClient{
	private Buffer buffer = new Buffer();
	
	public BufferingHttpServiceClient(String serviceUri) {
		super(serviceUri);
	}

	@Override
	public void flush() {
		Channel channel = new Channel(getServiceUri());
		channel.send(buffer.getAll());
		buffer.clear();
	}

	@Override
	public void sendData(Object data) {
		buffer.write(data);
	}

}
