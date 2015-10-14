package fizzbuzz;

import java.util.Scanner;

public class Recursion {
	public static void main(String[] args){
		   int number, result;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter a range: ");
		   number = sc.nextInt();
		   
		   result = getRec(number);
		   System.out.println("The recursion of the number is " + result);		   
		}
	
	public static int getRec(int number){
		
		int res = 1;		
		if(number>1){
			res = number * getRec(number-1);
		}		
		return res;		
	}
}
