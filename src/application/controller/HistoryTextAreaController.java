package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class HistoryTextAreaController implements Initializable, ControllerIFace {
	@FXML TextArea history;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.history.setEditable(false);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/HistoryTextAreaLayout.fxml");
		return url;
	}
}
