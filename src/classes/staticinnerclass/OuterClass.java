package classes.staticinnerclass;

/**
 * @author I831504
 *
 */
public class OuterClass {
	
	private String outerClassName;
	private int outerClassNumber;	
	
	
	public String getOuterClassName() {
		return outerClassName;
	}

	public void setOuterClassName(String outerClassName) {
		this.outerClassName = outerClassName;
	}

	public int getOuterClassNumber() {
		return outerClassNumber;
	}

	public void setOuterClassNumber(int outerClassNumber) {
		this.outerClassNumber = outerClassNumber;
	}

	public OuterClass(String name, int number){
		outerClassName = name;
		outerClassNumber = number;
	}
	
	public class InnerClass{
		
		String innerClassName;
		int innerClassNumber;
		
		public String getInnerClassName() {
			return innerClassName;
		}

		public void setInnerClassName(String innerClassName) {
			this.innerClassName = innerClassName;
		}

		public int getInnerClassNumber() {
			return innerClassNumber;
		}

		public void setInnerClassNum(int innerClassNumber) {
			this.innerClassNumber = innerClassNumber;
		}

		public InnerClass(String name, int id){
			this.innerClassName = name;
			this.innerClassNumber = id;
		}
		
		public void printContents(){
			String concatenatedStr = "outer class: " + outerClassName + outerClassNumber + " inner class: " + this.innerClassName + this.innerClassNumber;
			System.out.println(concatenatedStr);
		}
	}

}
