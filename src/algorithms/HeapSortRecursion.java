package algorithms;

import java.util.Arrays;

public class HeapSortRecursion {
	
	public static void main(String[] args){
		int[] arr = new int[]{0,45,12,87,5645,-9,8,8,54,-7,987,56,-98,836};
		System.out.println(Arrays.toString(arr));
		heapSort(arr);
		System.out.println("**After heap sort**");
		System.out.println(Arrays.toString(arr));
	}
	
	public static void heapSort(int[] arr){
		heapifyArray(arr.length/2-1, arr, arr.length);
		System.out.println("**After heapification**");
		System.out.println(Arrays.toString(arr));
		//pop the maximum & swap with the rightmost leaf		
		for (int j =arr.length-1 ; j>0; j--){// j is the index where maximu would be placed! >> when there is just one remaining element in arr - it is already sorted!
			popAndSwapTheMax(j, arr);
		}
	}
	
	public static void popAndSwapTheMax(int ind, int[] arr){
		int temp = arr[ind];
		arr[ind] = arr[0];
		arr[0] = temp;
		int len = ind;//sending the length of array to be heapified; >> Actually the ind-1 is the new max index now - therefore len = (ind -1) + 1. Always length = maxInd + 1!.
		heapify(0, arr,len);
	}
	
	//instead of loop - recursion could be used!  but at the same time, the signature to call the method has to be changed!
	//this same approach could be done to heapify and heapSort methods too!
	
	public static void heapifyArray(int index, int[] arr, int len){
		if(index>=0){			
			heapify(index, arr, len);
			index = index -1;
			heapifyArray(index, arr, len);			
		}else{
			return;
		}
	}
	
	public static void heapify(int ind, int[] arr, int len){
		int maxRootInd = len/2-1;
		int root = arr[ind];
		while(ind<=maxRootInd){
			int leftChildInd = 2*ind + 1;
			int rightChildInd = leftChildInd + 1;
			int greaterChildInd;
			//V IMP >> //make sure right child exists! If not, left Child will anyways exist! Why? 
			//- because all these indexes i.e. ind<maxRootInd would always be root but one of the last one in that might be very well have only one child!  
			//And since in complete binary tree, left child gets preference therefore left child would always exist!  
			if((rightChildInd < len) && (arr[rightChildInd] > arr[leftChildInd])){
				greaterChildInd = rightChildInd; 
			}else{
				greaterChildInd = leftChildInd;
			}
			
			if(root>=arr[greaterChildInd]){
				break;
			}else{
				arr[ind]=arr[greaterChildInd];
				ind = greaterChildInd;
				arr[ind] = root;
			}
		}
		//System.out.println(Arrays.toString(arr));		
	}	
}
