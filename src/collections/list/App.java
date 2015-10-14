package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// useNativeDataType();
		useEmployeeDataType();
		
		//just to put how to declare array in java
		
		int[] myIntArray1 = new int[3];
		int[] myIntArray2 = {1,2,3};
		int[] myIntArray3 = new int[]{1,2,3};
	}

	public static void useNativeDataType() {
		List<String> listOfStrings = new ArrayList<String>();
		listOfStrings.add("John");
		listOfStrings.add("Albert");
		listOfStrings.add("Joseph");

		listOfStrings.add(1, "Paul");

		// System.out.print(listOfStrings);

		// method 1
		System.out.println("method 1");

		Iterator<String> iterator1 = listOfStrings.iterator();
		while (iterator1.hasNext()) {
			String name = iterator1.next();
			System.out.println(name);
		}

		// method 2
		System.out.println("\nmethod 2");

		for (Iterator<String> iterator2 = listOfStrings.iterator(); iterator2
				.hasNext();) {
			String name = iterator2.next();
			System.out.println(name);
		}

		System.out.println("\nmethod 3");
		for (String val : listOfStrings) {
			System.out.println(val);
		}
	}

	public static void useEmployeeDataType() {
		List<Employee> listOfEmployees = new ArrayList<Employee>();

		listOfEmployees.add(new Employee(01, 32, "Kink"));
		listOfEmployees.add(new Employee(11, 33, "Angela"));
		listOfEmployees.add(new Employee(21, 23, "Samantha"));

		// method 1
		System.out.println("method 1");

		for (Employee val : listOfEmployees) {
			System.out.println(val.getName());
		}

		// method 2
		System.out.println("\nmethod 2");

		Iterator<Employee> iterator1 = listOfEmployees.iterator();
		while (iterator1.hasNext()) {
			String name = iterator1.next().getName();
			System.out.println(name);
		}

		// method 3
		System.out.println("\nmethod3");

		for (Iterator<Employee> iterator2 = listOfEmployees.iterator(); iterator2
				.hasNext();) {
			String name = iterator2.next().getName();
			System.out.println(name);
		}
	}

}
