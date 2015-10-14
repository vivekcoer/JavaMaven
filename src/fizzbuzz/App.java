package fizzbuzz;

public class App {
//	"Write a program that prints the numbers from 1 to 100. "
//	+ "But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. "
//	+ "For numbers which are multiples of both three and five print “FizzBuzz”."
//	int[] myIntArray = new int[3];
//	int[] myIntArray = {1,2,3};
//	int[] myIntArray = new int[]{1,2,3};
//	For classes, for example String, it's the same:
//
//	String[] myStringArray = new String[3];
//	String[] myStringArray = {"a","b","c"};
//	String[] myStringArray = new String[]{"a","b","c"};
	
	public static void main(String args[]){
		String str = "Hello World";
		//final int[] num = new int[]{1,2,3,4,5,6,7,9,9,10,11,12,13,14,15};		
		for (int i=1;i<=100;i++){
			if(i%15==0){
				System.out.println("FizzBuzz");
			}else if(i%5==0){
				System.out.println("Buzz");
			}else if(i%3==0){
				System.out.println("Fizz");
			}else{
				System.out.println(i);
			}
		}	
	}
	
}
