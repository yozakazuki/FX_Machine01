package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import application.MainApplication;

public class MidController implements ControllerIFace, Initializable {
	@FXML GridPane mid;

	public MidController() {
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	@Override
	public URL getUrl() {
		URL url = MainApplication.class.getResource("view/fxml/RootLayout.fxml");
		return url;
	}

}
