package application.action;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.RadioButton;
import application.model.Payment;
import application.model.Wallet;

public class PaybackButtonAction implements EventHandler<ActionEvent> {
	private Wallet walletModel;
	private Payment paymentModel;
	private ArrayList<RadioButton> radioList;

	public PaybackButtonAction(Wallet _walletModel, Payment _paymentModel, ArrayList<RadioButton> _radioList) {
		this.walletModel  = _walletModel;
		this.paymentModel = _paymentModel;
		this.radioList    = _radioList;
	}

	@Override
	public void handle(ActionEvent arg0) {
		this.walletModel.payback(paymentModel.intPaymentPro());
		this.paymentModel.payback();
		this.paymentModel.setLight(radioList);
	}

}
