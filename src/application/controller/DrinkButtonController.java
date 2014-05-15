package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import application.model.Drink;

public class DrinkButtonController implements Initializable, ControllerIFace {
	@FXML Button drinkButton;
	@FXML RadioButton radioButton;
	private int buttonNumber;

	public DrinkButtonController(int _buttonNumber) {
		this.buttonNumber = _buttonNumber;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Drink drink = new Drink();
		this.drinkButton.setText(drink.getName(buttonNumber)); 
		String drinkPriceString = String.valueOf(drink.getPrice(buttonNumber));
		this.radioButton.setText(drinkPriceString);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/DrinkButtonLayout.fxml");
		return url;
	}

}
