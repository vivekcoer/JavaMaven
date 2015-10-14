package stringrelated;

public class App {
	
	public static void main(String[] args){
		
		int arr[] = {1,2,3,4,5};
		int[] arr1 = {1,2,3,4,5};
		int arr2[] = new int[4];
		int[] arr3 = new int[4];
		int[] arr4 = new int[]{1,2,3,4,5,6};
		
		
		String str1= "My Name is Vivek Tiwari";
		String str2= "viVek";
		
		System.out.println(str1.toLowerCase().indexOf(str2.toLowerCase()));
	
		
	}

}
