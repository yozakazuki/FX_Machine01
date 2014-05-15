package application.view;


import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import application.controller.WalletController;
import application.helper.FXMLLoad;

public class Mid extends GridPane {

	public Mid() {
		System.out.println("Mid開始");
		TextField wallet = new TextField();
		System.out.println("walletインスタンス化");
		WalletController controller = new WalletController();
		System.out.println("controllerインスタンス化");
		FXMLLoad.fxmlLoad(controller, wallet);
		System.out.println("FXMLLoad終了");
		this.add(wallet, 0, 0);
		System.out.println("Mid終了");
	}

}
