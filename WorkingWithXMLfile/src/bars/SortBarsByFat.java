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

public class SortBarsByFat {

	public SortBarsByFat() {
		
	}
	
public ArrayList<FatBar> proteins = new ArrayList<FatBar>();
	
	
	public void printFat(String filename) throws ParserConfigurationException, SAXException, IOException {
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = factory.newDocumentBuilder();
    File file = new File(filename);
    Document doc = docBuilder.parse(file);
 
 // Get a list of all elements in the document
    // The wild card * matches all tags
    NodeList list = doc.getElementsByTagName("*");
   
    for (int i = 0; i < list.getLength(); i++) {
    	
    	
    	FatBar fatBar = new FatBar();
       // Get the elements book (attribute isbn), title, author
       Element element = (Element)list.item(i);
       String nodeName = element.getNodeName();
       String BAR = nodeName.substring(nodeName.length() -3);
       if (BAR.equals("BAR")) {
        
          fatBar.setName(nodeName);
       // Get the child elements <title> of <book>, only one
       NodeList proteinNodes = element.getElementsByTagName("fett");
       Element proteinElement = (Element)proteinNodes.item(0);
       double fett = Double.parseDouble(proteinElement.getTextContent());
       fatBar.setFat(fett);
       proteins.add(fatBar);
       }   
    }  
     proteins.stream()
       .sorted(Comparator.comparing(FatBar::getFat).reversed()) 
  	   .map(bar -> bar.getDetails())
  	   .forEach(details -> System.out.println(details));

	}
}
