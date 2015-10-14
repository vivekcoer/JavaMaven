package generics.boundedparameters;

import java.util.Date;

public final class ClassC extends ClassA{
	
	Date dob; //date of birth;
	
	public ClassC(int id, String name, Date dob){
		super(id, name);
	}
	
}
