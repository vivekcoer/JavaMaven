package errorhandling;

public class MyRuntimeException extends RuntimeException {
	
	public static final String RUNTIME_EXCEPTION = "My runtime exception was raised";
	
    MyRuntimeException(){
    	super();
    }
    
    MyRuntimeException(String args0, Throwable args1){
    	super (args0, args1);
    }

}
