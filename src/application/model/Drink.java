package application.model;

import application.system.constant.Constant;

public class Drink {
	private final String name;
	private final int price;

	public Drink() {
		this.name = Constant.getName();
		this.price = Constant.getPrice();
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}