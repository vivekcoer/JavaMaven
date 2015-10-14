package inheritance;

import java.util.Date;

public class ClassB extends ClassA {
	Date dob;

	ClassB(Date dob) {
		super(0,"");
		this.dob = dob;
	}
}
