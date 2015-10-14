package interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Apttus1 {
	
	//find out the word which is been repeated most!
	
	private String _myStr[] = {"John", "Joshua" , "Ross", "Joey" , "John", "Dana", "Rachel" , "Joey", "Chandler", "John", "Rachel", "Monica", "Rachel", "Gunther", "John", "Dave", "Phoebe", "Dana", "Ralf", "Peter", "Ralf"};
		
	public Map<String, Integer> mapify(List<String> list){
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		Iterator<String> it = list.iterator();  //Iterator it2 = map.entrySet().iterator();
		while (it.hasNext()){
			String str = it.next();
			if(map.get(str)!=null){
				map.put(str, map.get(str) + 1);
			}else{
				map.put(str, 1);
			}
		}
		
		return map;
	}
	
	public List<Entry<String,Integer>> sort(Map<String, Integer> map){
		
		//convert the map to list and then sort it using custom comparator
		//to convert the map to list
		//get entry set
		//convert this set into list		
		Set<Entry<String,Integer>> set = map.entrySet();
		List<Entry<String,Integer>> list = new ArrayList<Entry<String,Integer>>(set);
		
		Collections.sort(list, new Comparator<Entry<String, Integer>>()
		{
			public int compare(Entry<String,Integer> o1, Entry<String, Integer> o2){				
				return (o2.getValue()).compareTo(o1.getValue());
			}	
		}
		);		
		return list;
		
	}
	
	public static void main(String[] args){
		
		Apttus1 obj = new Apttus1();		
		List<String> list  = new ArrayList<String>(Arrays.asList(obj._myStr));
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map = obj.mapify(list);
		//obj.sort(map);
		
		List<Entry<String, Integer>> list1 = obj.sort(map);
        for(Map.Entry<String, Integer> entry:list1){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
        
        Iterator<String> it = map.keySet().iterator();        
        while(it.hasNext()){
        	 String key = it.next();
        	 System.out.println(key+" ==== "+map.get(key));
        }
	}
}
