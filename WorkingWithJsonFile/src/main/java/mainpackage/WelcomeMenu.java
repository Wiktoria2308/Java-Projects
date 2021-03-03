package mainpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class WelcomeMenu {
	
	
	public WelcomeMenu() {
		this.members = new ArrayList<>();
	}
	JsonReaderToArrayList reader = new JsonReaderToArrayList();
	Scanner scan = new Scanner(System.in);
	private ArrayList<Member> members;
	 //variable finished for first loop which navigate welcome menu
	private boolean finished = false;
	
	public String inputString() {
		String text;
		text = scan.nextLine();
		if(text.isEmpty()) {
			text = scan.nextLine();
		}
		return text;
	}
	
	 public void fileToArrayList() throws FileNotFoundException, IOException, ParseException
	    {
		 JsonReaderToArrayList reader = new JsonReaderToArrayList();
		 members = reader.jsonToArray("member-list.json");
		 
	    }
	 
	 @SuppressWarnings("unchecked")
	public void writeJson() throws FileNotFoundException, IOException, ParseException {

			// creating JSONObject 
	        JSONObject jsonobject = new JSONObject(); 
			
	        
	     // for phone numbers, first create JSONArray  
	        JSONArray jsonarray = new JSONArray(); 
	     // adding map to list 
	        
	        for(int i = 0; i < members.size(); i++) {
	        Map<String, String> map = new LinkedHashMap<String, String>();
	        String name = members.get(i).getName();
	        String id = members.get(i).getID();
	        map.put("name",name ); 
	        map.put("id", id); 
	        jsonarray.add(map);
	        }
	        
	          
	        // writing JSON to file with pretty print
	     // putting phoneNumbers to JSONObject 
	        jsonobject.put("members", jsonarray); 
	        
	        
	        PrintWriter pw = new PrintWriter("member-list.json"); 
	        Gson gson = new GsonBuilder().setPrettyPrinting().create();
	        String prettyJson = gson.toJson(jsonobject);
	        
	        pw.write(prettyJson); 
	          
	        pw.flush(); 
	        pw.close(); 
	    }
	 
	 public void welcome() {
		 System.out.println("Welcome in Members List");
			System.out.println("What do you want to do:");
			System.out.println("1. Show all members\n2. Add new member");
	 }
	 
		public void printQuitOrNo() {
			System.out.println("Do you want to continue? Y/N:");
			String YesOrNo = inputString();
			if(YesOrNo.charAt(0) == 'Y' || YesOrNo.charAt(0) == 'y') {
				welcome();
			}
			else if(YesOrNo.charAt(0) == 'N' || YesOrNo.charAt(0) == 'n') {
				finished = true;
				System.out.println("Bye!");
			}
			else {
				System.out.println("Invalid input: You have to write Y or N!\n");
				
				printQuitOrNo();
			}

	}
	 

	public void printMenu() throws FileNotFoundException, IOException, ParseException {
		welcome();
		while (finished == false) {
		int choice = scan.nextInt();
		if(choice == 1) {
			reader.readJsonFromFile("member-list.json");
			printQuitOrNo();
		}
		else {
			fileToArrayList();
			System.out.println("Write a name: ");
			String name = inputString();
			
			System.out.println("Write an id: ");
			String id = inputString();
			
			Member m = new Member(name, id);
			members.add(m);
			writeJson();
			reader.readJsonFromFile("member-list.json");
			printQuitOrNo();
		}
		}
	}
}
