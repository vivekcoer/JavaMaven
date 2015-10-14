package errorhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ReadFile {
	 public void readFile(String file) throws FileNotFoundException {     
	        boolean found = findFile(file);                         
	        if (!found)
	            throw new FileNotFoundException("Missing file");    
	        else {
	            //code to read file
	        }
	    }
	 
	    boolean findFile(String file){
	        //code to return true if file can be located
	    	try{
		    	lookupFile2();
	    	}catch (FileNotFoundException ex){
	    		ex.printStackTrace();
	    	}
	    	//lookupFile(); // this function can be called without try catch if the parent function is throwing some exception
	    	return true;
	    }
	    
	 // lookupFile can not throw exception unless throws exception is not included in signature.
	    void lookupFile() throws FileNotFoundException{
	    	throw new FileNotFoundException("Missing file");
	    } 
	    
	    //but the reverse is true
	    
	    void lookupFile2() throws FileNotFoundException{
	    	// no exception thrown! but fine.
	    } 
	    
	  //  In the try block, the code throws either an object of SQLException or IOException, conditionally. 
	      //With Java 7, the compiler can determine that the exception object received by the catch block is either of these types and so it's okay to rethrow it, 
	    //even if the type of the exception variable in the exception handler is Exception—a super class of SQLException and IOException. 
	    //This, however, wasn't allowed in Java versions prior to 7.
	    
	    
	public void function4() throws IOException, SQLException {
		String source = "DBMS";
		boolean flag = true;
		try {
			if (source.equals("DBMS")){
				throw new SQLException();
			}
			else{
				if(flag){
					throw new IOException();//ok
				}else{
					throw new FileNotFoundException(); // ok
				}			
			}
		} catch (Exception e) {
			throw e;
		}
	}
	    
	    
	    //this is fine  I could throw an exception of subclass
	    public void function1(String file) throws IOException {    
	        boolean found = function2(file);                         
	        if (!found)
	            throw new FileNotFoundException("Missing file");  
	        else {
	            //code to read file
	        }
	    }
	    
	  //this is not fine  I could NOT throw an exception of superclass
	    public void function3(String file) throws FileNotFoundException {    
	        boolean found = function2(file);                         
	        if (!found)
//	        	throw new IOException("Missing file"); // gives a compile error
	        	;
	        else {
	            //code to read file
	        }
	    }
	    
	    boolean function2(String file) {
	        return true;
	    }
}
