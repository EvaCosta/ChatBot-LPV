package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Main extends Application {
	private static Scene mainScene;

	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/lpv/tp/chatbot/fxml/ChatBot.fxml"));
			Scene scene = new Scene(root,891,641);
			scene.getStylesheets().add(getClass().getResource("/lpv/tp/chatbot/css/application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("ChatBot JavaFX");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	public static Scene getMainScene() {
		return mainScene;
	}


}
