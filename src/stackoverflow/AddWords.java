package stackoverflow;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

public class AddWords {
	
	private Map<String, Byte[]> _myMap;
	private static final String _myFile = "C:/Test/MyTestFile.txt";
	
	public void doMapping(){
		
		try{
			FileInputStream fis = new FileInputStream(_myFile);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bf = new BufferedReader(isr);
			String line = null;
			while((line=bf.readLine())!=null){
				line = line.replaceAll(",", " "); //replace "," with white space
				String[] arr = null;
				if(line.contains(" ")){
					arr= line.split("\\s+");//use white space(s) as dimiliter
				}
				for(String str:arr){
					byte[] bytes = str.getBytes("US-ASCII");
					Byte[] bytesArr = ArrayUtils.toObject(bytes);
					if(!_myMap.containsKey(str)){
						_myMap.put(str, bytesArr);
					}else{
						addToBucket(str);
					}
				}
			}
		} catch(Exception e){
			
		}
		
		
		//stream
		//reader
		//tokenizer
	}
	
	public void addToBucket(String str){
		
	}
	
	public static void main(String args[]){		
		AddWords obj = new AddWords();
		obj.doMapping();	
	}

}
