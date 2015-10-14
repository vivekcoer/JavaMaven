package interviews;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Test {
	
	public void changeArraySorting(int[] arr){
		int temp;
		temp = arr[1];
		arr[1] = arr[0];
		arr[0] = temp;
	}
	
	public static void main(String[] args){
		
		Test obj = new Test();		
		int[] myArr = {1,2,3,4};
		System.out.println(Arrays.toString(myArr));
		obj.changeArraySorting(myArr);
		System.out.println(Arrays.toString(myArr));
		
		File myFile = new File("C:\test.txt");
		try{
			FileInputStream ifs = new FileInputStream(myFile);
			InputStreamReader isr = new InputStreamReader(ifs , "UTF-8");
			BufferedReader br = new BufferedReader(isr);
		}
		catch(IOException e){
			
		}		
//		InputStreamReader
//		BufferedReader
		
	}

}
