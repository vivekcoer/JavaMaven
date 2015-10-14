package collections.map;

import java.util.HashMap;
import java.util.Map;

public class App {
	
	private String category = "";
	
	public class NestedClass {
		private String organization;
		public void setOrgnization (String org){
			this.organization = org;
		}
	}
	
	public static void main(String[] args){
		Employee e = new Employee("Mr A", 10001, 31);
		App a = new App();
		NestedClass nesObj = a.new NestedClass();
		nesObj.setOrgnization("Temporary");
//		App.NestedClass nestedClassObj = new App.NestedClass();
//		nestedClassObj.setOrgnization("My Company");
//		NestedClass a = new NestedClass();
//		a.setOrgnization("My Company");
		
		//App a = new App();
//		a.category = "Permanent Employees";
		useNativeDataType();
		useEmployeeDataType();
		Object obj = new Object();
	}
	
	public static void useNativeDataType(){		
		Map<Integer, String> mapOfStrings = new HashMap<Integer, String>();		
	}
	
	public static void useEmployeeDataType(){
		Map<String, Employee> myEmployees = new HashMap<String, Employee>();		
	}

}