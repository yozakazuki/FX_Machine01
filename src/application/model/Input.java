package application.model;

public class Input {
	

	public String getMoneyText(int index) {
		int money   = INPUT_MONEY[index];
		String text = String.valueOf(money);
		return text;
	}
	}
