package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import application.model.Input;

public class InputController implements Initializable, ControllerIFace {
	@FXML Button input;
	
	private int index;

	public InputController(int _index) {
		this.index = _index;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Input input = new Input();
		String text = input.getMoneyText(index);
		this.input.setText(text);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/InputLayout.fxml");
		return url;
	}

}
