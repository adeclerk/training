
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = "Hello";
		String s3 = "Hello";
		
		// demonstrating value comparison differences
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		// appending to string
		s1 = s1 + " World";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		
		// string modification
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,5));
		System.out.println(s1.replace('o', 'a'));
		
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));
		
		// print index of all ls 
		int lastIndex = 0; // keep track of last index 
		for(int i =0; i < s1.length(); ) {
			
			// result depends on value of lastIndex
			int result = s1.indexOf('l',lastIndex);
			lastIndex = result+1;
			i+= lastIndex;
			System.out.println(result);
		}
		
		// Validate Email ID 
		// 1. Email should have only 1 '@' and '.'
		// 2. There should be at leastt 4 chars before '@'
		// 3. There should be at least 3 chars between '@' and '.' 
		// 4. There should be at least 2 chars after '.'
		String email = "polo@aol.in";
		boolean valid = true;
		int atIndex = 0;
		int dotIndex = 0;
		// check for @s 
		lastIndex = 0;
		int atCount = 0;
		for(int i = 0; i < email.length(); ) {
			int result = email.indexOf('@');
			if(result < lastIndex) {
				break;
			} else {
				lastIndex = result + 1 ;	
			}
			i += lastIndex;
			atCount++;
		}
		System.out.println(atCount);
		
		if( atCount > 1) {
			valid = false;
		}
		
		// check for '.' count
		lastIndex = 0;
		int dotCount = 0;
		for(int i = 0; i < email.length();) {
			int result = email.indexOf('.',lastIndex);
			if(result < lastIndex) {
				break;
			} else {
				lastIndex = result + 1 ;	
			}
			i += lastIndex;
			dotCount++;
		}
		
		if(dotCount > 2) {
			valid = false;
		}
		
		if(valid ) {
			String[] tmp = email.split("@");
			if(tmp[0].length() < 4) {
				valid = false;
			}
			
			String[] tmp2 = tmp[1].split("\\.");
			// check before dot
			if(tmp2[0].length() < 3) {
				valid = false;
			}
			// check after dot
			if(tmp2[1].length() < 2) {
				valid = false;
			}
		}
		
		if(valid) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
		
		
		
	}
}
