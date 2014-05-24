package application.action;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import application.helper.Function;

public class DrinkButtonAction implements EventHandler<ActionEvent> {
	private TextField payment;
	private Button drinkButton;
	private ArrayList<RadioButton> radioList;
	private TextArea textArea;

	public DrinkButtonAction(Button _drinkButton, TextField _payment, ArrayList<RadioButton> _radioList, TextArea _textArea) { 
		this.payment     = _payment;
		this.drinkButton = _drinkButton;
		this.radioList   = _radioList;
		this.textArea    = _textArea;
	}

	@Override
	public void handle(ActionEvent arg0) {
		String drinkName        = this.drinkButton.getText();
		RadioButton radioButton = (RadioButton) drinkButton.getGraphic();
		String drinkPriceText   = radioButton.getText();
		int drinkPrice          = Integer.valueOf(drinkPriceText);
		int paymentMoney        = Integer.valueOf(this.payment.getText());

		if (paymentMoney < drinkPrice) {
			return;
		}

		paymentMoney -= drinkPrice;
		this.payment.setText(String.valueOf(paymentMoney));

		Function.setLight(radioList, paymentMoney);

		String crlf = System.getProperty("line.separator");
		this.textArea.appendText(drinkName + " : " + drinkPrice + "円" + crlf);
	}

}
