/**
 * The Lockable interface defines four methods that are implemented by the Wizard class.
 * @author Aaron Weedman
 * @version 1.0
 * Lab 2
 * Spring 2023
 */

public interface Lockable {
	
	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);	
	public boolean isLocked();
	
}//end interface
