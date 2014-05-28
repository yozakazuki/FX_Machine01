package application.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import application.MainApplication;
import application.action.InputButtonAction;
import application.action.PaybackButtonAction;
import application.model.Input;
import application.model.Payment;
import application.model.Wallet;
import application.system.constant.Constant;

public class MidController implements ControllerIFace, Initializable {
	@FXML GridPane mid;
	@FXML GridPane inputGrid;
	@FXML TextField wallet;
	@FXML Button paybackButton;
	@FXML TextField payment;

	private ArrayList<Button> drinkButtonList;
	private Payment paymentModel;

	public MidController(ArrayList<Button> _drinkButtonList, Payment _paymentModel) {
		this.drinkButtonList = _drinkButtonList;
		this.paymentModel    = _paymentModel;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ArrayList<RadioButton> radioList = new ArrayList<RadioButton>();
		Wallet walletModel = new Wallet(Constant.getWalletText());

		for (int i = 0; i < drinkButtonList.size(); i++) {
			Button drinkButton = drinkButtonList.get(i);
			radioList.add((RadioButton) drinkButton.getGraphic());
		}

		this.wallet.setText(Constant.getWalletText());
		this.wallet.setEditable(false);

		this.paybackButton.setText("お釣りボタン");

		this.payment.setText("0");
		this.payment.setEditable(false);

		int rowMax    = 2;
		int columnMax = 2;

		for (int x = 0; x < rowMax; x++) {
			for (int y = 0; y < columnMax; y++) {
				Input input        = new Input((x * rowMax) + y);
				Button inputButton = new Button();
				inputButton.setText(String.valueOf(input.getInputMoney()));
				this.inputGrid.add(inputButton, x, y);

				InputButtonAction inputButtonAction = new InputButtonAction(walletModel, paymentModel, inputButton, radioList);
				inputButton.setOnAction(inputButtonAction);
			}
		}

		PaybackButtonAction paybackButtonAction = new PaybackButtonAction(walletModel, paymentModel, radioList);
		this.paybackButton.setOnAction(paybackButtonAction);

		this.wallet.textProperty().bind(walletModel.intWalletPro().asString());
		this.payment.textProperty().bind(paymentModel.intPaymentPro().asString());
	}

	@Override
	public URL getUrl() {
		URL url = MainApplication.class.getResource("view/fxml/MidLayout.fxml");
		return url;
	}

}
