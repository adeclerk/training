import java.util.Calendar;
import java.util.TimeZone;
import java.util.GregorianCalendar;
import java.util.Date;

public class CalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] zones = TimeZone.getAvailableIDs();
		
		for (String zone : zones) {
			System.out.println(zone);
		}
		Date dt = new Date();
		System.out.println(dt);
		
		TimeZone zone = TimeZone.getTimeZone("CST");
		Calendar cal = new GregorianCalendar(zone);
		System.out.println(cal.get(Calendar.AM));
	
		Date d1 = new Date(System.currentTimeMillis());
		Date d2 = new Date(cal.get(Calendar.MILLISECOND));
		System.out.println(d1);
		
		
	}

}
