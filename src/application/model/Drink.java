package application.model;

import application.system.constant.Constant;

public class Drink {
	private static String name;
	private static int price;

	private Drink() {
			}

	public static String getName() {
		name = Constant.getName();
		return name;
	}

	public static int getPrice() {
		price = Constant.getPrice();
		return price;
	}

}