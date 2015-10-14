package algorithms;

import java.util.Arrays;

public class Quicksort {
public static void main (String[] args){
		
		int[] myArr = new int[]{6,2,1,7,8,4,5,3};
		System.out.println(Arrays.toString(myArr));
		
		//test parition funciton only!
//		partition(0,7,myArr);
//		System.out.println("AFTER MERGE");
//		System.out.println(Arrays.toString(myArr));
		
		quickSort(0,7,myArr);
		System.out.println("AFTER MERGE");
		System.out.println(Arrays.toString(myArr));	
	}
	
	// there are 2 methods
			// 1>> partition an array - with all the elements smaller to the left of the pivot and vice-versa
			// 2>> to divide the array and call the 1>> recursively
	
	public static void quickSort(int startInd, int endInd, int[] myArr){		
		if(startInd<endInd){			
			int partitionInd = partition(startInd,endInd,myArr);
			quickSort(startInd,partitionInd-1,myArr);
			quickSort(partitionInd+1,endInd,myArr);
		}
	}
	
	public static int partition(int startInd, int endInd, int[] arr){//complexity n.		
		int pivot = arr[endInd];
		int partitionInd = startInd;
		for(int i=startInd; i < endInd; i++){
			if(arr[i]<pivot){
				swap(i,partitionInd, arr);
				partitionInd ++;
			}	
		}
		//swap with the pivot
		swap(partitionInd,endInd, arr);//since pivot is at arr[endInd]	
//		System.out.println(partitionInd);
//		System.out.println(Arrays.toString(arr));
		return partitionInd;
	}
	
	public static void swap(int sourceInd, int destInd, int[] arr){
		int temp = arr[sourceInd];
		arr[sourceInd] = arr[destInd];
		arr[destInd] = temp;
	}
}
