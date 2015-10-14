package collections.hashmaps;

public class CacheData {
	int noOfActiveThreads;
	String deviceName;
	String totalMemory;

	public int getNoOfActiveThreads() {
		return noOfActiveThreads;
	}
/**
 * 
 * @param noOfActiveThreads
 */
	public void setNoOfActiveThreads(int noOfActiveThreads) {
		this.noOfActiveThreads = noOfActiveThreads;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getTotalMemory() {
		return totalMemory;
	}

	public void setTotalMemory(String totalMemory) {
		this.totalMemory = totalMemory;
	}
	
	public CacheData(int noOfActiveThreads, String deviceName,
			String totalMemory) {
		super();
		this.noOfActiveThreads = noOfActiveThreads;
		this.deviceName = deviceName;
		this.totalMemory = totalMemory;
	}
	@Override
	public String toString() {
		return "CacheData [noOfActiveThreads=" + noOfActiveThreads
				+ ", deviceName=" + deviceName + ", totalMemory=" + totalMemory
				+ "]";
	}	
	
}
