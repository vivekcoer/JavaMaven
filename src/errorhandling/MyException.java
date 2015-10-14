package errorhandling;

public class MyException extends Exception {
	
	private static final long serialVersionUID = 1L;
	public static String Credentials_Failed = "";
	
	MyException(){
		//this is not necessary unless you really do something here and then call super();
		super();
	}
	
	MyException(String args0){
		//this is not necessary unless you really do something here and then call super();
		super(args0);
	}
	
	MyException(Throwable args0){
		//this is not necessary unless you really do something here and then call super();
		super(args0);
	}
	
	MyException(String args0, Throwable args1){
		//this is not necessary unless you really do something here and then call super();
		super(args0, args1);
	}
}
