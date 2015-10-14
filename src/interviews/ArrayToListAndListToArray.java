package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class ArrayToListAndListToArray {
/*	public static void main(String[] args){
		   System.out.println("Enter a character or string: it will quit as soon as it encounters \"q\"!");

		   try{		
			   BufferedReader reader = new BufferedReader (new InputStreamReader(System.in , "UTF-8"));	   
			   byte[] arr = new byte[]{};
			   //StringBuilder sb = new StringBuilder(IOUtils.);
			   int ch;	   
				   while ((ch = reader.read())!=-1)	{
					   System.out.print((char)ch);
					   if(ch=='q'){
						   System.out.println("oops!  You typed \"q\"! bye bye");
						   break;
					   }
				   }			   
		   }
		   catch (IOException e){
		     
	   }	
     }*/
	
	public static void main(String[] args){
		int[] myArr = new int[]{10,2,3};		
		List<Integer> myList = new ArrayList<Integer>(); myList.add(13); myList.add(14); myList.add(12);
		
		//BOTH ARRAY UTILS AND STRING UTILS ARE FROM APACHE COMMONS
		
		//convert int[] to Integer[]		
		Integer[] myArr2 = ArrayUtils.toObject(myArr);
		
		//convert Integer[] to int[]
		int[] myArr3 = ArrayUtils.toPrimitive(myArr2); //myArr2 is Integer[]
		
		//convert list to array--> List<Integer> to Integer[];	
		Integer[] myArr4 = myList.toArray(new Integer[0]);
		
		//convert array to List--> Integer[] to List<Integer>
		List<Integer> myList2 = Arrays.asList(myArr2);
		
		//convert int[] to List<Integer> --> Would be commonly needed!
			//a. convert int[] to Integer[]	
			//b. convert Integer[] to List<Integer>
		
		Integer[] myArr5 = ArrayUtils.toObject(myArr); //myArr is int[]
		List<Integer> myList3 = Arrays.asList(myArr5);		
		     //OR
		List<Integer> myList4 = Arrays.asList(ArrayUtils.toObject(myArr));	
		
		//convert List<Integer> to int[] --> Would be commonly needed!
			//a. convert List<Integer> to Integer[]
			//b. convert Integer[] to int[]
		Integer[] myArr6 = myList.toArray(new Integer[0]);
		int[] myArr7 = ArrayUtils.toPrimitive(myArr6);
		    //OR
		int[] myArr8 = ArrayUtils.toPrimitive(myList.toArray(new Integer[0])); 
		
		//comma separated String from list
		System.out.println(StringUtils.join(myList , ","));      
		
		//comma separated String from array
		System.out.println(Arrays.toString(myArr));
		
		//in JAVA 8 comma separated String from array
		//String joined = String.join(",", myArr);
	}	
	
}
