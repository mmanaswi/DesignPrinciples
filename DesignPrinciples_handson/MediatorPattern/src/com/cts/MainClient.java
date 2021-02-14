package com.cts;

public class MainClient {

	public static void main(String args[]) {
		ChatMediator chatMediator=new ChatMediator();
		BasicUser basicUser=new BasicUser("Sam");
		chatMediator.addUser(basicUser);
		PremiumUser premiumUser=new PremiumUser("Max");
		chatMediator.addUser(premiumUser);
		chatMediator.sendMessage();
	}
}
