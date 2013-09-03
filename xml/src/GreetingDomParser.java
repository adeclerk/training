import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;


public class GreetingDomParser {

	public static void main(String[] args) throws Exception {
		String path = "src/greeting.xml";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document doc = builder.parse(path);
		Node root = doc.getFirstChild();
		Node person = root.getFirstChild().getNextSibling();
		System.out.println(root.getNodeName());
		System.out.println(person.getNodeName());
		System.out.println(person.getFirstChild().getNodeValue());
		Node message = person.getNextSibling().getNextSibling();
		System.out.println(message.getFirstChild().getNodeValue());
	}
}
