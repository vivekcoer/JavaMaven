package immutable.test;

import java.util.Date;

public class App {
	public static void main(String args[]) {
		Date dt1 = new Date("07/04/2014");
		String name1 = "bike";
		
        TemplateBike obj = new TemplateBike(name1,10.7f,2,dt1); 
        boolean objCreated;
        objCreated = obj.TemplateBike(name1,10.7f,2,dt1);
        dt1.setYear(2015);
        name1="motorbyke";
        
        Date dt = obj.getDateOfManufacturing();        
        String name = obj.getName();
        
        Date dt2 = new Date("01/01/2010");
        String name2 = "manualbyke";
        
        obj.changeObject(name2, 2f, 3, dt2);        
        
		System.out.println("Testing");
	}
}
