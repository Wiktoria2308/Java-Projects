package bars;
import java.io.File;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMParserBars {
	
	public DOMParserBars(){
		
	}
	
	
	public void printAllBars(String filename) throws SAXException, IOException, ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	      DocumentBuilder docBuilder = factory.newDocumentBuilder();
	      File file = new File(filename);
	      Document doc = docBuilder.parse(file);
	   
	      // Get a list of all elements in the document
	      // The wild card * matches all tags
	      NodeList list = doc.getElementsByTagName("*");
	      int barsCount = 0;
	      for (int i = 0; i < list.getLength(); i++) {
	         // Get the elements book (attribute isbn), title, author
	         Element element = (Element)list.item(i);
	         String nodeName = element.getNodeName();
	         String bar = nodeName.substring(nodeName.length() -3);
	         if (bar.equals("BAR")) {
	            barsCount++;
	            System.out.println("BAR " + barsCount + "\tNAME:\t" + nodeName);
	            String sn = element.getAttribute("SN");
	            System.out.println("\tSN:\t\t" + sn);
	         } else if (nodeName.equals("fett")) {
		            System.out.println("\tFETT:\t\t"
		                  + element.getChildNodes().item(0).getNodeValue());
	         } else if (nodeName.equals("energy")) {
	            System.out.println("\tENERGY:\t\t"
	                  + element.getChildNodes().item(0).getNodeValue());
	         } else if (nodeName.equals("kolhydrat")) {
	            System.out.println("\tKOLHYDRAT:\t" 
	                  + element.getChildNodes().item(0).getNodeValue());
	         }
	      	 else if (nodeName.equals("protein")) {
	            System.out.println("\tPROTEIN:\t"
	                  + element.getChildNodes().item(0).getNodeValue());
	      }
			 else if (nodeName.equals("fiber")) {
        System.out.println("\tFIBER:\t\t"
              + element.getChildNodes().item(0).getNodeValue());
	   }

	      }
	}
}
	



