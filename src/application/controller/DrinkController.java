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
	@FXML RadioButton radioButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Drink drink = new Drink();
		this.drinkButton.setText(drink.getName()); 
		String drinkPriceString = String.valueOf(drink.getPrice());
		this.radioButton.setText(drinkPriceString);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/DrinkLayout.fxml");
		return url;
	}

}
