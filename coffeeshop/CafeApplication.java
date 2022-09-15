package com.assignment2.coffeeshop;

import java.util.Scanner;

public class CafeApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String order;
		String addon;
		String types;

		boolean continueOrder = true;
		System.out.println("Welcome To Beverage Cafe \n");

		while (continueOrder) {

			System.out.println("What would u like to Order"); // option1 - tea
			System.out.println("1.Tea \n2.Coffee"); // option2 - coffee

			order = sc.nextLine();
			if (!(order.equalsIgnoreCase("1") || order.equalsIgnoreCase("2"))) {
				System.out.println("Please Enter a Valid Number");
				continueOrder = true;
				continue;
			}

			System.out.println("Do u want any Addon's,y/n");
			addon = sc.nextLine();

			if (!(addon.equalsIgnoreCase("Y") || addon.equalsIgnoreCase("y") || addon.equalsIgnoreCase("Yes"))) {
				System.out.println("Please enter a valid value");
				continueOrder = false;
				break;
			}else if((addon.equalsIgnoreCase("N")|| addon.equalsIgnoreCase("n")||addon.equalsIgnoreCase("No"))) {
				break;
			}

			System.out.println("Select the Addon's as per ur choice");
			System.out.println("1.Caramel \n 2.Choclate \n 3.Honey \n 4.Cream");
			types = sc.nextLine(); // 1-4
			if (!(types.equalsIgnoreCase("1") || types.equalsIgnoreCase("2") || types.equalsIgnoreCase("3")
					|| types.equalsIgnoreCase("4"))) {
				System.out.println("Please Enter a Valid Addon's choice");
				continueOrder = true;
				break;
			} // System.out.print("The Oder is :"+order);

			System.out.println("Do u want want to order more, y/n");
			String order4 = sc.nextLine();
			if (order4.equalsIgnoreCase("y") || order4.equalsIgnoreCase("Yes") || order4.equalsIgnoreCase("N")
					|| order4.equalsIgnoreCase("n") || order4.equalsIgnoreCase("Y") || order4.equalsIgnoreCase("No")) {
				continueOrder = true;
			} else {
				continueOrder = false;
			}
			

		}

		// Above code is to gather order

		Tea tea = new Tea(20);
		System.out.println("Cost of tea   " + tea.getCost() + tea.getDescription());
		Honey honeyTea = new Honey(tea, 40);
		System.out.println("Cost of tea   " + honeyTea.getCost() + honeyTea.getDescription());
		Cream creamTea = new Cream(honeyTea, 15);
		System.out.println("cost of tea   " + creamTea.getCost() + creamTea.getDescription());

		// Coffee coffee = new Coffee(30);

	}

}
