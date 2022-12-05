package Resource;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("Resource.TClass");

			System.out.println("[Resource.TClass]");
			System.out.println(clazz.getName());
			System.out.println();

			System.out.println("[Constructor Info]");
			Constructor[] Constructors = clazz.getDeclaredConstructors();
			for (Constructor Constructor : Constructors) {
				System.out.print(Constructor.getName() + "(");
				Class[] parameter = Constructor.getParameterTypes();
				printParameters(parameter);
				System.out.println(")");

			}
			System.out.println();
			System.out.println("[Field Info]");
			Field[] fields = clazz.getDeclaredFields();
			for (Field field : fields) {
				System.out.println(field.getType().getSimpleName() + " " + field.getName());
			}
			System.out.println();

			System.out.println("[Method Info]");
			Method[] methods = clazz.getDeclaredMethods();
			for (Method method : methods) {
				System.out.print(method.getName() + "(");
				Class[] parameters = method.getParameterTypes();
				printParameters(parameters);
				System.out.println(")");
			}
			System.out.println();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			System.out.print(parameters[i].getName());
			if (i < parameters.length - 1) {
				System.out.print(",");
			}
		}
	}

}
