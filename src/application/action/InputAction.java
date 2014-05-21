package application.action;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import application.controller.TopController;

public class InputAction implements EventHandler<ActionEvent> {
	private Button inputButton;
	private TextField wallet;
	private TextField payment;
	private TopController topController;

	public InputAction(Button _inputButton, TextField _wallet, TextField _payment, TopController _topController) {
		this.inputButton   = _inputButton;
		this.wallet        = _wallet;
		this.payment       = _payment;
		this.topController = _topController;
	}

	@Override
	public void handle(ActionEvent arg0) {
		int inputMoney   = Integer.valueOf(this.inputButton.getText()); 
		int walletMoney  = Integer.valueOf(this.wallet.getText());
		int paymentMoney = Integer.valueOf(this.payment.getText());

		walletMoney -= inputMoney;
		this.wallet.setText(String.valueOf(walletMoney));

		paymentMoney += inputMoney;
		this.payment.setText(String.valueOf(paymentMoney));

		this.topController.setLight(paymentMoney);
	}

}
