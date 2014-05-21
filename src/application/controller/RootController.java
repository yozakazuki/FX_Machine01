package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import application.MainApplication;
import application.system.tool.FXMLLoad;

public class RootController implements ControllerIFace, Initializable {
	@FXML AnchorPane root;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		RootController controller = new RootController();
		GridPane main = (GridPane) FXMLLoad.fxmlLoad(controller);
		this.root.getChildren().add(main);
	}

	@Override
	public URL getUrl() {
		URL url = MainApplication.class.getResource("view/fxml/RootLayout.fxml");
		return url;
	}
	
}
