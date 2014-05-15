package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class WalletController implements Initializable, ControllerIFace {
	@FXML TextField wallet;

	public WalletController() {

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.wallet.setEditable(false);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/WalletLayout.fxml");
		return url;
	}

}
