import java.awt.Color;

import javafx.animation.Timeline;
import javafx.animation.KeyFrame;
import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Example_Ball extends Application{
	
	public void start(final Stage primaryStage){
		Pane canvas = new Pane();
		Scene scene = new Scene(canvas, 800,700);
		primaryStage.setTitle("Example Ball");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		Circle circle = new Circle (30);
		circle.setLayoutX(185);
		circle.setLayoutY(185);
		DoubleProperty circleX = new SimpleDoubleProperty(circle.getLayoutX());
		DoubleProperty circleY = new SimpleDoubleProperty(circle.getLayoutY());
		
		
		Image smiley = new Image (getClass().getResource("Emotes-face-kiss-icon.png").toExternalForm());
		ImagePattern imagePattern = new ImagePattern(smiley);
		circle.setFill(imagePattern);
		//smiley.set(150);
		//smiley.setY(150);
//		circle.layoutXProperty().addListener(new ChangeListener(){
//	        @Override public void changed(ObservableValue o,Object oldVal, 
//	                 Object newVal){
//	             smiley.setX(circle.getLayoutX()-circle.getRadius()-5);
//	             System.out.println("done");
//	        }
//	      });
//		circle.layoutYProperty().addListener(new ChangeListener(){
//	        @Override public void changed(ObservableValue o,Object oldVal, 
//	                 Object newVal){
//	             smiley.setY(circle.getLayoutX()-circle.getRadius()-5);
//	             System.out.println("done");
//	        }
//	      });
		circle.setLayoutX(250);
		circle.setLayoutY(250);

		canvas.getChildren().addAll(circle);
		
	      final Timeline loop = new Timeline(new KeyFrame(Duration.millis(20), new EventHandler<ActionEvent>() {

	            double deltaX = 1;
	            double deltaY = 1;
	            final Bounds bounds = canvas.getBoundsInLocal();
	            @Override
	            public void handle(final ActionEvent t) {
	                circle.setLayoutX(circle.getLayoutX() + deltaX);
	                circle.setLayoutY(circle.getLayoutY() + deltaY);
	                
	                
	                System.out.println("X Max: "+bounds.getMaxX());
	                System.out.println("Y Max: "+bounds.getMaxY());

	                final boolean atRightBorder = circle.getLayoutX() >= (bounds.getMaxX()-circle.getRadius());
	                final boolean atLeftBorder = circle.getLayoutX() <= (bounds.getMinX() + circle.getRadius());
	                final boolean atBottomBorder = circle.getLayoutY() >= (bounds.getMaxY() - circle.getRadius());
	                final boolean atTopBorder = circle.getLayoutY() <= (bounds.getMinY() + circle.getRadius());
	                
	                if (atRightBorder || atLeftBorder) {
	                    deltaX *= -1;
	                }
	                if (atBottomBorder || atTopBorder) {
	                    deltaY *= -1;
	                }
	                
	            }
	        }));

	        loop.setCycleCount(Timeline.INDEFINITE);
	        loop.play();
		
		
	}
	
	public static void main(String[] args){
		launch(args);
	}
}
