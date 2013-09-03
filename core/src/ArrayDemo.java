
public class ArrayDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			int[][] array = {
					{1,2,3,4},
					{5,6,7,8} }; // initialization
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j]);
				}
				System.out.print(",\n");	
			}
			
			int[] arry = new int[3]; // definition
			arry[0] = 1;
			arry[1] = 2;
			arry[2] = 3;
			
			for (int i = 0; i < arry.length; i++) {
				System.out.println(arry[i]);
			}
			
			int[] arry1 = { 4,5,6 };
			for (int i = 0; i < arry1.length; i++) {
				System.out.println(arry1[i]);
			}
		}

}