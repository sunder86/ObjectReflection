package ReflectionObjects;

import java.lang.reflect.Field;

public class Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee adam = new Employee("Adam", "Kowalski", 34);
		
		Class cl = adam.getClass();
		
		
			try {
			
				Field f = cl.getDeclaredField("surname");
				f.setAccessible(true);
				Object v;
				try {
					v = f.get(adam);
					System.out.println(v);
					
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			} catch (NoSuchFieldException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			} catch (SecurityException e) {
				
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
			
		
		
	}

}
