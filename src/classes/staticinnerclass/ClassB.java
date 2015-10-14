package classes.staticinnerclass;

import classes.staticinnerclass.Hello.Thing;

public class ClassB {
     private String name;
     public ClassB(String name){
    	 this.name= name;
     }
     
     public static void main(String[] args) {
         ClassB ob = new ClassB("");
         System.out.println("Hello, World!");
     }
}
