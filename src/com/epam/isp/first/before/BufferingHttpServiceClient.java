package com.epam.isp.first.before;


public class BufferingHttpServiceClient extends ServiceClient {

	private Buffer buffer = new Buffer();
	
	@Override
	public void sendData(Object data) {
		buffer.write(data);
	}

	@Override
	public void flush() {
		Channel channel = new Channel("http:\\\\OtherUri\\");
		channel.send(buffer.getAll());
		buffer.clear();
		
	}
	
}
