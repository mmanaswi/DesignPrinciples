package com.cts;

public interface Observer {

	public void update(Message m); 
	public void changeState(Message state);
}
