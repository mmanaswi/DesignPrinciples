package com.cts;

public abstract class Factory {

	public abstract Headlight makeHeadlight();
	public abstract Tire makeTire();
	
	@Override
	public String toString() {
		return "Factory [makeHeadlight()=" + makeHeadlight() + ", makeTire()=" + makeTire() + "]";
	}
	
}
