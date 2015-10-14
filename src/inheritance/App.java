package inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class App {

	public static void inspect(ClassA objA) {
		System.out.println(objA.getClass().getName());
	}

	public static void main(String args[]) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY",
					Locale.ENGLISH);
			Date dt = sdf.parse("12/04/1979");
			ClassA objA = new ClassA(1, "A");
			ClassB objB = new ClassB(dt);
            
			//both are fine. run time polymorphism
			
			inspect(objA);
			inspect(objB);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
