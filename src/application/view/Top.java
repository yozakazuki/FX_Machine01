package application.view;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import application.controller.DrinkButtonController;
import application.helper.FXMLLoad;

public class Top extends GridPane {

	public Top() {
		for (int buttonY = 0; buttonY < 2; buttonY++) {
			for (int buttonX = 0; buttonX < 4; buttonX++) {
				Button drinkButton = new Button();
				DrinkButtonController controller = new DrinkButtonController();
				FXMLLoad.fxmlLoad(controller, drinkButton);
				this.add(drinkButton, buttonX, buttonY);
			}
		}
		System.out.println("Top完了");
	}

}
