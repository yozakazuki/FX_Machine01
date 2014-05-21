package application.action;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import application.controller.BotController;
import application.controller.MidController;
import application.controller.TopController;

public class DrinkButtonAction implements EventHandler<ActionEvent> {
	private String drinkName;
	private int drinkPrice;
	private TopController topController;
	private MidController midController;
	private BotController botController;

	public DrinkButtonAction(String _drinkName, int _drinkPrice, TopController _topController, MidController _midController, BotController _botController) {
		this.drinkName     = _drinkName;
		this.drinkPrice    = _drinkPrice;
		this.topController = _topController;
		this.midController = _midController;
		this.botController = _botController;
	}

	@Override
	public void handle(ActionEvent arg0) {
		TextField payment = this.midController.getPayment();
		String paymentString = payment.getText();
		int paymentMoney     = Integer.valueOf(paymentString);
		if (paymentMoney < this.drinkPrice) {
			return;
		}

		paymentMoney -= this.drinkPrice;
		payment.setText(String.valueOf(paymentMoney));

		String drinkPriceString = String.valueOf(this.drinkPrice);
		this.topController.setLight(paymentMoney);

		this.botController.writeDrinkHistory(this.drinkName, drinkPriceString);
	}

}
