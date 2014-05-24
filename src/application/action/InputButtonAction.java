package application.action;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import application.helper.Function;

public class InputButtonAction implements EventHandler<ActionEvent> {
	private TextField wallet;
	private TextField payment;
	private Button inputButton;
	private ArrayList<RadioButton> radioList;

	public InputButtonAction(TextField _wallet, TextField _payment, Button _inputButton, ArrayList<RadioButton> _radioList) {
		this.wallet      = _wallet;
		this.payment     = _payment;
		this.inputButton = _inputButton;
		this.radioList   = _radioList;
	}

	@Override
	public void handle(ActionEvent arg0) {
		int walletMoney  = Integer.valueOf(this.wallet.getText());
		int paymentMoney = Integer.valueOf(this.payment.getText());
		int inputMoney   = Integer.valueOf(this.inputButton.getText());

		walletMoney -= inputMoney;
		this.wallet.setText(String.valueOf(walletMoney));

		paymentMoney += inputMoney;
		this.payment.setText(String.valueOf(paymentMoney));

		Function.setLight(radioList, paymentMoney);
	}

}
