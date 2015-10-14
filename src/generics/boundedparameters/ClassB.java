package generics.boundedparameters;

import java.util.Date;

public class ClassB extends ClassA implements InterfaceA{
	double weight;
	Date dom; // date of manufacturing

	public ClassB(double weight, Date dom) {
		super(0,"");
		this.weight = weight;
		this.dom = dom;
	}
	
	public void concatenate(double weight, Date dt){
		
	}
}