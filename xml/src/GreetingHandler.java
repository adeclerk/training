import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class GreetingHandler extends DefaultHandler {

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Document Started");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("Document end.");
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		System.out.println(qName + " start");
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		System.out.println(qName + " end");
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		String str = new String(ch,start,length);
		if(str.trim().length() > 0)
			System.out.println(str);
	}

}
