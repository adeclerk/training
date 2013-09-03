
public class Demo {
	private Object data;

	public Demo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Demo(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data.toString();
	}
	
	
	public static void main(String[] args) {
		Demo d = new Demo("Test");
		d.setData(500);
		System.out.println(d);
		
		Demo d1 = new Demo(1000);
		d1.setData("Hello");
		System.out.println(d1);
		
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	
	
}
