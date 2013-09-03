import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;


public class PersonDomParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		String path = "src/person.xml";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document doc = builder.parse(path);

		Node person = doc.getFirstChild();
		PersonDomParser.parsePerson(person);

	}
	
	public static void parsePerson(Node person) {
		Node element = person.getFirstChild();
		System.out.println("Person------");
		while(element != null) {
			if(element.getNodeType() != Node.TEXT_NODE){
				if(element.getNodeType() == Node.ELEMENT_NODE && element.getFirstChild() == null)
					System.out.println(element.getNodeName());
				else
					System.out.println(element.getNodeName() + ": " + element.getFirstChild().getNodeValue());	
			}
			element = element.getNextSibling();
		}		
	}

}
