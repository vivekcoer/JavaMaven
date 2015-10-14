package interviews;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
	
	public void doFib(int n){		
		int[] arr = new int[n];
		arr[0] = 0;
		arr[1] = 1;
		for(int i=2; i<n; i++){
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	//recursive method
	
	public void fibRec(int n){
		for (int i=1; i<=n; i++){
			System.out.print(doFibo(i));
		}
	}
	
	public int doFibo(int n){	
		
		if(n==0){
			return 0;
		}else if(n==1){
			return 1;
		}else{
			return doFibo(n-1) + doFibo(n-2);
		}
		
	}
	
	public static void main(String args[]){
		Fibonacci obj = new Fibonacci();
		System.out.println("Enter the length of the Fibonicci Series you wish to see");

		int n = 0;
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()){
			n = sc.nextInt();
		}
//		String line = null;
//		InputStreamReader isr = new InputStreamReader(System.in);
//		BufferedReader br = new BufferedReader(isr);
//		try{
//			if((line=br.readLine())!=null){
//				try{
//					n = Integer.parseInt(line);
//				}catch (Exception e){
//					
//				}
//			}
//		}catch(Exception e){
//			
//		}
		//obj.doFib(n);
		//recursive method
		obj.fibRec(n);
	}

}
