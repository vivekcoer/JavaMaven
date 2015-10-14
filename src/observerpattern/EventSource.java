package observerpattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Observable;

public class EventSource extends Observable implements Runnable {
	public void run(){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);			
			while (true){
				String str = br.readLine();
				setChanged();
				notifyObservers(str);
			}			
		}catch (Exception e){
			e.printStackTrace();
		}	
	}
}
