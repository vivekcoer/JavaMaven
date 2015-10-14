package classes.staticinnerclass;

public class Test {
   public static void main(String[] args){
	   OuterClass obj = new OuterClass("OUTER CLASS", 1);
	   OuterClass.InnerClass obj2 = obj.new InnerClass("INNER CLASS", 2);
	   obj2.printContents();
   }
}
