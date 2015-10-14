package Threads.basic1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class GetTime extends Thread {
	
	public void run(){
		for (int i=0; i<20; i++){
			
			Locale myLocale = new Locale("en");
			Date rightNow = new Date();
			String outTimeStr;
			String outDateStr;
			DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, myLocale);
			DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, myLocale);
			
			outTimeStr = timeFormatter.format(rightNow);
			outDateStr = dateFormatter.format(rightNow);
			
			System.out.println(outTimeStr);
			System.out.println(outDateStr);
			System.out.println();
			
			try{
				Thread.sleep(2000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}		
			
		}
	}

}
