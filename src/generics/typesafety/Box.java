package generics.typesafety;

public class Box {
	Object obj;

	public Box(Object obj) {
		this.obj = obj; // Now somewhere in the code a string could be inserted
						// and somewhere in code an Integer might be. There
						// would be no compile time error - generics come handy
						// in this.
	}
	
	public Object getBox(){
		return obj;
	}
	
	public static void main(String args[]){
		Box box = new Box("BoxClassName");
		String str = (String)box.getBox();
		Integer i = (Integer)box.getBox(); //Will throw a runtime error
	}
}
