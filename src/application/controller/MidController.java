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
import application.system.constant.Constant;

public class MidController implements ControllerIFace, Initializable {
	@FXML GridPane mid;
	@FXML GridPane inputGrid;
	@FXML TextField wallet;
	@FXML Button paybackButton;
	@FXML TextField payment;

	private ArrayList<Button> drinkButtonList;

	public MidController(ArrayList<Button> _drinkButtonList) {
		this.drinkButtonList = _drinkButtonList;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ArrayList<RadioButton> radioList = new ArrayList<RadioButton>();

		for (int i = 0; i < drinkButtonList.size(); i++) {
			Button drinkButton = drinkButtonList.get(i);
			radioList.add((RadioButton) drinkButton.getGraphic());
		}

		this.wallet.setText(Constant.getDefaultWalletText());
		this.wallet.setEditable(false);

		for (int x = 0; x < 2; x++) {
			for (int y = 0; y < 2; y++) {
				Input input        = new Input((x * 2) + y);
				Button inputButton = new Button();
				inputButton.setText(String.valueOf(input.getInputMoney()));
				this.inputGrid.add(inputButton, x, y);

				InputButtonAction inputButtonAction = new InputButtonAction(this.wallet, this.payment, inputButton, radioList);
				inputButton.setOnAction(inputButtonAction);
			}
		}

		this.paybackButton.setText("お釣りボタン");
		this.payment.setText("0");
		this.payment.setEditable(false);

		PaybackButtonAction paybackButtonAction = new PaybackButtonAction(this.wallet, this.payment, radioList);
		this.paybackButton.setOnAction(paybackButtonAction);
	}

	@Override
	public URL getUrl() {
		URL url = MainApplication.class.getResource("view/fxml/MidLayout.fxml");
		return url;
	}

	public TextField getPayment() {
		return this.payment;
	}

}
