package reflectionTest;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.Scanner;

public class Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		if (args.length >0)
			name = args[0];
		
		else {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Prosze podaæ nazwê klasy: ");
			name = in.next();
			
		}
		
		
		try {
			
			Class c = Class.forName(name);
			Class supercl = c.getSuperclass();
			String modifier = Modifier.toString(c.getModifiers());
			
			if (modifier.length() > 0) {
				
			System.out.println("Modyfikator: " + modifier + " klasa: " + c);
			
			}
			
			
			if (supercl != null) {
				
				System.out.println ("Rozszerza klase: " + supercl.getName());
				System.out.println ("\n{\n");
				printConstructors(c);
				System.out.println ("\n");
				printMethods(c);
				System.out.println ("\n");
				printFields(c);
				System.out.println("\n } \n");
				
				
			}
			
		} catch (ClassNotFoundException e) {
			
						
			e.printStackTrace();
		}
		
		System.exit(0);
		
	}

	private static void printFields(Class c) {
		// TODO Auto-generated method stub
		
		Field [] fields = c.getDeclaredFields();
		
		for ( Field f : fields) {
			
			String name = f.getName();
			Class type = f.getType();
			System.out.print("    ");
			String modifiers = Modifier.toString(c.getModifiers());
			
			System.out.println(modifiers + " " + type.getName() + " " + name );
				
			
			
			
		}
		
		
	}

	private static void printMethods(Class c) {
		// TODO Auto-generated method stub
		
		Method [] meth = c.getDeclaredMethods();
		
		for (Method m : meth) {
			
			String name = m.getName();
			Class type = m.getReturnType();
			System.out.print("    ");
			
			String mod = Modifier.toString(c.getModifiers());
			if (mod.length() > 0 ) {
				
				System.out.print(type.getName() + " " + name + "(");
				
				Parameter [] param = m.getParameters();
				for (int j = 0 ; j < param.length ;j++) {
					
					
					if (j > 0 ) System.out.print(", ");
						
						
						System.out.print(param[j].getName());
					
					}
					System.out.println("); ");
					
				}
			}
			
		}
		
		

	private static void printConstructors(Class c) {
		// TODO Auto-generated method stub
		
		
		Constructor [] constr = c.getDeclaredConstructors();
		
		for (Constructor con : constr) {
			
			String name = con.getName();
			String modifier = Modifier.toString(c.getModifiers());
			
			if (modifier.length() > 0)
			System.out.print(modifier + " " + name + "(");
			
			Class [] par = con.getParameterTypes();
			for (int j = 0 ; j < par.length ; j++) {
				
				if (j > 0) System.out.print(", ");
				System.out.print(par[j].getName());
				
			}
			
			System.out.println(");");
		}
		
	}

	
}


