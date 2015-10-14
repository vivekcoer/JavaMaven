package fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeUtils {
     public static void main(String[] args){
    	 List<Integer> list = listPrimes(1000); 
    	 System.out.println(list);
    	 boolean isPrime = isPrime(97);
    	 System.out.println(isPrime);
     }
     
     public static List listPrimes(int num){
    	 List<Integer> list = new ArrayList<Integer>();
    	 boolean[] primes = new boolean[1001];
    	 Arrays.fill(primes, true);// assume all are prime;
    	 primes[0] = false;
    	 primes[1] = false;
    	 primes[2] = true;
    	 // all the even numbers are not prime;
    	 for (int i= 4; i<=num; i+=2){
    		 primes[i] = false;
    	 }
    	 
    	 for (int j=3; j<=num; j+=2){
    		 if(primes[j]){
    			 for(int q=3; q*j<num; q+=2){
    				 primes[j*q] = false;
    			 }
    		 }
    	 }
    	 
    	 //get a lit of integers from this array
    	 int k = 0;
    	 for (boolean b:primes){
    		 if(b){
    			 list.add(k);
    		 }
    		 k++;
    	 }
    	 return list;
     }
     
     public static boolean isPrime(int num){
    	 if(num==0 || num==1) return false;
    	 if(num==2) return true;
    	 for (int i=2; i*i<=num; i+=2){
    		 if(num%i==0) return false;
    	 }
    	 return true;
     }
}
