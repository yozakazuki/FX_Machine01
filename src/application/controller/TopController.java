package application.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import application.MainApplication;
import application.action.DrinkButtonAction;

public class TopController implements ControllerIFace, Initializable {
	@FXML GridPane top;

	private TextField payment;
	private TextArea textArea;
	private ArrayList<Button> drinkButtonList;
	private int low;
	private int column;

	public TopController(ArrayList<Button> _drinkButtonList, int _low, int _column) {
		this.drinkButtonList = _drinkButtonList;
		this.low             = _low;
		this.column          = _column;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		ArrayList<RadioButton> radioList = new ArrayList<RadioButton>();
		for (int i = 0; i < low; i++) {
			for (int j = 0; j < column; j++) {
				Button drinkButton = drinkButtonList.get((i*2) + j);
				this.top.add(drinkButton, i, j);	
				radioList.add((RadioButton) drinkButton.getGraphic());
				DrinkButtonAction drinkButtonAction = new DrinkButtonAction(drinkButton, this.payment, radioList, this.textArea);
				drinkButton.setOnAction(drinkButtonAction);
			}
		}
	}

	@Override
	public URL getUrl() {
		URL url = MainApplication.class.getResource("view/fxml/TopLayout.fxml");
		return url;
	}

	public void setPayment(TextField _payment) {
		this.payment = _payment;
	}

	public void setTextArea(TextArea _textArea) {
		this.textArea = _textArea;
	}

}
