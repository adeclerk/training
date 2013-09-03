import java.sql.Connection;
import java.sql.DriverManager;


import oracle.jdbc.OracleDriver;


public class JdbcUtility {
	
	
	public static Connection newConnection() throws Exception {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		OracleDriver driver = new OracleDriver();
		DriverManager.registerDriver(driver);
		
		conn = DriverManager.getConnection(url,"adeclerk","java");
		return conn;
	}
	
	
}
