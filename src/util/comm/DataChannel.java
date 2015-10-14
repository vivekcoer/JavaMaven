package util.comm;

import java.util.Hashtable;
import java.util.Enumeration;

public class DataChannel {

	private Hashtable TIDs;
	private String myName;

	private DataChannel() {
		TIDs = new Hashtable();
	}

	private static Hashtable registry = null;

	/** getChannel (writer version) */
	public static synchronized DataChannel getChannel(String name) {
		if (registry == null)
			registry = new Hashtable();
		DataChannel it = (DataChannel) registry.get(name);
		if (it == null) {
			it = new DataChannel();
		    it.myName = name;
			registry.put(name, it);
		}
		return it;
	}
	
	/** getChannel (reader version) */
//    public static DataChannel getChannel(String name, Thread myTID, int qSize) {
//        DataChannel it = getItem(name);
//  
//        if (qSize == 0)
//            return it;
//        
//        it.TIDs.put(myTID, new DataItem(myTID, qSize));
//        return it;
//     }
}