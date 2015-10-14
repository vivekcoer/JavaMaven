package errorhandling;

public class App {
	
  public void myFunc1() throws MyRuntimeException{
	  MyClass obj = new MyClass();
	  try{
		  obj.myfunct2();
	  }catch(MyException e){
		  e.printStackTrace();
	  }	  
	  System.out.println("inside my function 1");
  }
	
  public static void main(String[] args) {
	App obj = new App();
	obj.myFunc1();	
  }
}
