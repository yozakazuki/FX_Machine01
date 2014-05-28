package application.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class History {
	private StringProperty strHistoryPro;

	public History() {
		this.strHistoryPro = new SimpleStringProperty();
	}

	public StringProperty strHistoryPro() {
		return this.strHistoryPro;
	}

	public void bought(String drinkName, String drinkPriceText) {
		String crlf = System.getProperty("line.separator");
		String log  = this.strHistoryPro.getValue();
		if (log == null) {
			this.strHistoryPro.setValue(drinkName + " : " + drinkPriceText + "円" + crlf);
			return;
		}
		this.strHistoryPro.setValue(log + drinkName + " : " + drinkPriceText + "円" + crlf);
	}

}
