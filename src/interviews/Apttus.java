package interviews;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Apttus{
	
	private String[] myArr = new String[]{"John", "Joshua" , "Ross", "Joey" , "John", "Dana", "Rachel" , "Joey", "Chandler", "John", "Rachel", "Monica", "Rachel", "Gunther", "John", "Dave", "Phoebe", "Dana", "Ralf", "Peter", "Ralf"};
	
	public static void main(String[] args){
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		
		final int i2 = myMap.hashCode();
		
		String str = "Hello world";
		final int i3 = str.hashCode();
		
		final Hashtable<String, String> ht = new Hashtable<String, String>();

        final int h1 = ht.hashCode();
        System.out.println(h1); // output is 0

        ht.put("Test", "Test");

        final int h2 = ht.hashCode();
        System.out.println(h2); // output is 0 ?!?

        // Hashtable#hashCode() uses this algorithm to calculate hash code
        // of every element:
        //
        // h += e.key.hashCode() ^ e.value.hashCode()
        //
        // The result of XOR on identical hash codes is always 0
        // (because all bits are equal)

        ht.put("Test2", "Hello world");

        final int h3 = ht.hashCode();
        System.out.println(h3); // output is some hash code
	}	
	
}