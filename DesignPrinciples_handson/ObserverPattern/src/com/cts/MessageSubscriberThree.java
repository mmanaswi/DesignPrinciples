package com.cts;

public class MessageSubscriberThree implements Observer{

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberThree :: " + m.getMessageContent()); 
		
	}
	@Override
	public void changeState(Message state) {
		System.out.println("MessageSubscriberOne :: " + state.getMessageContent());
		
	}

}
