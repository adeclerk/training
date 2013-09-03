
public class TestAnalyzer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sql0 = "SELECT * FROM person";
		String sql1 = "SELECT * FROM emp";
		
		QueryAnalyzer.executeQuery(sql0);
		QueryAnalyzer.executeQuery(sql1);

	}

}
