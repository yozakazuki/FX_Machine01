package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import application.view.Bot;
import application.view.Mid;
import application.view.Top;

public class RootController implements Initializable {
	@FXML AnchorPane root;

	public RootController() {
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		GridPane main = new GridPane();

		Top top = new Top();
		Mid mid = new Mid();
		Bot bot = new Bot();

		main.add(top, 0, 0);
		main.add(mid, 0, 1);
		main.add(bot, 0, 2);

		this.root.getChildren().add(main);
	}

}
