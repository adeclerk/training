import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;


public class QueryAnalyzer {

	
	public static void executeQuery(String sql) {
		Connection conn = null;
		
		try {
			conn = JdbcUtility.newConnection();
			ResultSet rs = conn.createStatement().executeQuery(sql);
			ResultSetMetaData meta = rs.getMetaData();
			
			int count = meta.getColumnCount();
			for( int i = 1; i <= count; i++ ) {
				System.out.print( meta.getColumnName(i) + "\t");
			}
			System.out.println();
			
			while(rs.next()){
				for(int i = 1; i <= count; i++) {
					if(meta.getColumnType(i) == Types.INTEGER)
						System.out.print(rs.getInt(i));
					else 
						System.out.print(rs.getString(i));
					
					System.out.print("\t");
				}
				System.out.print("\n");
			}
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
