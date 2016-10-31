
public class ScoreMainClass {

	public static void main(String[] args) {
		HighScore hs = new HighScore();
		hs.addScore("Jarrett", 1);
		hs.addScore("John", 2);
		hs.addScore("Laura", 3);
		hs.addScore("Hunter", 4);
		hs.addScore("Sean", 5);
		
		System.out.println(hs.getHighScoreString());
	}
}