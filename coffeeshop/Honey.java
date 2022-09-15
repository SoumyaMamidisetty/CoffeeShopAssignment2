package com.assignment2.coffeeshop;

public class Honey extends BeverageDecorator {
	private Beverage beverage;
	private int cost;

	public Honey(Beverage beverage, int cost) {
		this.beverage = beverage;
		this.cost = cost;
	}

	@Override
	public int getCost() {
		return beverage.getCost() + cost;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription()+" topped with Honey";
	}

}
