package application.helper;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import application.controller.ControllerIFace;

public class FXMLLoad {

	public static void fxmlLoad(ControllerIFace controller, Node drinkButton) {
		URL url = controller.getUrl();
		FXMLLoader loader = new FXMLLoader(url);
		loader.setRoot(drinkButton);
		loader.setController(controller);
		
		try {
			loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
