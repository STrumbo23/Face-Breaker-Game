import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainMenu extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override 
	public void start(Stage mainStage) {
		mainStage.setTitle("FaceBreaker Game!");
		Label title = new Label("FACE BREAKER GAME");
		title.getStyleClass().add("title");
		
		Button playGame = new Button("Click to Play!");
		Button highScore = new Button("High Scores");
		Button help = new Button("Help");
		
		Rectangle soundSettings = new Rectangle();
		soundSettings.setWidth(50);
		soundSettings.setHeight(50);
		
		Image soundOn = new Image(getClass().getResource("sound_on.png").toExternalForm());
		ImagePattern soundOnView = new ImagePattern(soundOn);
		Image soundOff = new Image(getClass().getResource("music_off-512.png").toExternalForm());
		ImagePattern soundOffView = new ImagePattern(soundOff);
		
		soundSettings.setFill(soundOnView);

		playGame.setOnAction(new EventHandler<ActionEvent>() {
		    @Override public void handle(ActionEvent e) {
		    	PlayGame newGame = new PlayGame();
		    }
		});
		
		 soundSettings.setOnMouseClicked(new EventHandler<MouseEvent>(){
	            @Override public void handle(MouseEvent t) {
	            	soundSettings.setFill(soundOffView);
	          }
		});
		
		VBox buttons = new VBox();
		buttons.setSpacing(10);
		buttons.setPadding(new Insets(10, 20, 10, 20)); 
		buttons.getChildren().addAll(playGame, highScore, help, soundSettings);
		buttons.getStyleClass().add("buttons");

		StackPane root = new StackPane();
		StackPane.setAlignment(title, Pos.TOP_CENTER);
        root.getChildren().addAll(title, buttons);
        Scene scene = new Scene(root, 800, 500);
        scene.getStylesheets().add(this.getClass()
        		.getResource("stylesheet.css").toExternalForm());
        
        mainStage.setScene(scene);
        mainStage.show();
		
	}

}
