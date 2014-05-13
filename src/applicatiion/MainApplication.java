package applicatiion;

import java.io.IOException;
import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws IOException {
		URL url = this.getClass().getResource("view/fxml/RootLayout.fxml");
		System.out.println(url);
		AnchorPane root = FXMLLoader.load(url);
		Scene scene = new Scene(root);
		primaryStage.setTitle("自動販売機");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
