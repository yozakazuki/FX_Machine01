package application.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import application.MainApplication;
import application.action.DrinkButtonAction;
import application.model.History;
import application.model.Payment;

public class TopController implements ControllerIFace, Initializable {
	@FXML GridPane top;

	private ArrayList<Button> drinkButtonList;
	private Payment paymentModel;
	private History historyModel;
	private int row;
	private int column;

	public TopController(ArrayList<Button> _drinkButtonList, Payment _paymentModel, History _historyModel, int _row, int _column) {
		this.drinkButtonList = _drinkButtonList;
		this.paymentModel    = _paymentModel;
		this.historyModel    = _historyModel;
		this.row             = _row;
		this.column          = _column;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ArrayList<RadioButton> radioList = new ArrayList<RadioButton>();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				Button drinkButton = drinkButtonList.get((i*2) + j);
				this.top.add(drinkButton, i, j);	
				radioList.add((RadioButton) drinkButton.getGraphic());
				DrinkButtonAction drinkButtonAction = new DrinkButtonAction(paymentModel, historyModel, drinkButton, radioList);
				drinkButton.setOnAction(drinkButtonAction);
			}
		}
	}

	@Override
	public URL getUrl() {
		URL url = MainApplication.class.getResource("view/fxml/TopLayout.fxml");
		return url;
	}

}
