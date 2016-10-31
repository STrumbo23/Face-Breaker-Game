import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ScoreMainClass extends Application {

	public static void main(String[] args) {
<<<<<<< HEAD
		HighScore hs = new HighScore();
		hs.addScore("Jarrett", 1);
		hs.addScore("John", 2);
		hs.addScore("Laura", 3);
		hs.addScore("Hunter", 4);
		hs.addScore("Sean", 5);
=======
		/*HighScore hs = new HighScore();
		hs.addScore("Jarrett", 9001);
		hs.addScore("John", 230);
		hs.addScore("Laura", 220);
		hs.addScore("Hunter", 210);
		hs.addScore("Sean", 200);
		*/
		//System.out.println(hs.getHighScoreString());
>>>>>>> 52ce86380802114e79c69ef1d83f9281eb5888bc
		
		launch(args);
	}
	
	@Override 
	public void start(Stage mainStage) {
		mainStage.setTitle("High Scores");
		
		HighScore hs = new HighScore();
		hs.addScore("jarrett", 900);
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 500, 300);
		mainStage.setScene(scene);
	    mainStage.show();
	}
}