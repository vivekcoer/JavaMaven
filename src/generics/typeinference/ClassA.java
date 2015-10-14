package generics.typeinference;

import java.io.Serializable;
import java.util.ArrayList;

public class ClassA {
	public static <T> T pick(T a, T b) {
		return a;
	}
	
	String obj1 = "a";
	ArrayList<String> obj2 = new ArrayList<String>();
	
	Serializable obj3 = obj1;
	
	Serializable s = pick("a", new ArrayList<String>()); // so the compiler "infer" that T is type Serializable!
}