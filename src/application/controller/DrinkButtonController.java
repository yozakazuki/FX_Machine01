package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import application.MainApplication;
import application.system.constant.Constant;

public class DrinkButtonController implements ControllerIFace, Initializable {
	@FXML Button drinkButton;
	@FXML RadioButton radioButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.drinkButton.setText(Constant.getName());
		String drinkPriceString = String.valueOf(Constant.getPrice());
		this.radioButton.setText(drinkPriceString);
	}

	@Override
	public URL getUrl() {
		URL url = MainApplication.class.getResource("view/fxml/DrinkButtonLayout.fxml");
		return url;
	}

	public RadioButton getRadioButton() {
		return radioButton;
	}

}
