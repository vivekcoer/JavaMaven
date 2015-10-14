package Threads.basic1;

import java.util.Scanner;

public class GetMail implements Runnable {
	
	private int startTime;
	
	public GetMail(int startTime){
		this.startTime = startTime;
	}
	
	public void run(){
		try{
			Thread.sleep(startTime*1000);
		}catch (InterruptedException e){
			e.printStackTrace();			
		}
		
		System.out.println("Getting Emails");
		
//		Scanner s = new Scanner(System.in);
//		String str = s.next();
//		System.out.println(str);
		
	}

}
