import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;


public class EmployeeDomParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		String path = "src/employee.xml";
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document doc = builder.parse(path);
		Node organization = doc.getFirstChild();
		Node employee = organization.getFirstChild().getNextSibling();
		
		
		while(employee != null) {
			
			EmployeeDomParser.parseEmployee(employee);
			
			employee = employee.getNextSibling();
			if(employee.getNodeType() == Node.TEXT_NODE) {
				employee = employee.getNextSibling();
			}
		}
	}
	
	public static void parseEmployee(Node employee) {
		Node child = employee.getFirstChild().getNextSibling();
		System.out.println("Employee-----");
		while(child != null) {
			if(child.getNodeType() != Node.TEXT_NODE)
				printValue(child);
			child = child.getNextSibling();
		}
		System.out.println("----------");
	}
	
	public static void printValue(Node child) {	
		System.out.println(child.getNodeName() + ": " + child.getFirstChild().getNodeValue());
	}

}
