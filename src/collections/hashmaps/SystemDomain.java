package collections.hashmaps;

public class SystemDomain {
	int id;
	String url;
	String domain;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public SystemDomain(int id, String url, String domain) {
		super();
		this.id = id;
		this.url = url;
		this.domain = domain;
	}

	@Override
	public String toString() {
		return "SystemDomain [id=" + id + ", url=" + url + ", domain=" + domain
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((domain == null) ? 0 : domain.hashCode());
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;		
//		if( !(obj instanceof SystemDomain) ){
//			return false;
//		}
		
		SystemDomain other = (SystemDomain) obj;
		
//		if(domain.equals(other.domain) && url.equals(other.url)){
//			return true;
//		}else{
//			return false;
//		}		
		if (domain == null) {
			if (other.domain != null)
				return false;
		} else if (!domain.equals(other.domain))
			return false;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}
		
}
