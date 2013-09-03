import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class LibraryHandler extends DefaultHandler {
	private boolean isFirstName;
	private boolean isTitle;
	private String lastTitle;
	@Override
	public void endDocument() throws SAXException {
		
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		
		if(qName.equalsIgnoreCase("first-name"))
		{
			isFirstName = true;
		}
		if(qName.equalsIgnoreCase("title")) {
			isTitle = true;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(isFirstName) {
			String str = new String(ch,start,length);
			if(str.equalsIgnoreCase("Kathy")) {
				System.out.println(lastTitle);
			}
			isFirstName = false;
		}
		
		if(isTitle) {
			String str = new String(ch,start,length);
			lastTitle = str;
			isTitle = false;
		}
	}

}
