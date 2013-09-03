import java.sql.Connection;
import java.sql.Statement;


public class InsertDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		String sql = "INSERT INTO person VALUES('Ken',22,'Toronto')";
		
		Connection conn = null;
		
		try {
			conn = JdbcUtility.newConnection();
			Statement stmt = conn.createStatement();
			
			stmt.execute(sql);
			System.out.println("Record Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Record Insertion Failed!");
			
		} finally {
			try {
				if(conn != null)
					conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
