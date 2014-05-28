package application.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Wallet {
	private IntegerProperty intWalletPro;

	public Wallet(String defaultWalletText) {
		this.intWalletPro = new SimpleIntegerProperty();
		this.intWalletPro.setValue(Integer.valueOf(defaultWalletText));
	}

	@Override
	public String toString() {
		String text = this.intWalletPro.asString().get();
		return text;
	}

	public IntegerProperty intWalletPro() {
		return this.intWalletPro;
	}

	public void paid(int inputMoney) {
		Number num = this.intWalletPro.getValue();
		int intNum = num.intValue();
		intNum    -= inputMoney;
		intWalletPro.setValue(intNum);
	}

	public void payback(IntegerProperty intPaymentPro) {
		Number walletNum = this.intWalletPro.getValue();
		int intWalletNum = walletNum.intValue();

		Number paymentNum = intPaymentPro.getValue();
		int intPaymentNum = paymentNum.intValue();

		intWalletNum += intPaymentNum;
		this.intWalletPro().setValue(intWalletNum);
	}

}
