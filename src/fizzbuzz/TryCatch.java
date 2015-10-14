package fizzbuzz;

public class TryCatch {
    public static void main(String args[]){
    	int[] myArr = new int[3];
    	try{
    		myArr[1] = 0;
    		System.out.println("Inside Try"); 
    	}catch (Exception e){
    		System.out.println("Inside Catch");
    	}finally {
    		System.out.println("Inside Finally");
    	}
    }
}