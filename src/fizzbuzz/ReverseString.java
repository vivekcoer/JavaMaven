package fizzbuzz;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args){
		   String srcStr;
		   String resStr;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter a String: ");
		   srcStr = sc.nextLine();
		   
		   resStr = getReverseStr(srcStr);
		   System.out.println("The reverse of the string is " + resStr);		   
		}
	
	public static String getReverseStr(String srcStr){		
		StringBuilder sb = new StringBuilder();
		
		for (int i=srcStr.length()-1;i>=0;i--){
			sb.append(srcStr.charAt(i));
		}
		
		return sb.toString();
	}
}
