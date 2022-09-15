package com.assignment2.coffeeshop;

public class Cream extends BeverageDecorator {
	private Beverage beverage;
	private int cost;

	public Cream(Beverage beverage, int cost) {
		this.beverage = beverage;
		this.cost = cost;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost() + 15;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+"topped with Cream";
	}

}
