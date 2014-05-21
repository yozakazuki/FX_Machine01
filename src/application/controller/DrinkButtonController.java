package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import application.MainApplication;

public class DrinkButtonController implements ControllerIFace, Initializable {

	public DrinkButtonController() {
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
