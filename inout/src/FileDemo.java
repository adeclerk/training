import java.io.File;


public class FileDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "C:/Users/Alex/Documents/index.html";
		File file = new File(path);
		
		System.out.println(file.exists());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.getParent());
		if(file.isFile()) {
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.length());
			System.out.println(file.isHidden());
		} else {
			String[] dirs = file.list();
			for (String dir : dirs) {
				System.out.println(dir);
			}
		}

	}

}
