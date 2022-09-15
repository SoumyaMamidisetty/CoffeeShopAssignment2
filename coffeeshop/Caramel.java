package com.assignment2.coffeeshop;

public class Caramel extends BeverageDecorator {

	int caramelCost;

	Caramel(Beverage beverage, int caramelCost) {

		this.beverage = beverage;
		this.caramelCost = caramelCost;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Caramel";
	}
	

}
