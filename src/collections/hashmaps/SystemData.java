package collections.hashmaps;

import java.util.List;

public class SystemData {
	
	SystemDomain sysDom;
	List<CacheData> dataList;
	public SystemDomain getSysDom() {
		return sysDom;
	}
	public void setSysDom(SystemDomain sysDom) {
		this.sysDom = sysDom;
	}
	public List<CacheData> getDataList() {
		return dataList;
	}
	public void setDataList(List<CacheData> dataList) {
		this.dataList = dataList;
	}
	public SystemData(SystemDomain sysDom, List<CacheData> dataList) {
		super();
		this.sysDom = sysDom;
		this.dataList = dataList;
	}
	@Override
	public String toString() {
		return "SystemData [sysDom=" + sysDom.toString() + ", dataList=" + dataList + "]";
	}
	

}
