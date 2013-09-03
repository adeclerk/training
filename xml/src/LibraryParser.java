import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class LibraryParser {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String path = "src/library.xml";
		
		LibraryHandler handler = new LibraryHandler();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		parser.parse(path,handler);
	}

}
