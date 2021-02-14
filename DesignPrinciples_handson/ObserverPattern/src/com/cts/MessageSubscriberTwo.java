package com.cts;

public class MessageSubscriberTwo implements Observer{

	@Override
	public void update(Message m) {
		System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());
		
	}
	@Override
	public void changeState(Message state) {
		System.out.println("MessageSubscriberOne :: " + state.getMessageContent());
		
	}

}
