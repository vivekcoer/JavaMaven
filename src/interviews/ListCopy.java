package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;

public class ListCopy {
	
	public void plainCopy(List<String> src, List<String> dest){
		dest = src;
	}
	
	public void copyByRef(List<String> src, List<String> dest){
		dest = new ArrayList<String>(src);
	}
	
	public void copyByVal(List<String> src, List<String> dest){
		
	}

	public static void main(String[] args){
		
		ListCopy obj = new ListCopy();
		
		List<String> src = new ArrayList<String>();		
		src.add("c");
		src.add("a");
		src.add("d");
		src.add("b");		
		
		List<String> dest = new ArrayList<String>();			
		dest = null;
		
		dest=src;
		System.out.print("Destination List After direct copy: ");
		System.out.println(StringUtils.join(dest, ","));
		
		dest =null;
		obj.plainCopy(src, dest);		
/*		what should be inside dest? // remember Java is always "Pass By Value".  
		The difficult thing to understand is that Java passes objects as references and those references are passed by value.
		Therefore in this case reference of dest has been passed as "value" to the plainCopy(). 
		Local var "dest" inside plainCopy(), is a new variable pointing to same object as original dest does.  
		But dest = src inside plainCopy() will make it point to the src (which is an another object) now. Changes in one dest now will not affect the another dest.
		On the other hand if instead of reassigning the local dest inside plainCopy() to another reference, if you had modified the underlying object, those changes will appear in the calling function as well. */
		System.out.print("Destination List After Plain Copy: ");
		System.out.println(StringUtils.join(dest, ","));
		
		dest = null;
		dest=src;
	    Collections.sort(src);
		System.out.print("Destination List After direct copy, Source Sorted: ");
		System.out.println(StringUtils.join(dest, ","));
		//Would the destination also be sorted?
		
		//remove the sorting of source
		src = new ArrayList<String>(Arrays.asList(new String[]{"c","a","d","b"}));
		
		dest=null;
		dest = new ArrayList<String>(src);//copy constructor!
		Collections.sort(src);
		System.out.print("Destination List After Construction copy but source sorted: ");
		System.out.println(StringUtils.join(dest, ","));
		//Would the destination also be sorted? No. Because copy constructors makes a new list copying the values of the "references" of the original list.		
		
	}
}
