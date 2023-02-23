/**
 * This class represents a wizard for
 * a D&D type game.
 * @author Aaron Weedman
 * @version 1.0
 * Lab 2
 * Spring 2023
 */

public class Wizard implements Lockable{
	
	private String name;//will be the name of the wizard
	private int health;//will be used to denote the wizard's health
	private int key;//will be an integer that will act as a code/key
	boolean locked;//will determine if the key is locked or unlocked.
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		setName("");
		setHealth(100);
		key = 0;
		locked = false;
	
	}//end constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name) {
		setName(name);
		setHealth(100);
		key = 0;
		locked = false;
	
	}//end constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		if(isLocked()) {
		}//end if
		else {
			health = health - power;
		}//end else
	}//end takeDamage
	
	/**
	 * Getter for name
	 * @return name
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name
	 */
	public void setName(String aName) {
		name = aName;
	}//end setName
	
	/**
	 * Getter for health
	 * @return health
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health
	 */
	public void setHealth(int aHealth) {
		health = aHealth;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return key
	 */
	public int getKey() {
		return key;
	}//end getKey

	@Override
	/*
	 * The toString method gives us the information on the wizard such as
	 * health, name, the key, and if it's locked or not.
	 */
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString

	@Override
	/*
	 * The setKey method sets the key as long as the key is greater than 0 and
	 * a key has not already been set. Otherwise, if not both true, it doesn't set the key 
	 */
	public void setKey(int aKey) {
		if(aKey > 0 && key == 0) {
			key = aKey;
		}//end if
	}//end setKey
	
	@Override
	/*
	 * The isLocked method will return the value of locked.
	 * @return locked
	 */
	public boolean isLocked() {
		return locked;
	}//end isLocked

	@Override
	/*
	 * In the lock method, if key and aKey match, then locked will be set to true
	 */
	public void lock(int aKey) {
		if(key == aKey) {
			locked = true;
		}//end if
	}//end lock

	@Override
	/*
	 * In the unlock method, if key and aKey match, then locked will be set to false
	 */
	public void unlock(int aKey) {
		if(key == aKey) {
			locked = false;
		}//end if
	}//end unlock
}//end class