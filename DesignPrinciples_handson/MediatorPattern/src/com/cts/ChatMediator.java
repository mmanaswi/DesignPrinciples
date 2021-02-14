package com.cts;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator{

	List<IUser> users=new ArrayList<IUser>();
	
	@Override
	public void addUser(IUser user) {
		
		users.add(user);		
	}

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Sending Message......");
		for(IUser user:users) {
			user.receiveMessage();
		}
		
	}

}
