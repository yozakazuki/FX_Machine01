package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import application.helper.FXMLLoad;

public class RootController implements Initializable {
	@FXML AnchorPane root;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		GridPane main = new GridPane();
		MainController controller = new MainController();
		FXMLLoad.fxmlLoad(controller, main);
		this.root.getChildren().add(main);
	}

}
