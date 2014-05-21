package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import application.helper.FXMLLoad;

public class MainController implements Initializable, ControllerIFace {
	@FXML GridPane main;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		BotController botController = new BotController();

		TopController topController = new TopController(botController);

		MidController midController = new MidController(topController);

		topController.setMidController(midController);

		GridPane top = (GridPane) FXMLLoad.fxmlLoad(topController);
		GridPane mid = (GridPane) FXMLLoad.fxmlLoad(midController);
		GridPane bot = (GridPane) FXMLLoad.fxmlLoad(botController);

		this.main.add(top, 0, 0);
		this.main.add(mid, 0, 1);
		this.main.add(bot, 0, 2);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/MainLayout.fxml");
		return url;
	}

}
