package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class InputController implements Initializable, ControllerIFace {
	@FXML Button input;
	private static int[ ] INPUT_MONEY = {10, 50, 100, 500, 1000, 5000};;
	private int index;

	public InputController(int _index) {
		this.index = _index;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		int money = INPUT_MONEY[index];
		String text = String.valueOf(money);
		this.input.setText(text);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/InputLayout.fxml");
		return url;
	}
}
