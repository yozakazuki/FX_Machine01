package application.system.tool;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import application.controller.ControllerIFace;

public class FXMLLoad {

	public static Node fxmlLoad(ControllerIFace controller) {
		URL url = controller.getUrl();
		FXMLLoader loader = new FXMLLoader(url);
		loader.setController(controller);

		try {
			Node node = loader.load();
			return node;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
