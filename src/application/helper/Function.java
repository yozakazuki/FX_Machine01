package application.helper;

import java.util.ArrayList;

import javafx.scene.control.RadioButton;

public class Function {

	private Function() {
	}

	public static void setLight(ArrayList<RadioButton> radioList, int paymentMoney) {
		for (int i = 0; i < radioList.size(); i++) {
			RadioButton radio = radioList.get(i);
			int drinkPrice    = Integer.valueOf(radio.getText());
			radio.setSelected(drinkPrice <= paymentMoney);
		}
	}
}
