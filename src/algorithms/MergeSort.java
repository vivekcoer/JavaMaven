package algorithms;

import java.util.Arrays;

public class MergeSort {
	
	public static void main (String[] args){
		
		int[] myArr = new int[]{6,2,3,7,8,4,5,1};
		System.out.println(Arrays.toString(myArr));
		
		mergeSort(myArr);
		System.out.println("AFTER MERGE");
		System.out.println(Arrays.toString(myArr));
		
		//to test merge function only
		
/*		int[] myArr1 = new int[]{1,4,6,7};
		int[] myArr2 = new int[]{2,3,5,8};
		int[] myArr3 = new int[8];
		merge(myArr1,myArr2,myArr3);
		System.out.println(Arrays.toString(myArr3));*/
	}
	
	// there are 2 methods
			// 1>> to merge two already sorted arrays
			// 2>> to divide the array and call the 1>> recursively
	
	public static void mergeSort(int[] myArr){		
		if(myArr.length<2){
			return;
		}
		
		int leftArrLen = myArr.length/2;
		int rightArrLen = myArr.length  - leftArrLen;
		//left arr
		int[] leftArr = new int[leftArrLen];
		//right arr
		int[] rightArr = new int[rightArrLen];
		
		//split the array into these 2
		System.arraycopy(myArr, 0, leftArr, 0, leftArrLen);
		System.arraycopy(myArr, leftArrLen, rightArr, 0, rightArrLen);
		
		//mergeSort left
		mergeSort(leftArr);
		//mergeSort right
		mergeSort(rightArr);
		//merge both
		
		merge(leftArr,rightArr,myArr);
	}
	
	public static void merge(int[] arr1, int[] arr2, int[] arr){//complexity n.
		int i=0,j=0,k=0; //i index of arr1, j for arr2 and k for arr (arr will contain the merged result!)
				
		while(k<arr.length ){
			if(i<arr1.length && j<arr2.length){
				if ((arr1[i]) < arr2[j] ){
					arr[k] = arr1[i];
					i++;
				}else{
					arr[k] = arr2[j];
					j++;
				}				
			}else{
				if(i<arr1.length){
					arr[k] = arr1[i];
					i++;
				}
				
				if(j<arr2.length){
					arr[k] = arr2[j];
					j++;
				}
			}
			k++;
		}	
		
	}

}
