import java.sql.Connection;
import java.sql.PreparedStatement;


public class PrecompiledDemo {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		String sql = "INSERT INTO person VALUES(?,?,?)";
		
		Connection conn = null;
		
		try {
			conn = JdbcUtility.newConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1,args[0]);
			stmt.setInt(2, Integer.parseInt(args[1]));
			stmt.setString(3, args[2]);
			stmt.executeUpdate();
			System.out.println("Record Inserted...");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
