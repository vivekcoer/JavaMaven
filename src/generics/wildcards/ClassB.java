package generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class ClassB {
	void foo(List<?> i) {
        Object ob = i.get(0);//compiles ok
        i.set(0, null);//compiles ok
//        i.set(0, ob);// does not compile!      its a valid option still doesnt compile - use helper method instead.
        fooHelper(i);

		ArrayList<Number> ob0 = new ArrayList<>();
//		i.set(0, ob0);// does not compile
        
//        List ob1 = i.get(0); // does not compile!
//        List<?> ob2 = i.get(0);// does not compile!
//        List<T> ob3 = i.get(0);// does not compile!
        
    }
	
	public <T> void fooHelper(List<T> obj){
		T t = obj.get(0);
		obj.set(0, t);//compiles
		obj.set(0, obj.get(0));// compiles
		
		testMethod(obj);// was checking for curioisty. <?> works both ways.  <T> could be passed to <?> and <?> could be passed to <T> as well.
	}
	
	public void testMethod(List<?> obj){
		
	}
}
