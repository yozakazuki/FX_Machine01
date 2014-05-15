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

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		Label label = new Label();
		HistoryLabelController historyLabelController = new HistoryLabelController();
		FXMLLoad.fxmlLoad(historyLabelController, label);

		TextArea textArea = new TextArea();
		HistoryTextAreaController historyTextAreaController = new HistoryTextAreaController();
		FXMLLoad.fxmlLoad(historyTextAreaController, textArea);

		this.bot.add(label, 0, 0);
		this.bot.add(textArea, 0, 1);
	}

	@Override
	public URL getUrl() {
		URL url = this.getClass().getResource("../view/fxml/BotLayout.fxml");
		return url;
	}

}
