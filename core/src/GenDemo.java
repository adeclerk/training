
public class GenDemo<Z> {
	private Z data;

	public GenDemo(Z data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return data.toString();
	}

	public void setData(Z data) {
		this.data = data;
	}
	
	public static void main(String[] args) {
		GenDemo<String> d1 = new GenDemo<String>("Hello");
		System.out.println(d1);
		
		GenDemo<Integer> d2 = new GenDemo<Integer>(1000);
		
		System.out.println(d2);
	}
	
	
	
}
