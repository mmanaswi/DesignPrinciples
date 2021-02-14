package com.cts;

public class PremiumUser implements IUser{

	private ChatMediator chatMediator;
	private String name;
	
	
	public PremiumUser(String name) {
		super();
		this.name = name;
	}

	@Override
	public void receiveMessage() {
		System.out.println("Hello Premium User: "+name+". There's a message for you!!!");
		
	}

	@Override
	public void sendMessage() {
		chatMediator.sendMessage();
		
	}

}
