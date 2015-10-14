package classes.staticinnerclass;

public class ClassA {
	
	private String name;
	
	public int t() {
		return 1;
	}

	// this is not a static inner class i.e. this is not a nested class!
	public static ClassA a = new ClassA() { // what is this?// this is an example of the inner class which does not require an enclosing instance.
		String extraMember = "";
		public int t() { //you can override an exiting function here but you cant change the signature!
			return myFunc1();
		}
		public int myFunc1(){
			return 2;
		}
		public String myFunc2(){//how to access this function in main?
			return "";
		}
	};
	
	//this is a nested class (also known as static inner class)! 
	public static class ClassC {
		private static ClassA obj;
		public int myFunc3(){
			return 3;
		}
//		public ClassC(ClassA obj){
//			this.obj = obj;
//		}
		public void callOuterFunc(){
			//ClassA.this.myOuterFunc(); //--> throws compile error
			//obj.myOuterFunc(); //works OK if I uncomment the above one
		}
	};
	
	public class ClassD {
		public int myFunc4(){
			return 4;
		}
		public void callOuterFunc(){
			myOuterFunc();
		}
	}
	
	public void myOuterFunc(){
		name = "Yahoo";
		System.out.println(name);
	}
	
	public static void main(String[] args){
		ClassA newObA = new ClassA();
		System.out.println(newObA.t());			
		System.out.println(a.t());
		System.out.println(newObA.a.t());
		ClassA.ClassC newObjC = new ClassA.ClassC();
		ClassA.ClassD newObjD = newObA.new ClassD();
	}
}
