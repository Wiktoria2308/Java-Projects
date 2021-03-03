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

public class SortBarsByFiberInput {
	
	
	public SortBarsByFiberInput() {
		
	}
	
	public ArrayList<FiberBar> fibers = new ArrayList<FiberBar>();
	
	public void printFiber(String filename, double input) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	    DocumentBuilder docBuilder = factory.newDocumentBuilder();
	    File file = new File(filename);
	    Document doc = docBuilder.parse(file);
	 
	 // Get a list of all elements in the document
	    // The wild card * matches all tags
	    NodeList list = doc.getElementsByTagName("*");
	   
	    for (int i = 0; i < list.getLength(); i++) {
	    	
	    	
	    	FiberBar fiberBar = new FiberBar();
	       // Get the elements book (attribute isbn), title, author
	       Element element = (Element)list.item(i);
	       String nodeName = element.getNodeName();
	       String BAR = nodeName.substring(nodeName.length() -3);
	       if (BAR.equals("BAR")) {
	        
	          fiberBar.setName(nodeName);
	       // Get the child elements <title> of <book>, only one
	       NodeList proteinNodes = element.getElementsByTagName("fiber");
	       Element proteinElement = (Element)proteinNodes.item(0);
	       double fiber = Double.parseDouble(proteinElement.getTextContent());
	       if(fiber < input) {
	       fiberBar.setFiber(fiber);
	       fibers.add(fiberBar);
	       }
	       }   
	    }  
	     fibers.stream()
	       .sorted(Comparator.comparing(FiberBar::getFiber).reversed()) 
	  	   .map(bar -> bar.getDetails())
	  	   .forEach(details -> System.out.println(details));

		}
	}


