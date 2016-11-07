import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Help extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage mainStage) {
		mainStage.setTitle("Help");
		
		StringBuilder text = addText();
		Text help = new Text();
		help.setText(text.toString());
		
		StackPane root = new StackPane();
		Scene scene = new Scene(root, 800, 500);
		root.getChildren().addAll(help);

		mainStage.setScene(scene);
	    mainStage.show();
	}
	
	public StringBuilder addText() {
        StringBuilder contents = new StringBuilder();
        
        try {
            BufferedReader input =  new BufferedReader(new FileReader("instructions.txt"));
            try {
                String line = null;
                while (( line = input.readLine()) != null) {
                    contents.append(line);
                    contents.append(System.getProperty("line.separator"));
                }
            }
            finally {
                input.close();
            }
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println(contents.toString());
        return contents;
	}
    
}
