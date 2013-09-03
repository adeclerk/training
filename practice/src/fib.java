
public class fib {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fibl(2));
	}
	public static int fibr(int n){
		if(n == 0)
			return 1;
		if(n == 1)
			return 1;
		return fibr(n-1)+fibr(n-2);
	}
	
	public static int fibl(int n){
		if(n == 0)
			return 1;
		if(n == 1)
			return 1;
		int n1 = 1;
		int n2 = 1;
		for(int i = 2; i <= n+1; i++){
			int N1 = n1;
			int N2 = n2;
			n2 = N1 + N2;
			n1 = N2;
		}
		return n1;
	}
}
