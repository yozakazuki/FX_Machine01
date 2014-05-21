package application.model;

public class Input {
	private static int[ ] INPUT_MONEY = {10, 50, 100, 500, 1000, 5000};;

	public String getMoneyText(int index) {
		int money   = INPUT_MONEY[index];
		String text = String.valueOf(money);
		return text;
	}
}
