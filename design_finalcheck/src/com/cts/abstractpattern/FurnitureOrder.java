package com.cts.abstractpattern;

public class FurnitureOrder extends Order{

	public FurnitureOrder(Channel channel) {
		super(channel, ProductType.FURNITURE);
		processOrder();
		
	}

	@Override
	public void processOrder() {
		System.out.println("***Connecting to Furniture department***");
		
	}

}
