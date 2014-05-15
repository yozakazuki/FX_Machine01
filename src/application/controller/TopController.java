package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import application.helper.FXMLLoad;

public class TopController implements Initializable, ControllerIFace {
	@FXML GridPane top;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		for (int buttonX = 0; buttonX < 4; buttonX++) {
			for (int buttonY = 0; buttonY < 2; buttonY++) {
				Button drink = new Button();
				DrinkController drinkButtonController = new DrinkController();
				FXMLLoad.fxmlLoad(drinkButtonController, drink);
				this.top.add(drink, buttonX, buttonY);
			}
		}
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/TopLayout.fxml");
		return url;
	}

}
