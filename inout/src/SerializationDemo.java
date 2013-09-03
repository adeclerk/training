import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializationDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String file = "C:/Users/Alex/person.dat";
		
		Person p = new Person("Polo",21);
		
		// Writing object to FileStream
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream ostream = new ObjectOutputStream(fos);
		ostream.writeObject(p);
		ostream.close();
		
		// Reading object from file stream
		ObjectInputStream istream = new ObjectInputStream(new FileInputStream(file));
		Object obj = istream.readObject();
		System.out.println(obj);
		istream.close();

	}

}
