import com.declerk.org.Employee;
import com.declerk.org.Executive;
import com.declerk.org.Manager;


public class TestEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println();
		Executive ex = new Executive("Polo",5000,1200);
		Manager mg = new Manager("Lili",7000,2500);

		showSalary(ex);
		showSalary(mg);
	}

	private static void showSalary(Employee emp) {
		if(emp instanceof Executive) 
			System.out.println("Executive Salary: " + emp.getSalary());
		else if(emp instanceof Manager)
			System.out.println("Manager Salary: " + emp.getSalary());
		else 
			System.out.println("Employee Salary: " + emp.getSalary());
	}

}
