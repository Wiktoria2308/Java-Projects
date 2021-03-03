package mainpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		
		WelcomeMenu welcome = new WelcomeMenu();
		welcome.printMenu();
	}

}
