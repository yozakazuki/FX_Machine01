package application.action;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import application.model.Payment;
import application.model.Wallet;

public class InputButtonAction implements EventHandler<ActionEvent> {
	private Wallet walletModel;
	private Payment paymentModel;
	private Button inputButton;
	private ArrayList<RadioButton> radioList;

	public InputButtonAction(Wallet _walletModel, Payment _paymentModel, Button _inputButton, ArrayList<RadioButton> _radioList) {
		this.walletModel  = _walletModel;
		this.paymentModel = _paymentModel;
		this.inputButton  = _inputButton;
		this.radioList    = _radioList;
	}

	@Override
	public void handle(ActionEvent arg0) {
		int inputMoney = Integer.valueOf(this.inputButton.getText());

		this.walletModel.paid(inputMoney);
		this.paymentModel.paid(inputMoney);
		this.paymentModel.setLight(radioList);
	}

}
