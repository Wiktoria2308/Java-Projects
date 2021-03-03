package bars;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SortBarsByProtein {
	
	public ArrayList<ProteinBar> proteins = new ArrayList<ProteinBar>();
	
	//Sort bars based on highest protein content.
	
	public SortBarsByProtein() {
		
	}
	
	public void printProteins(String filename) throws ParserConfigurationException, SAXException, IOException {
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = factory.newDocumentBuilder();
    File file = new File(filename);
    Document doc = docBuilder.parse(file);
 
 // Get a list of all elements in the document
    // The wild card * matches all tags
    NodeList list = doc.getElementsByTagName("*");
   
    for (int i = 0; i < list.getLength(); i++) {
    	
    	
    	ProteinBar proteinBar = new ProteinBar();
       // Get the elements book (attribute isbn), title, author
       Element element = (Element)list.item(i);
       String nodeName = element.getNodeName();
       String BAR = nodeName.substring(nodeName.length() -3);
       if (BAR.equals("BAR")) {
        
          proteinBar.setName(nodeName);
       // Get the child elements <title> of <book>, only one
       NodeList proteinNodes = element.getElementsByTagName("protein");
       Element proteinElement = (Element)proteinNodes.item(0);
       double protein = Double.parseDouble(proteinElement.getTextContent());
       proteinBar.setProtein(protein);
       proteins.add(proteinBar);
       }   
    }  
     proteins.stream()
       .sorted(Comparator.comparing(ProteinBar::getProtein).reversed()) //sorting bars from highest protein level to lowest
  	   .map(bar -> bar.getDetails())
  	   .forEach(details -> System.out.println(details));

	}
}
	      

	


