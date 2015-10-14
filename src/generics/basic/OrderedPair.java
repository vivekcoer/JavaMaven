package generics.basic;


public class OrderedPair<K, V> implements IPair<K, V>{
	K key;
	V value;
	
	public OrderedPair(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey(){
		return key;
	}
	
	public V getValue(){
		return value;
	}
}
