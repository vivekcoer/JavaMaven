package observerpattern;

import java.util.Observable;
import java.util.Observer;

public class ResponseHandler implements Observer {
	private String resp;
	public void update(Observable obs, Object obj){
		if(obj instanceof String){
			resp = (String) obj;
			System.out.println("\nRecieved text is: " + resp);
		}
	}
}
