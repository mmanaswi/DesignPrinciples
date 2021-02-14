package com.cts.abstractpattern;

public class TELECALLEROrderBuilder {

	public static Order buildOrder(ProductType productType) {
		Order order = null;
		switch(productType) {
			case ELECTRONICS:
				order = new ElectronicOrder(Channel.TELECALLER);
				break;
			case TOYS:
				order = new ToysOrder(Channel.TELECALLER);
				break;
			case FURNITURE:
				order = new FurnitureOrder(Channel.TELECALLER);
				break;
			default:
				break;
		}
		return order;
	}
}
