package generics.imp1;

//to show the use of Generics in generic algorithms.
//also to show the use of bounded parameters in the same.
public class ClassA {
	public static <T extends Comparable<T>> int countGreaterThan(T[] arr, T ele) {
       int count = 0;
       for (T e : arr){
    	   //if(e > ele) // this line will not compile unless we bound T with IComparable. Because objects do not by default understand > operator
    	   if(e.compareTo(ele) > 0)
    	   count++;
       }
       return count;
	}
}