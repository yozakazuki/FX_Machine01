package application.action;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import application.helper.Function;

public class PaybackButtonAction implements EventHandler<ActionEvent> {
	private TextField wallet;
	private TextField payment;
	private ArrayList<RadioButton> radioList;

	public PaybackButtonAction(TextField _wallet, TextField _payment, ArrayList<RadioButton> _radioList) {
		this.wallet    = _wallet;
		this.payment   = _payment;
		this.radioList = _radioList;
	}

	@Override
	public void handle(ActionEvent arg0) {
		int walletMoney  = Integer.valueOf(this.wallet.getText());
		int paymentMoney = Integer.valueOf(this.payment.getText());

		walletMoney += paymentMoney;
		this.wallet.setText(String.valueOf(walletMoney));

		this.payment.setText("0");

		Function.setLight(radioList, paymentMoney);
	}
}
