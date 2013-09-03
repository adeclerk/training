
public class Person {
	private String name;
	private int age;
	
	public Person() {
		this("Unknown",-1);		// calling another constructor of the same object 
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	private void print() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
		
	@Override
	public String toString() {
		return "Name: " + name + "\tAge: " + age;
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person){
			Person tmp = (Person) obj;
			if(name.equals(tmp.name) && age == tmp.age)
				return true;
			else 
				return false;
		
		} else {
			
			return super.equals(obj);	
		
		}
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object destroyed!");
	}

	public static void main(String[] args) {
		Person p = null;
		for(int i = 0; i < 5; i++) {
			p = new Person();
		}
		
	}
}
