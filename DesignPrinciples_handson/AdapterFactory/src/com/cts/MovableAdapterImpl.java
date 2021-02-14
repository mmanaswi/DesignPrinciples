package com.cts;

public class MovableAdapterImpl implements MovableAdapter {

	private Movable luxuryCars;

	public MovableAdapterImpl(Movable luxuryCars) {
		super();
		this.luxuryCars = luxuryCars;
	}

	public Movable getLuxuryCars() {
		return luxuryCars;
	}

	public void setLuxuryCars(Movable luxuryCars) {
		this.luxuryCars = luxuryCars;
	}

	// standard constructors
	@Override
	public double getSpeed() {
		return convertMPHtoKMPH(luxuryCars.getSpeed());
	}

	private double convertMPHtoKMPH(double mph) {
		return mph * 1.60934;
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return convertUSDtoEuro(luxuryCars.getPrice());
	}

	private double convertUSDtoEuro(double price) {
		return price / 1.4389;
	}

}
