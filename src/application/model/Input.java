package application.model;

import application.system.constant.Constant;

public class Input {
	private final int inputMoney;

	public Input(int index) {
		this.inputMoney = Constant.getInputMoney(index);
	}

	public int getInputMoney() {
		return inputMoney;
	}
}
