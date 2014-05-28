package application.model;

import java.util.ArrayList;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.RadioButton;

public class Payment {
	private IntegerProperty intPaymentPro;

	public Payment() {
		this.intPaymentPro = new SimpleIntegerProperty();
	}

	@Override
	public String toString() {
		String text = this.intPaymentPro.asString().get();
		return text;
	}

	public IntegerProperty intPaymentPro() {
		return this.intPaymentPro;
	}

	public boolean canPurchase(int drinkPrice) {
		Number paymentNum = this.intPaymentPro.getValue();
		int intPaymentNum = paymentNum.intValue();
		return (intPaymentNum < drinkPrice); 
	}

	public void paid(int inputMoney) {
		Number paymentNum = this.intPaymentPro.getValue();
		int intPaymentNum = paymentNum.intValue();
		intPaymentNum += inputMoney;
		this.intPaymentPro.setValue(intPaymentNum);
	}

	public void payback() {
		this.intPaymentPro.setValue(0);
	}

	public void bought(int drinkPrice) {
		Number paymentNum = this.intPaymentPro.getValue();
		int intPaymentNum = paymentNum.intValue();
		intPaymentNum -= drinkPrice;
		this.intPaymentPro.setValue(intPaymentNum);
	}

	public void setLight(ArrayList<RadioButton> radioList) {
		Number paymentNum = this.intPaymentPro.getValue();
		int intPaymentNum = paymentNum.intValue();
		for (int i = 0; i < radioList.size(); i++) {
			RadioButton radio = radioList.get(i);
			int drinkPrice    = Integer.valueOf(radio.getText());
			radio.setSelected(drinkPrice <= intPaymentNum);
		}
	}



}
