
public class TestClass {

	public static void main(String[] args) {
		
		
		Game game1 = new Game();
		game1.addMovie("Moonlight");
		game1.addMovie("Jigsaw");
		game1.addMovie("Robocop");
		game1.addMovie("Scream");
		
		
		String movie = game1.getRandomElement();
		
		game1.startGame("Moonlight");

	}

}
