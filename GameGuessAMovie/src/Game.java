import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {
	Scanner scan = new Scanner(System.in);
	
	
	private final int chances = 10;
	
	
	private ArrayList<String> movies;
	
	public Game() {
		setMovie(new ArrayList <String>());
	}
	
	public ArrayList<String> getMovie(){
		return movies;
	}
	
	public void setMovie(ArrayList <String> movies) {
		this.movies = movies;
	}
	
	public void addMovie(String movie) {
		getMovie().add(movie);
	}
	
	public String getRandomElement() 
    { 
		
        Random rand = new Random(); 
        return movies.get(rand.nextInt(movies.size()));
    } 
	public String replace(String str, int index, char replace){     
	    if(str==null){
	        return str;
	    }else if(index<0 || index>=str.length()){
	        return str;
	    }
	    char[] chars = str.toCharArray();
	    chars[index] = replace;
	    return String.valueOf(chars);       
	}
	
	public char getLetter(String dash) {
		char letter;
		System.out.println("You are guessing: " + dash);
		System.out.print("Guess a letter: ");
		letter = scan.nextLine().charAt(0);
		return letter;
	}
	
	public void startGame(String movie) {
		
		int index;
		String dash = "";
		char letter;
		
		for(int k = 1; k <= movie.length(); k++) {
			
			dash += "_";
		}
		int i = 0;
		
		while(i <= chances) {
			
			letter = getLetter(dash);
			
			
			for(int j = 0; j < movie.length();j++) {
				char [] chars = movie.toCharArray();
				if(chars[j] == letter) {
					index = j;
			dash = replace(dash, index, letter);
			}
			}
							
			if(dash.contains("_") == false) {

				System.out.println("You win!\nMovie's name is " + dash + "!");
				
				break;
			}
			i++;
				
					}
		if(i == 11) {
		System.out.println("You have used 10 chances you had in this game.");
		System.out.println("Game over");
		}

		
				}
	
			}
	
		
	
	


