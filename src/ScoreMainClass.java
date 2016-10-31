
public class ScoreMainClass {

	public static void main(String[] args) {
		HighScore hs = new HighScore();
		hs.addScore("Jarrett", 240);
		hs.addScore("John", 230);
		hs.addScore("Laura", 220);
		hs.addScore("Hunter", 210);
		hs.addScore("Sean", 200);
		
		System.out.println(hs.getHighScoreString());
	}

}