package regex;

import java.io.BufferedInputStream;
import java.util.Scanner;

public class Example1 {
    
     public static void main(String args[]){  
    	 String inpStr1, inpStr2, outStr;
    	 System.out.format("Please enter %d strings", 2);
    	 
    	
    	 Scanner sc = new Scanner(System.in);
    	 Scanner sc1 = new Scanner(new BufferedInputStream(System.in));
    	 
    	 
    	 
//    	 try{
//           File newFile = new File("ab");
//    		 BufferedReader bufRed = new BufferedReader(new FileReader(newFile));
//    		 bufRed.close();
//    	 }catch (Exception e) {
//        	
//    	 }
    	 
    	 while(sc.hasNext()){
    		 System.out.println(sc.nextLine());
    	 }
     }	 
     
     public String performRegex(String inpStr1, String inpStr2){
    	 
    	 
    	 
    	 return"";
     }
}
