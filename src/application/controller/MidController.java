package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import application.helper.FXMLLoad;

public class MidController implements Initializable, ControllerIFace {
	@FXML GridPane mid;
	@FXML GridPane input;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TextField wallet = new TextField();
		WalletController walletController = new WalletController();
		FXMLLoad.fxmlLoad(walletController, wallet);

		Button payback = new Button();
		PaybackController paybackController = new PaybackController();
		FXMLLoad.fxmlLoad(paybackController, payback);

		TextField payment = new TextField();
		PaymentController paymentController = new PaymentController();
		FXMLLoad.fxmlLoad(paymentController, payment);


		for (int buttonX = 0; buttonX < 2; buttonX++) {
			for (int buttonY = 0; buttonY < 3; buttonY++) {
				Button inputButton = new Button();
				InputController inputController = new InputController(buttonX + buttonY);
				FXMLLoad.fxmlLoad(inputController, inputButton);
				this.input.add(inputButton, buttonX, buttonY);
			}
		}

		this.mid.add(wallet, 0, 0);
		this.mid.add(payback, 1, 0);
		this.mid.add(payment, 1, 1);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/MidLayout.fxml");
		return url;
	}

}
