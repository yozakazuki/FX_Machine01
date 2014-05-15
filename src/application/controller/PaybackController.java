package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class PaybackController implements Initializable, ControllerIFace {
	@FXML Button payback;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.payback.setText("お釣りボタン");
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/PaybackLayout.fxml");
		return url;
	}
}
