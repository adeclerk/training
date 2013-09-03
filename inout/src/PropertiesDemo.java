import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class PropertiesDemo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream fstream = new FileInputStream("src/test.properties");
		Properties p = new Properties();
		p.load(fstream);
		
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("city"));
		
/*		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		HashMap map = new HashMap((Map) p.propertyNames());*/

			Set<Object> = p.keySet();
			for(Object prop: props)
	}

}
