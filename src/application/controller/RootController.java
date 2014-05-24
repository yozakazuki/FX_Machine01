package application.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import application.MainApplication;
import application.system.tool.FXMLLoad;

public class RootController implements ControllerIFace, Initializable {
	@FXML GridPane root;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ArrayList<Button> drinkButtonList = new ArrayList<Button>();
		int  low    = 4;
		int  column = 2;

		for (int i = 0; i < (low * column); i++) {
			DrinkButtonController controller = new DrinkButtonController();
			Button drinkButton               = (Button) FXMLLoad.fxmlLoad(controller);
			drinkButtonList.add(drinkButton);
		}

		TopController topController = new TopController(drinkButtonList, low, column);
		MidController midController = new MidController(drinkButtonList);
		BotController botController = new BotController();

		GridPane   mid = (GridPane) FXMLLoad.fxmlLoad(midController);
		BorderPane bot = (BorderPane) FXMLLoad.fxmlLoad(botController);

		topController.setPayment(midController.getPayment());
		topController.setTextArea(botController.getTextArea());

		GridPane top = (GridPane) FXMLLoad.fxmlLoad(topController);

		this.root.add(top, 0, 0);
		this.root.add(mid, 0, 1);
		this.root.add(bot, 0, 2);
	}

	@Override
	public URL getUrl() {
		URL url = MainApplication.class.getResource("view/fxml/RootLayout.fxml");
		return url;
	}

}
