package application.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import application.action.DrinkButtonAction;
import application.helper.FXMLLoad;

public class TopController implements Initializable, ControllerIFace {
	@FXML GridPane top;

	private ArrayList<RadioButton> radioList;
	private MidController midController;
	private BotController botController;

	public TopController(BotController _botController) {
		this.botController = _botController;	
	} 

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.radioList = new ArrayList<RadioButton>();

		for (int buttonX = 0; buttonX < 4; buttonX++) {
			for (int buttonY = 0; buttonY < 2; buttonY++) {
				RadioButton radio = new RadioButton();
				DrinkController drinkButtonController = new DrinkController(radio);
				Button drinkButton = (Button) FXMLLoad.fxmlLoad(drinkButtonController);

				drinkButton.setGraphic(radio);
				int drinkPrice = Integer.valueOf(radio.getText());   // drinkの値段はRadioButtonに書かれている
				this.radioList.add(radio);
				this.top.add(drinkButton, buttonX, buttonY);

				String drinkName = drinkButton.getText();
				DrinkButtonAction drinkButtonAction = new DrinkButtonAction(drinkName ,drinkPrice, this, this.midController, this.botController);
				drinkButton.setOnAction(drinkButtonAction);
			}
		}
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/TopLayout.fxml");
		return url;
	}

	public void setLight(int paymentMoney) {
		for (int i = 0; i < this.radioList.size(); i++) {
			RadioButton radio = this.radioList.get(i);
			int drinkPrice = Integer.valueOf(radio.getText());   // drinkの値段はRadioButtonに書かれている
			radio.setSelected(drinkPrice <= paymentMoney);
		}
	}

	public void setMidController(MidController _midController) {
		this.midController = _midController;
	}

}
