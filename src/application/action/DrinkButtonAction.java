package application.action;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import application.model.History;
import application.model.Payment;

public class DrinkButtonAction implements EventHandler<ActionEvent> {
	private Payment paymentModel;
	private History historyModel;
	private Button drinkButton;
	private ArrayList<RadioButton> radioList;

	public DrinkButtonAction(Payment _paymentModel, History _historyModel, Button _drinkButton, ArrayList<RadioButton> _radioList) {
		this.paymentModel = _paymentModel;
		this.historyModel = _historyModel;
		this.drinkButton  = _drinkButton;
		this.radioList    = _radioList;
	}

	@Override
	public void handle(ActionEvent arg0) {
		String drinkName        = drinkButton.getText();
		RadioButton radioButton = ((RadioButton) drinkButton.getGraphic());
		int drinkPrice          = Integer.valueOf(radioButton.getText());

		if (this.paymentModel.canPurchase(drinkPrice)) {
			return;
		}

		this.paymentModel.bought(drinkPrice);
		this.paymentModel.setLight(radioList);
		this.historyModel.bought(drinkName, String.valueOf(drinkPrice));
	}

}
