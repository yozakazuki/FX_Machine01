package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import application.action.InputAction;
import application.action.PaybackAction;
import application.helper.FXMLLoad;

public class MidController implements Initializable, ControllerIFace {
	@FXML GridPane mid;
	@FXML GridPane inputGrid;

	private TextField payment;
	private TopController topController;

	public MidController(TopController _topController) {
		this.topController = _topController;
	}	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		WalletController walletController = new WalletController();
		TextField wallet = (TextField) FXMLLoad.fxmlLoad(walletController);

		PaybackController paybackController = new PaybackController();
		Button paybackButton = (Button) FXMLLoad.fxmlLoad(paybackController);

		PaymentController paymentController = new PaymentController();
		this.payment = (TextField) FXMLLoad.fxmlLoad(paymentController);

		for (int buttonX = 0; buttonX < 2; buttonX++) {
			for (int buttonY = 0; buttonY < 3; buttonY++) {
				InputController inputController = new InputController((buttonX * 3) + buttonY);
				Button inputButton = (Button) FXMLLoad.fxmlLoad(inputController);
				this.inputGrid.add(inputButton, buttonX, buttonY);

				InputAction inputAction = new InputAction(inputButton, wallet, this.payment, this.topController);
				inputButton.setOnAction(inputAction);
			}
		}

		PaybackAction paybackAction = new PaybackAction(wallet, this.payment, this.topController);
		paybackButton.setOnAction(paybackAction);

		this.mid.add(wallet , 0, 0);
		this.mid.add(paybackButton, 1, 0);
		this.mid.add(this.payment, 1, 1);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/MidLayout.fxml");
		return url;
	}

	public TextField getPayment() {
		return payment;
	}

}
