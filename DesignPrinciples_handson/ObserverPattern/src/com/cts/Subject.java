package com.cts;

public interface Subject {

	public void attach(Observer o); 
	public void detach(Observer o); 
	public void notifyUpdate(Message m);
	
	public void notifyChangeState(Message state);


}
