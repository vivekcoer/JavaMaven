package generics.wildcards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ClassA {
	
	public static <T> void test1(T param, List<T> list){
		list.add(param);
	}
	
	public static void main(String args[]){
		ArrayList<String> obj1 = new ArrayList<>();
		ArrayList<Integer> obj2 = new ArrayList<>();
		Integer i = 1;
		String s = "hello";
		
		test1(s, obj1);
		
		//test1(s, obj2);
		//Collection<Double> obj3 = new Collection<>();
	}

}
