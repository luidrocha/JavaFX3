package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class ViewController {

	@FXML
	private Button onButtonCick;

	@FXML
	public void onBottonclickActive() {

	Alerts.showAlert("Tituo" , "Cabecalho" , "Conteudo", AlertType.ERROR);

	}

}
                                                                                                                                        