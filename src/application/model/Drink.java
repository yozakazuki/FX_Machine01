package application.model;

public class Drink {
	private static String[] DRINK_NAMES = {"コーラ", "オレンジ","グレープ", "アクエリアス", "お茶", "紅茶", "コーヒー", "水"};
	private static int[]    DRINK_PRICE = {100, 120, 150};

	public String getName() {
		int nameIndex = (int)((Math.random() * 10) % DRINK_NAMES.length);
		return DRINK_NAMES[nameIndex];
	}

	public int getPrice() {
		int priceIndex = (int)((Math.random() * 10) % DRINK_PRICE.length);
		return DRINK_PRICE[priceIndex];
	}

}