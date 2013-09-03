import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;


public class ResultDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sql = "SELECT * FROM person";
		
		Connection conn = null;
		
		try {
			conn = JdbcUtility.newConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			
			// get result metadata 
			ResultSetMetaData rsm = rs.getMetaData();
			
			// get column count
			int count = rsm.getColumnCount();
			
			// iterate through columns, printing the name
			for (int i = 1; i <= count; i++) {
				System.out.print( rsm.getColumnName(i) + "\t");
			}
			System.out.println();
			
			// print results
			while(rs.next())
				System.out.println(rs.getString(1) + "\t" + rs.getInt(2) + "\t" + rs.getString(3));
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
