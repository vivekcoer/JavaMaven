package innerClass;

public class Person {
   String name;
   double age;
   final int demographic_limit = 100;
   
   public class BackGroundCheck {
	   BackGroundCheck(Address add, boolean isPoliceRecord){
		   
	   }
	   //Person p = new Person(); // in what case would i do it?
	   //name = "Vivek"; // this will compile error because you cant re-initialize a variable inside a class outside a method.  it could only be done inside a method
	  public boolean isBackgroundCheckCleared(Address add){
		  boolean isAddressFlagged  = isAddressFlagged(add);
		  boolean bgCheckCleared = false;
		  if(age>17 && age<18){
			  age = 18;
			  //demographic_limit = demographic_limit + 1;//not possible
		  }
		  if(age>18){
			  if(!isAddressFlagged){
				  bgCheckCleared = true;
			  }
		  }		  
		  return bgCheckCleared;
	  }
	  
	  public boolean isAddressFlagged(Address add){
		  return false;
	  }
   }
      
}
