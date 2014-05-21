package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import application.helper.FXMLLoad;

public class BotController implements Initializable, ControllerIFace {
	@FXML GridPane bot;

	private TextArea textArea;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		HistoryLabelController historyLabelController = new HistoryLabelController();
		Label label = (Label) FXMLLoad.fxmlLoad(historyLabelController);

		HistoryTextAreaController historyTextAreaController = new HistoryTextAreaController();
		this.textArea = (TextArea) FXMLLoad.fxmlLoad(historyTextAreaController);

		this.bot.add(label, 0, 0);
		this.bot.add(this.textArea, 0, 1);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/BotLayout.fxml");
		return url;
	}

	public void writeDrinkHistory(String drinkName, String drinkPrice) {
		String crlf = System.getProperty("line.separator");
		this.textArea.appendText(drinkName + " : " + drinkPrice + "円" + crlf);
	}

}
