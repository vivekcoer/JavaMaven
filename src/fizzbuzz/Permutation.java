package fizzbuzz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
	
	public static void main(String[] args){
		String myString = "sky";
		List<String> list = new ArrayList<String>();		
		list = doPerm(myString);
		System.out.println(list);
		
	}
	
	static List<String> doPerm(String myStr){
		List<String> myList = new ArrayList<String>();
		int len = myStr.length();
		
		if(len == 1){
			myList.add(myStr);
			return myList;
		}else{
			myList.add(myStr.substring(len-1));
		}
		
		for(int i= len -2; i >=0 ; i--){
			char c = myStr.charAt(i);
			myList = funcB( myList , c );
		}
		
		return myList;
	}
	
	static List<String> funcB(List<String> myList, char c){	
		List<String> myList2 = new ArrayList<String>();
		for (String str: myList){
			myList2 = funcA(str, c);
			//myList.addAll(myList2);
		}				
		return myList2;
	}
	
	static List<String> funcA(String str, char c){
		List <String> myList = new ArrayList<String>();
//		List <Character> myList2 = new ArrayList<Character>();
//		char[] charArr1 = str.toCharArray();
//		Character[] charArr = new Character[charArr1.length];
//		int i = 0;
//		for (char c1: charArr1){
//			charArr[i] = c1;
//			i++;
//		}
//		myList2.addAll(Arrays.asList(charArr));
		
		int len = str.length();
		
		for(int i =0 ; i <=len ; i++){
			String myStr = StringUtils.insertAt(str, i, c)	;	
			myList.add(myStr);
		}
		
		return myList;
	}
	

}
