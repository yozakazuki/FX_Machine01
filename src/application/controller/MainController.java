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
		GridPane top = new GridPane();
		TopController topController = new TopController();
		FXMLLoad.fxmlLoad(topController, top);

		GridPane mid = new GridPane();
		MidController midController = new MidController();
		FXMLLoad.fxmlLoad(midController, mid);

		GridPane bot = new GridPane();
		BotController botController = new BotController();
		FXMLLoad.fxmlLoad(botController, bot);

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
