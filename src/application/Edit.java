package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Edit extends Application {
	
public static Stage primaryStage;
	
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("edit.fxml"));
		Pane root = loader.load();
	
		Scene s = new Scene(root);
		this.primaryStage.setScene(s);
		this.primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
