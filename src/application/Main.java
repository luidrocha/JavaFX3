package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	@Override

	public void start(Stage stage) {

		try {

			// Cria um objeto do tipo Parent para guardar a view

			Parent parent = FXMLLoader.load(getClass().getResource("/gui/View.fxml"));
			// Associa a view ao objeto scene
			Scene scene = new Scene(parent);
			// seta o objeto scene no palco stage
			stage.setScene(scene);
			// Exibe o objeto
			stage.show();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
