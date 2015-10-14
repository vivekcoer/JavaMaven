package fizzbuzz;

public class StringUtils {
	 public static void main(String[] args){
		 String str = "My String";
		 str = insertAt(str, 4, '$');
		 System.out.println(str);
	 }
	 
	 
	 public static String insertAt(String str, int i, char c) {
		 
		 char[] myCharArr = str.toCharArray();
		 int len = myCharArr.length;
		 
		 char[] myNewCharArr = new char[len+1];
		 
		 for (int j = 0; j<len+1; j++){			 
			 if(j<i){
				 myNewCharArr[j] = myCharArr[j];
			 }else if(j==i){
				 myNewCharArr[j] = c;				 
			 }else{
				 myNewCharArr[j] = myCharArr[j-1];
			 }
		 }		 
		 return new String(myNewCharArr);
	 }
	 
}