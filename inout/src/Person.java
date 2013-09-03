import java.io.Serializable;


public class Person implements Serializable {
	private String name;
	private transient int age;
	
	
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
}
