import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TransactionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sql1 = "INSERT INTO person VALUES('Jacob',22,'Melbourne')";
		String sql2 = "UPDATE person SET age=31 WHERE name='Jack'";
		String sql3 = "DELETE FROM person WHERE name='John'";
		
		Connection conn = null;
		
		try {
			conn = JdbcUtility.newConnection();
			Statement stmt = conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			conn.setAutoCommit(false);
			stmt.executeBatch();
			conn.commit();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
