package application.system.constant;

import java.util.Random;

public class Constant {
	private final static int[ ] INPUT_MONEY = {10, 50, 100, 500};
	private final static String[] DRINK_NAMES = {"コーラ", "オレンジ","グレープ", "アクエリアス", "お茶", "紅茶", "コーヒー", "水"};
	private final static int[]    DRINK_PRICE = {100, 120, 150};

	private Constant() {
	}

	public static int getInputMoney(int index) {
		int inputMoney = INPUT_MONEY[index];
		return inputMoney;
	}

	public static String getName() {
		Random randomName = new Random();
		int nameIndex = randomName.nextInt(DRINK_NAMES.length);
		String name = DRINK_NAMES[nameIndex];
		return name;
	}

	public static int getPrice() {
		Random randomPrice = new Random();
		int priceIndex = randomPrice.nextInt(DRINK_PRICE.length);
		int price = DRINK_PRICE[priceIndex];
		return price;
	}

}
