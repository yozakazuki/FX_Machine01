package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import application.MainApplication;

public class BotController implements ControllerIFace, Initializable {
	@FXML Label label;
	@FXML TextArea textArea;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.label.setText("購入履歴");
		this.textArea.setEditable(false);
	}

	@Override
	public URL getUrl() {
		URL url = MainApplication.class.getResource("view/fxml/BotLayout.fxml");
		return url;
	}
	
	public TextArea getTextArea() {
		return this.textArea;
	}

}
