package application.view;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import application.controller.DrinkButtonController;
import application.helper.FXMLLoad;

public class Top extends GridPane {
	
	public Top() {
		for (int buttonNumber = 0; buttonNumber < 4; buttonNumber++) {
			Button drinkButton = new Button();
			DrinkButtonController controller = new DrinkButtonController(buttonNumber);
			FXMLLoad.fxmlLoad(controller, drinkButton);
			this.add(drinkButton, buttonNumber, 0);
		}
	}

}
