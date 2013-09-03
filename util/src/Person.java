
public class Person /*implements Comparable<Person>*/ {
	private String name;
	private int age;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name: " + name + "\tAge: " + age;
	}


/*	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
	}*/


	public int getAge() {
		return age;
	}
	
	
	
}
