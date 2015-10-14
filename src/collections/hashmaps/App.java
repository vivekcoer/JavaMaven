package collections.hashmaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
	
    public static void main(String [] args){
    	//int[] myArr = new int[3];
    	
    	//ids for Hash Map
    	SystemDomain sysDom1 = new SystemDomain(001,"/system1","sap.com");
    	SystemDomain sysDom2 = new SystemDomain(002,"/system2","sap.com");
    	SystemDomain sysDom3 = new SystemDomain(003,"/system2","sap.com");
    	SystemDomain sysDom4 = new SystemDomain(004,"/system1","oracle.com");
    	
    	//Prepara Values for HashMap
    	CacheData cacheData1 = new CacheData(2, "device2a", "200MB");
    	CacheData cacheData2 = new CacheData(1, "device2b", "320MB");
    	CacheData cacheData3 = new CacheData(3, "device2c", "180MB");
    	
    	List<CacheData> cacheList1 = new ArrayList<CacheData>();
    	cacheList1.add(cacheData1);
    	cacheList1.add(cacheData2);
    	cacheList1.add(cacheData3);   	    	
    	
    	CacheData cacheData4 = new CacheData(1, "device3a", "500MB");
    	CacheData cacheData5 = new CacheData(2, "device3b", "420MB");
    	CacheData cacheData6 = new CacheData(2, "device3c", "280MB");
    	
    	List<CacheData> cacheList2 = new ArrayList<CacheData>();
    	cacheList2.add(cacheData4);
    	cacheList2.add(cacheData5);
    	cacheList2.add(cacheData6);
    	
    	CacheData cacheData7 = new CacheData(3, "device4a", "700MB");
    	CacheData cacheData8 = new CacheData(5, "device4b", "820MB");
    	CacheData cacheData9 = new CacheData(2, "device4c", "680MB");
    	
    	List<CacheData> cacheList3 = new ArrayList<CacheData>();
    	cacheList3.add(cacheData7);
    	cacheList3.add(cacheData8);
    	cacheList3.add(cacheData9);
    	
    	CacheData cacheData10 = new CacheData(12, "device3a", "5GB");
    	CacheData cacheData11 = new CacheData(11, "device3b", "4GB");
    	CacheData cacheData12 = new CacheData(20, "device3c", "8GB");
    	
    	List<CacheData> cacheList4 = new ArrayList<CacheData>();
    	cacheList4.add(cacheData10);
    	cacheList4.add(cacheData11);
    	cacheList4.add(cacheData12);
    	
    	Collections.sort(cacheList4, new Comparator<CacheData>(){
    		@Override 
    		public int compare(CacheData cd1, CacheData cd2){
    			if(cd1.noOfActiveThreads>cd2.noOfActiveThreads){
    				return 1;
    			}else if(cd1.noOfActiveThreads==cd2.noOfActiveThreads) {
    				return 0;
    			}else{
    				return -1;
    			}    			
    		}
    	});
    	
        //values for HashMap
    	SystemData sysData1 = new SystemData(sysDom1, cacheList1);
    	SystemData sysData2 = new SystemData(sysDom2, cacheList2);
    	SystemData sysData3 = new SystemData(sysDom3, cacheList3);
    	SystemData sysData4 = new SystemData(sysDom4, cacheList4);
    	
    	
    	Map<SystemDomain, SystemData> sysMap = new HashMap<SystemDomain, SystemData>();
    	sysMap.put(sysDom1, sysData1);
    	sysMap.put(sysDom2, sysData2);
    	sysMap.put(sysDom3, sysData3);
    	sysMap.put(sysDom4, sysData4);
    	
    	//even if all the values of sysDom1 and sysDom2 are made same, hash map still shows 4 entries.  Because unless equals and hashcode are overriden hashmap has no way of knowing whether the 2 objects are equal or not
    	
    	//Conditions for Hash Map
    	//1.  If the two objects are equal their hashcodes HAVE to be same!
    	//2.  If the two hashcodes are equals it DOES NOT imply that their respective objects are equal!
    	
    	//3.  During an execution everytime the hashcode function should produce the same int hashcode for same object!
    	
    	//now lets iterate through the map    	
    	for(SystemDomain key: sysMap.keySet()){
    		System.out.println(sysMap.get(key));//toString() would cause this to automatically appear in string format.
    	}
    	
    	//comment the equals and hashcode from SystemDomain and see the result.
    	//comment only equals
    	//comment only hashcode
    	
    	//Different method
    	/*Iterator<SystemDomain> sysDomItr = sysMap.keySet().iterator();
    	while(sysDomItr.hasNext()){
    		SystemDomain obj = sysDomItr.next();
    		System.out.println(obj);
    	}*/  	
    	
    }
    
}
