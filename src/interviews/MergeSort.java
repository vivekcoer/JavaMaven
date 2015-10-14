package interviews;

import java.util.Arrays;

public class MergeSort {
	
	private static final int[] _myArr = {1,12,10,3,15,3,6,14,5,0,13,2,15,18,16,17};
	
	//algorithm 
	//divide and conquer
	//first divide the array into haves till it reaches single points
	//then start merging
	
	
	//function which will divide the existing array into single slots and then start merging
	
//	1,12,10,3,15,3,6,14          ,5,0,13,2,15,18,16,17
//	
//	1,12,10,3,15,3,6,14           5,0,13,2,15,18,16,17
//	
//	1,12,10,3  15,3,6,14
//	
//	1,12  10,3   15,3 6,14
//	
//	1 12  10 3  15 3  6 14
//	
//	1,12  3,10 3,15 6,14
//	
//	1,3,10,12   3,6,14,15
//	
//	1,3,3,6,10,12,14,15
	
	//make a function which takes 2 lists (sorted) and returns a (sorted list)>> will this be the recursive candidate?
	
//	int[] a = {1,3,10,12};
//	int[] b = {3,6,14,15};		
	
	public void mergeSort(int[] myArr){
		
		if(myArr.length < 2){
			return;
		}
		
		//divide the array into two
		int mid = (myArr.length) / 2;		
		int[] a = new int[mid];
		int[] b = new int[myArr.length-mid];		
		System.arraycopy(myArr, 0, a, 0, mid);	
		System.arraycopy(myArr, mid, b, 0, myArr.length - mid);		
				
		mergeSort(a);
		mergeSort(b);	// the beauty of recursion is that once the termination condition is met (first if on the top) and the merge(a,b,c) will keep calling exactly in the FILO manner.
		                // you don't have to do anything else!  Since the arrays are always passed using their references, everytime merge runs it actually returns a sorted array.  
		                // And therefore myArr and its childs gets sorted in the calling function.
		                // note that myArr, array which is getting divided is also used for consuming merged array - the data has already been copied in a and b, so no data loss!
		
		merge(a,b,myArr);
	}
	
//	int[] a = {1,3,10,12};
//	int[] b = {3,6,14,15};	
	
	public void merge( int[] a, int[] b, int[] c){				
		for (int i=0, j=0, k=0 ; k<c.length; k++){			
			if(i<a.length && j<b.length){
				if(a[i] < b[j]){
					c[k] = a[i];
					i++;
				}else{
					c[k] = b[j];
					j++;
				}
			}else{
				if(i<a.length){
					c[k] = a[i];
					i++;
				}else{ //no need to check j<b.length because all other cases would have exhausted at this place! Remember value of k would be exactly equal to i + j;
					c[k] = b[j];
					j++;
				}
			}		
		}		
	}
	
	public static void main(String[] args){		
		int[] a = {1,3,10,12};
		int[] b = {3,6,14,15};		
		int[] c = new int[(a.length + b.length)];
		
		MergeSort ms = new MergeSort();
		ms.mergeSort(_myArr);
		//ms.merge(a, b, c);
		
		System.out.println(Arrays.toString(_myArr));
	}

}
