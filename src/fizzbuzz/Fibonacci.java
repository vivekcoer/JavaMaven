package fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args){
	   int range;
	   List<Integer> resultList = new ArrayList<Integer>();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a range: ");
	   range = sc.nextInt();
	   
	   resultList = getFibSeries(range);
	   System.out.println("The Series is " + resultList.toString());
	   
	}
	
	public static List<Integer> getFibSeries(int range){
		List<Integer> resList = new ArrayList<Integer>();
		int sum = 0;
		resList.add(0);
		resList.add(1);
		
		for(int i=2; i<range;i++){
			sum = resList.get(i-1) + resList.get(i-2);
			resList.add(sum);
		}
		
		return resList;
	}
	
}
