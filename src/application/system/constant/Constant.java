package application.system.constant;

import java.util.Random;

public class Constant {
	private final static int[ ] INPUT_MONEY = {10, 50, 100, 500};
	private final static String[] DRINK_NAMES = {"コーラ", "オレンジ","グレープ", "アクエリアス", "お茶", "紅茶", "コーヒー", "水"};
	private final static int[]    DRINK_PRICE = {100, 120, 150};

	private String name;
	private int price;
	
	private Constant() {
		Random randomName = new Random();
		int nameIndex = randomName.nextInt(DRINK_NAMES.length);
		name = DRINK_NAMES[nameIndex];
		
		Random randomPrice = new Random();
		int priceIndex = randomPrice.nextInt(DRINK_PRICE.length);
		price = DRINK_PRICE[priceIndex];
	}

	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}
