import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ScoreMainClass extends Application {

	public static void main(String[] args) {
		launch(args);
	}
	
	@SuppressWarnings("unchecked")
	@Override 
	public void start(Stage mainStage) throws FileNotFoundException {
		mainStage.setTitle("High Scores");
		mainStage.setWidth(500);
		mainStage.setHeight(500);

		HighScore hs = new HighScore();
		
		Object[] sorted = hs.returnScores().entrySet().toArray();
		Arrays.sort(sorted, new Comparator() {
				@Override
				public int compare(Object o1, Object o2) {
					// TODO Auto-generated method stub
					return((Map.Entry<String, Integer>) o2).getValue()
							.compareTo(((Map.Entry<String, Integer>) o1).getValue());
				}
				
		});

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        
        int i = 0; 
        for (Object e : sorted) {
        	i++;
  		    String name = ((Map.Entry<String, Integer>) e).getKey().toString();
  		    String val = ((Map.Entry<String, Integer>) e).getValue().toString();
 
  		    Label this_score = new Label(i +". " + name + "  " + val);
  		    vbox.getChildren().add(this_score);
  		    
  		}
        
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 500, 500);
		root.getChildren().addAll(vbox);
		mainStage.setScene(scene);
	    mainStage.show();
	}
}