package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class ForgotPw extends Application {
	
	public static Stage primaryStage;
	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage=primaryStage;
	
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("forgotpw.fxml"));
		Pane root = loader.load();

	
		Scene s = new Scene(root);
		this.primaryStage.setScene(s);
		this.primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
}

