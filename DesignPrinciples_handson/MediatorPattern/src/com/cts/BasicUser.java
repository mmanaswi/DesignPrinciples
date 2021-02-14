package com.cts;

public class BasicUser implements IUser{

	private ChatMediator chatMediator;
	private String name;
	
	public BasicUser(String name) {
		super();
		this.name = name;
	}

	@Override
	public void receiveMessage() {
		System.out.println("Hello Basic User: "+name+". There's a message for you!!!");
		
	}

	@Override
	public void sendMessage() {
		chatMediator.sendMessage();
		
	}

}
