package datastruct;

import java.util.Iterator;

public interface Table <E extends Comparable, T> {
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public T select ( E key ) ;
	
	/**
	 * 
	 * @param key
	 * @param data
	 * @return
	 */
	public boolean insert ( E key, T data ) ;
	
	/**
	 * 
	 * @param key
	 * @return
	 */
	public boolean delete ( E key ) ;
}
