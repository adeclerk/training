import java.lang.reflect.*;


public class PersonReflection {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws NoSuchMethodException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, SecurityException, NoSuchMethodException {
		Class pc = Class.forName("Person");
		Object obj = null;
		
		Constructor[] constructors = pc.getConstructors();
		for (int i = 0; i < constructors.length; i++) {
			if(constructors[i].getParameterTypes().length > 0) {
				obj = constructors[i].newInstance("Polo",21);
			}
		}
		
		System.out.println(obj);
		
		Method m = pc.getDeclaredMethod("print", null);
		m.setAccessible(true);
		m.invoke(obj,null);
		
	}

}
