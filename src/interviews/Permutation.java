package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Permutation {
	
	private static String myString = "STORY";
	private List<String> myList = new ArrayList<String>();
	
	//1. function which starts from the first char
	//2. put this char in a list
	//3. now move to next char and send this next char and the list in step 2 to permutate function
	//4. get the outcome in list (i.e. replace 2nd with the outcome of 3rd)
	//5. keep doing it till you reach the end char
	
	//str = "Hello"
	
	private String _str = null;
	
	//recursive method
	
//	public List<String> permutate1(char c, List<String> list){	
//		List<String> myList;
//		int len = myString.length();
//		if(list==null){
//			myList = new ArrayList<String>();
//			myList.add(String.valueOf(myString.charAt(0)));
//		}
//		
//		list = permutate1(c,list);
//		
//		for (int i=1; i < str.length(); i ++){
//			char ch = str.charAt(i);
//			list = permutate(ch,list);
//		}
//		
//		List<String> newList = new ArrayList<String>();		
//		for(String str:list){
//			for(int i =0 ; i<=str.length(); i++){
//				String st = insertCharAt(str,c,i);
//				newList.add(st);
//			}
//		}		
//		return newList;
//	}
	
	public List<String> doPermutation(String str){
		List<String> list = new ArrayList<String>();
		list.add(String.valueOf(str.charAt(0)));
		
		for (int i=1; i < str.length(); i ++){
			char ch = str.charAt(i);
			list = permutate(ch,list);
		}		
		return list;
	}
	
	
	public List<String> permutate(char c, List<String> list){				
		
		List<String> newList = new ArrayList<String>();		
		for(String str:list){
			for(int i =0 ; i<=str.length(); i++){
				String st = insertCharAt(str,c,i);
				newList.add(st);
			}
		}		
		return newList;
	}
	
	public String insertCharAt(String str, char ch, int index) throws NullPointerException, IndexOutOfBoundsException {
		
		if (str == null){
            throw new NullPointerException("Null string!");
        }

        if (index < 0 || index > str.length())
        {
            throw new IndexOutOfBoundsException("Try to insert at negative location or outside of string");
        }
        
        return str.substring(0, index) + String.valueOf(ch) + str.subSequence( index, str.length());        
		
	}
	
	public static void main (String[] args){		
		//Character[] arr = ArrayUtils.toObject(rest.toCharArray()) ; //apache commons!	
	    //int[] intArray = ArrayUtils.toPrimitive(list.toArray(new Integer[0])); //apache commons!
		//System.out.println(StringUtils.join(obj.myList , ","));	     //apache commons!
	    List<String> permutationList = new ArrayList<String>();
		Permutation obj = new Permutation();		
		String str = "world";
		obj._str = str;
		permutationList = obj.doPermutation(str);		
		System.out.println(StringUtils.join(permutationList, ","));
	}

}
