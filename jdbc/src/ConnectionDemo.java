import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

import oracle.jdbc.OracleDriver;


public class ConnectionDemo {
	
	public static void main(String[] args) throws Exception{
		//String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		// instantiate db driver
		//OracleDriver driver = new OracleDriver();
		// registering driver with driver manager
		//DriverManager.registerDriver(driver);
		
		// request connection from driver manager
		Connection conn = JdbcUtility.newConnection();
		
		System.out.println("Connected Successfully...");
		
		DatabaseMetaData meta = conn.getMetaData();
		System.out.println(meta.getDatabaseProductName());
		System.out.println(meta.getDatabaseProductVersion());
		System.out.println(meta.getDriverName());
		System.out.println(meta.getDriverVersion());
		conn.close();
	}
}
