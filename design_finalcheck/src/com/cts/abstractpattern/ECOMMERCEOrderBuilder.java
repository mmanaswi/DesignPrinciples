package com.cts.abstractpattern;

public class ECOMMERCEOrderBuilder {

	public static Order buildOrder(ProductType productType) {
		Order order = null;
		switch(productType) {
			case ELECTRONICS:
				order = new ElectronicOrder(Channel.ECOMMERCE);
				break;
			case TOYS:
				order = new ToysOrder(Channel.ECOMMERCE);
				break;
			case FURNITURE:
				order = new FurnitureOrder(Channel.ECOMMERCE);
				break;
			default:
				break;
		}
		return order;
	}
}
