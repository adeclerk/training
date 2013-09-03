import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class EmployeeParser {

	
	public static void main(String[] args) throws Exception {
		String path = "src/employee.xml";
		
		EmployeeHandler handler = new EmployeeHandler();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		parser.parse(path,handler);
	}
}
