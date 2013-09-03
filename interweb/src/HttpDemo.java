import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class HttpDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ServerSocket server = null;
		Socket tmp = null;
		try {
			server = new ServerSocket(8089);
			tmp = server.accept();
			System.out.println("Connected");
			System.out.println();
			
			BufferedReader input = new BufferedReader( new InputStreamReader(tmp.getInputStream()));
			
			String line;
			while((line = input.readLine()) != null)
				System.out.println(line);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if(server != null)
					server.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				try {
					if(tmp != null)
					tmp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}

}
