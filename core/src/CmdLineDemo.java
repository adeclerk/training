
public class CmdLineDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		System.out.println(tname);
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		// split string and print days 
		String days = "Sun-Mon-Tue-Wed-Thu-Fri-Sat";
		String[] week = days.split("-");
	   for (int i = 0; i < week.length; i++) {
		   System.out.println(week[i]);
		}

	}

}
