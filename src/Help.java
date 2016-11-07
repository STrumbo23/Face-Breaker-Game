import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Help extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage mainStage) {
		mainStage.setTitle("Help");
		
		
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 800, 500);
		root.getChildren().addAll();
		mainStage.setScene(scene);
	    mainStage.show();
	}
}
