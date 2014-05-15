package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class PaymentController implements Initializable, ControllerIFace {
	@FXML TextField payment;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.payment.setText("0");
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/PaymentLayout.fxml");
		return url;
	}

}
