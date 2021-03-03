package bars;

import java.io.IOException;
import java.util.Scanner;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class Welcome {
	
	Scanner scan = new Scanner(System.in);

	boolean play = true;
	
	public void WelcomeMenu() {
		System.out.println(">> What do you want to do?\n>> 1. See all bars's information.\n>> 2. See only names of all bars.\n"
				+ ">> 3. See sorted bars based on highest protein content.\n>> 4. See sorted bars based on highest fat content.\n"
				+ ">> 5. Filter bars which has less fiber that you will choose and sort them from highest to lowest.\n"
				+ ">> 6. Find all protein bars with more than your number protein reviewed by some reviewer.");
	}

	public  void ContinueYesOrNo(){
		System.out.println("Do you want to continue?\n1. Yes\n2. No");
		int what = 0;
		try {
		what = Integer.parseInt(scan.next());
		}
		catch(java.lang.NumberFormatException ex) {
			System.out.println("Bad input");
		}
		if(what == 1) {
			WelcomeMenu();
			
		}
		else if(what == 2) {
			play = false;
			System.out.println("Thank you and goodbye!");
		}
		
		
	}

	public void play() throws ParserConfigurationException, SAXException, IOException {
	WelcomeMenu();
	
	while(play == true) {
		
		int choice = scan.nextInt();
		switch(choice) {
		
		case 1:
			//this class object has a method which prints all bars and information about them
			DOMParserBars bars = new DOMParserBars();
			
			//this is printing all bars and information about them
			bars.printAllBars("bars.xml");
			ContinueYesOrNo();
			break;
		case 2:
			//this class object has a method which prints all bars names
			PrintBarsNames names = new PrintBarsNames();
			
			//this method print all bars names from 1 to 500
			names.printNames("bars.xml");
			ContinueYesOrNo();
			break;
		case 3:
			//object of class which contains a method which is sorting bars from highest protein level to lowest
			SortBarsByProtein proteins = new SortBarsByProtein();
			
			//print sorted bars from highest protein level do lowest
			proteins.printProteins("bars.xml");
			ContinueYesOrNo();
			break;
		case 4:
			SortBarsByFat fats = new SortBarsByFat();
			fats.printFat("bars.xml");
			ContinueYesOrNo();
			break;
		case 5:
			SortBarsByFiberInput fibers = new SortBarsByFiberInput();
			System.out.println("Write fiber in double: ");
			double input = scan.nextDouble();
			fibers.printFiber("bars.xml", input);
			ContinueYesOrNo();
			break;
		case 6:
			/*System.out.println("Write protein in double: ");
			double protein = scan.nextDouble();
			System.out.println("Write reviewer ID number: ");
			String ID = scan.nextLine();*/
			/*WhichReviewer reviewer = new WhichReviewer();
			reviewer.printReviewer("bars.xml");
			ContinueYesOrNo();*/
			break;
			
		}
		}
	
	}

}
