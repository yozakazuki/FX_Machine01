package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;

public class BotController implements Initializable, ControllerIFace {
	@FXML GridPane bot;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/BotLayout.fxml");
		return url;
	}

}
