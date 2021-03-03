package mainpackage;



import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;






public class WriteJSON {

	public WriteJSON() {
		
	}
	
	
	@SuppressWarnings("unchecked")
	public void writeJson(String filename, String name, String id) throws FileNotFoundException, IOException, ParseException {

		// creating JSONObject 
        JSONObject jsonobject = new JSONObject(); 
		// for phone numbers, first create JSONArray  
        JSONArray jsonarray = new JSONArray(); 
        
        Map<String, String> m = new LinkedHashMap<String, String>(2); 
        m.put("name", name); 
        m.put("id", id); 
        
          
        // adding map to list 
        jsonarray.add(m);
        
          
        // putting phoneNumbers to JSONObject 
        jsonobject.put("members", jsonarray); 
        
       
          
        // writing JSON to file with pretty print
       
        
        
        PrintWriter pw = new PrintWriter(filename); 
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = gson.toJson(jsonobject);
        
        pw.write(prettyJson); 
          
        pw.flush(); 
        pw.close(); 
    } 
		
}
	


