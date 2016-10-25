import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class ExamplePuzzles {
	Puzzle_Maker puzzleMaker;
	
	public ExamplePuzzles(int windowSize, int offSet, Pane canvas){
		puzzleMaker = new Puzzle_Maker (windowSize,offSet,canvas);
	}
	
	public void level(int i){
		switch (i){
			case 1: puzzleMaker.makePuzzle(Color.YELLOWGREEN, 7, 8, 9, 21, 25, 35, 41, 49, 57, 64, 72, 80, 86, 96, 100, 112, 113, 114, 52,
					53, 67, 68, 54, 69);
					break;
			case 2: puzzleMaker.makePuzzle(Color.ORANGE, 7,8,9,21,22,24,25,35,36,40,41,49,50,52,54,56,57,63,64,67,69,72,73,78,79,87,88,93,94,96,97,99,100,102,103,109,110,112,113,114,116,117,125,126,130,131,141,142,144,145,157,158,159);
					break;
			case 3: puzzleMaker.makePuzzle(Color.CRIMSON, 1,3,5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35,37,39,41,43,45,47,49,51,53,55,57,59,61,63,65,67,69,71,73,75,77,79,81,83,85,87,89,91,93,95,97,99,101,103,105,107,109,111,113,115,117,119,121,123,125,127,129,131,133,135);
					break;
			case 4: puzzleMaker.makePuzzle(Color.LIGHTBLUE,1,16,31,46,61,76,91,106,121,136,15,30,45,60,75,90,105,120,135,150,3,18,33,48,63,78,93,108,123,138,5,20,35,50,65,80,95,110,125,140,7,22,37,52,67,82,97,112,127,142,9,24,39,54,69,84,99,114,129,144,11,26,41,56,71,86,101,116,131,146,13,28,43,58,73,88,103,118,133,148);
					break;
			case 5:  
					break;
			default: System.out.println();
					break;
		}
	}
}
