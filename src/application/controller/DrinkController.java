package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import application.model.Drink;

public class DrinkController implements Initializable, ControllerIFace {
	@FXML Button drinkButton;

	private int drinkPrice;
	private RadioButton radio;

	public DrinkController(RadioButton _radio) {
		this.radio = _radio;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Drink drink = new Drink();
		this.drinkButton.setText(drink.getName()); 
		this.drinkPrice = drink.getPrice();
		String drinkPriceString = String.valueOf(drinkPrice);
		this.radio.setText(drinkPriceString);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/DrinkLayout.fxml");
		return url;
	}

}
