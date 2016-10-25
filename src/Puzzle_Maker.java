import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Puzzle_Maker {

	private int adjustedWidth;
	Pane canvas;
	int offSet;
	Brick brick;
	
	public Puzzle_Maker(int windowSize, int offSet,Pane canvas){
		adjustedWidth = windowSize/offSet;
		this.canvas = canvas;
		this.offSet = offSet;
	}
	
	public void makePuzzle(Color color, int...indexes){
		for (int i=0; i<indexes.length; i++){
			System.out.println(indexes[i]-1);
			brick = new Brick(color,brickXPos(indexes[i]-1),brickYPos(indexes[i]-1),offSet,offSet/2);
			brick.addBlock(canvas);
		}
	}
	public double brickXPos(int i){
		return (i%adjustedWidth)*offSet;
	}
	public double brickYPos (int i){
		return (i/adjustedWidth)*(offSet/2);
	}
	
}
