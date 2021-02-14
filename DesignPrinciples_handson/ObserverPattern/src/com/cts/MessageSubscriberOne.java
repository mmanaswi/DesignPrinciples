package com.cts;

public class MessageSubscriberOne implements Observer{

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberOne :: " + m.getMessageContent()); 
		
	}

	@Override
	public void changeState(Message state) {
		System.out.println("MessageSubscriberOne :: " + state.getMessageContent());
		
	}

}
