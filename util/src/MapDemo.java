import java.util.*;

import javax.swing.text.html.HTMLDocument.Iterator;


public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("jack", "Jill");
		map.put("scott", "tiger");
		map.put("polo", "lili");
		map.put("jack","rose");
		
		System.out.println(map.get("scott"));
		System.out.println(map.get("polo"));
		System.out.println(map.get("jack"));

		Set<String> keySet = map.keySet();

	}

}
