package stackoverflow;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p7b {
	public static void main(String[] args) {
		int[] arrayNums = new int[40];
		Object[] arrayString = new Object[40];

		// Location of file to read
		String fileName = "C:/Test/MyTestFile.txt";

		
			FileInputStream fis = null;
	        DataInputStream dis = null;
	        InputStreamReader isr = null;
	        BufferedReader br = null;
	        Map<String, Integer> wordMap = new HashMap<String, Integer>();
	        try {
	            fis = new FileInputStream(fileName);
	            isr = new InputStreamReader(fis , "UTF-8");
	            br = new BufferedReader(isr);
	            String line = null;
	            while((line = br.readLine()) != null){
	                StringTokenizer st = new StringTokenizer(line, " ");
	                
	                while(st.hasMoreTokens()){
	                    String key = st.nextToken().toLowerCase();
	    				System.out.println("Input: " + key); 
	    				int length = length(key); // KEY LENGTH
	    				// System.out.println(length); //PRNT LENGTH

	    				int Val = assignVal(0, key);
	    				// System.out.println("val: "+Val);

	    				int ValTwo = assignVal(length - 1, key);
	    				// System.out.println("valTwo: "+ValTwo);

	    				int hashVal = keyVal(Val, ValTwo);
	    				// System.out.println("hash value: " + hashVal);

	    				Insert(hashVal, key, arrayNums, arrayString);
	                    
	                }               
	                
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally{
	            try{if(br != null) br.close();}catch(Exception ex){}
	        }        

	        for (int i = 2; i < 38; i++) {

				WordList list = (WordList) arrayString[i];
				list.display();

			}

	}// end main
		// -------------------------------------------------------------

	public static void Insert(int hashVal, String key, int[] arrayNums,
			Object[] arrayString) {
		Word word = new Word(key, hashVal);
		WordList list = new WordList();

		arrayString[hashVal] = list;
		// System.out.println("here");
		list.insert(word, hashVal);
		// System.out.println("X");
		// list.display();

	}// end Insert

	public static int keyVal(int first, int last) {
		int num = first + last;

		return num;
	}// end keyVal

	public static int length(String key) {
		int length = key.length();
		return length;
	}// end length

	public static int assignVal(int position, String key) {
		char Hkey = key.charAt(position);

		int Val = 0;
		switch (Hkey) {
		case 'A':
			Val = 11;
			break;

		case 'B':
			Val = 15;
			break;

		case 'C':
			Val = 1;
			break;

		case 'D':
			Val = 0;
			break;

		case 'E':
			Val = 0;
			break;

		case 'F':
			Val = 15;
			break;

		case 'G':
			Val = 3;
			break;

		case 'H':
			Val = 15;
			break;

		case 'I':
			Val = 13;
			break;

		case 'J':
			Val = 0;
			break;

		case 'K':
			Val = 0;
			break;

		case 'L':
			Val = 15;
			break;

		case 'M':
			Val = 15;
			break;

		case 'N':
			Val = 13;
			break;

		case 'O':
			Val = 0;
			break;

		case 'P':
			Val = 15;
			break;

		case 'Q':
			Val = 0;
			break;

		case 'R':
			Val = 14;
			break;

		case 'S':
			Val = 6;
			break;

		case 'T':
			Val = 6;
			break;

		case 'U':
			Val = 14;
			break;

		case 'V':
			Val = 10;
			break;

		case 'W':
			Val = 6;
			break;

		case 'X':
			Val = 0;
			break;

		case 'Y':
			Val = 13;
			break;

		case 'Z':
			Val = 0;
			break;

		}// end switch

		return Val;
	}// end assignVal

}// end class