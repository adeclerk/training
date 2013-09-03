import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;


public class CallableDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			conn = JdbcUtility.newConnection();
			CallableStatement stmt = conn.prepareCall("{call getage(?,?)}");
			stmt.setString(1, "Will");
			stmt.registerOutParameter(2, Types.INTEGER);
			stmt.execute();
			System.out.println("AGE: " + stmt.getInt(2));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(conn != null)
					conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
