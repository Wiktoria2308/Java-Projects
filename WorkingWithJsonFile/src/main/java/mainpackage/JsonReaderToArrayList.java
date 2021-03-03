package mainpackage;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


import org.json.simple.parser.ParseException;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonReaderToArrayList {
	
	public JsonReaderToArrayList() {
		
	}
	
	
	//method which read json and print it to console
	public void readJsonFromFile(String filename) throws FileNotFoundException, IOException, ParseException {
		try {
		    // create a reader
		    Reader reader = Files.newBufferedReader(Paths.get(filename));

		    //create JsonObject instance
		    JsonObject parser = JsonParser.parseReader(reader).getAsJsonObject();

		    ArrayList <Member> members = new ArrayList <Member> ();
		    // read projects
		    for (JsonElement project : parser.get("members").getAsJsonArray()) {
		        JsonObject obj = project.getAsJsonObject();
		        String name = obj.get("name").getAsString();
		        String id = obj.get("id").getAsString();
		        Member m = new Member(name, id);
		        members.add(m);
		        
		    }
		    
		    for (int i = 0; i < members.size(); i++) {
		    	System.out.println(members.get(i).toString());
		    }

		   
		    //close reader
		    reader.close();

		} catch (Exception ex) {
		    ex.printStackTrace();
		}
	}
	
	
	//method which return arraylist med json data 
	public ArrayList <Member> jsonToArray(String filename) throws FileNotFoundException, IOException, ParseException {
		
		    // create a reader
		    Reader reader = Files.newBufferedReader(Paths.get(filename));

		    //create JsonObject instance
		    JsonObject parser = JsonParser.parseReader(reader).getAsJsonObject();

		    ArrayList <Member> members = new ArrayList <Member> ();
		    // read projects
		    for (JsonElement project : parser.get("members").getAsJsonArray()) {
		        JsonObject obj = project.getAsJsonObject();
		        String name = obj.get("name").getAsString();
		        String id = obj.get("id").getAsString();
		        Member m = new Member(name, id);
		        members.add(m);
		        
		    }
		  //close reader
		    reader.close();
		    
		    return members;
	}

}
