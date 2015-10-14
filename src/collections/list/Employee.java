package collections.list;

public class Employee {

	private int empNum;
	private double age;
	private String Name;
	
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	public Employee(int empNum, double age, String name) {
		this.empNum = empNum;
		this.age = age;
		Name = name;
	}

}
