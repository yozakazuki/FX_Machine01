package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import application.controller.RootController;
import application.system.tool.FXMLLoad;

public class MainApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		RootController controller = new RootController();
		AnchorPane root = (AnchorPane) FXMLLoad.fxmlLoad(controller);
		Scene scene = new Scene(root);
		primaryStage.setTitle("自動販売機");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
