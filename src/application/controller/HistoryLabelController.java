package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class HistoryLabelController implements Initializable, ControllerIFace {
	@FXML Label label;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.label.setText("購入履歴");
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/HistoryLabelLayout.fxml");
		return url;
	}
}
