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
import application.model.History;
import application.model.Payment;
import application.system.constant.Constant;
import application.system.tool.FXMLLoad;

public class RootController implements ControllerIFace, Initializable {
	@FXML GridPane root;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ArrayList<Button> drinkButtonList = new ArrayList<Button>();
		Payment paymentModel = new Payment();
		History historyModel = new History();

		int row    = Constant.getGridLow();
		int column = Constant.getGridColumn();

		for (int i = 0; i < (row * column); i++) {
			DrinkButtonController controller = new DrinkButtonController();
			Button drinkButton               = (Button) FXMLLoad.fxmlLoad(controller);
			drinkButtonList.add(drinkButton);
		}

		TopController topController = new TopController(drinkButtonList, paymentModel, historyModel, row, column);
		MidController midController = new MidController(drinkButtonList, paymentModel);
		BotController botController = new BotController(historyModel);

		GridPane top   = (GridPane) FXMLLoad.fxmlLoad(topController);
		GridPane mid   = (GridPane) FXMLLoad.fxmlLoad(midController);
		BorderPane bot = (BorderPane) FXMLLoad.fxmlLoad(botController);

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
