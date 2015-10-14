package stringrelated;

import java.util.Scanner;

public class ClassA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String inStr, outStr;
		inStr = sc.nextLine();

		outStr = reverseString(inStr);
		inStr.codePointAt(0);

		// int len = inStr.length();
		System.out.println(outStr);
		System.out.format("%d", inStr.codePointCount(1,2));
	}

	public static String reverseString(String str){
		StringBuilder sb = new StringBuilder();
		int len = str.length();	
			while(len>0){
				sb.append(str.charAt(len-1));
				len--;
			}		
		return sb.toString();
	}
}
