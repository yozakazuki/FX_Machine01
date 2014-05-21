package application.action;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import application.controller.TopController;

public class PaybackAction implements EventHandler<ActionEvent> {
	private TextField wallet;
	private TextField payment;
	private TopController topController;

	public PaybackAction(TextField _wallet, TextField _payment, TopController _topController) {
		this.wallet        = _wallet;
		this.payment       = _payment;
		this.topController = _topController;
	}

	@Override
	public void handle(ActionEvent arg0) {
		int walletMoney  = Integer.valueOf(this.wallet.getText());
		int paymentMoney = Integer.valueOf(this.payment.getText());

		walletMoney += paymentMoney;
		this.wallet.setText(String.valueOf(walletMoney));

		paymentMoney = 0;
		this.payment.setText(String.valueOf(paymentMoney));

		this.topController.setLight(paymentMoney);
	}

}
