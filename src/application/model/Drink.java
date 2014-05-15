package application.model;

public class Drink {
	private static String[] DRINK_NAMES = {"コーラ", "オレンジ","グレープ", "アクエリアス", "お茶", "紅茶", "コーヒー", "水"};
	private static int[]    DRINK_PRICE = {100, 120, 150};

	public String getName(int i) {
		String drinkName = DRINK_NAMES[i];
		return drinkName;
	}

	public int getPrice(int i) {
		i %= 3;
		int drinkPrice = DRINK_PRICE[i];
		return drinkPrice;
	}

}