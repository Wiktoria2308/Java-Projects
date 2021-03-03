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


public class PrintBarsNames {
	
	public PrintBarsNames() {
		
	}
	
	public void printNames(String filename) throws ParserConfigurationException, SAXException, IOException {
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
		         }
	
	      }
	}
}
