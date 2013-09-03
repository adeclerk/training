import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class FileInputDemo {

	public static void main(String[] args) {
		try {
			String path = "C:\\index.html";
			FileInputStream istream = new FileInputStream(path);
/*			int ch = 0;
			while(true) {
				ch = istream.read();
				if(ch == -1)
					break;
				System.out.print((char)ch);
*/			//}
			
			byte[] bar = new byte[istream.available()];
			istream.read(bar);
			
			String output = new String(bar);
			
			System.out.println(output);
			istream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
