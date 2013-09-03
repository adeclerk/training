
public class StringBuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		StringBuilder myStr = new StringBuilder("TEST STRING");
		String addition = " More test string";
		myStr.append(addition);
		System.out.println(myStr);
		System.out.println( myStr.indexOf(addition) );
		myStr.reverse();
		
		System.out.println(myStr);
		
		myStr.insert(10,32);
		System.out.println(myStr);
		
		for(int i = 0; i < args.length; i++) {
			myStr.append(args[i]);
		}
		
		System.out.println(myStr);
	}

}
