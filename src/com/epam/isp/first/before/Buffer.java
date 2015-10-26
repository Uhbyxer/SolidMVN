package com.epam.isp.first.before;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
	private List<Object> buffer = new ArrayList<Object>();
	
	public void write(Object data) {
		buffer.add(data);
	}
	
	public Object getByIndex(int index) {
		return buffer.get(index);
	}
	
	public List<Object> getAll() {
		return buffer;
	}
	
	public void clear() {
		buffer.clear();
	}
}
