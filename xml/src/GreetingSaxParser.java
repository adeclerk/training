import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class GreetingSaxParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		String path = "src/greeting.xml";
		
		GreetingHandler handler = new GreetingHandler();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		parser.parse(path,handler);

	}

}
