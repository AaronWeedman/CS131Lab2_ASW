/**
 * The Application class tests the Wizard class
 * @author Aaron Weedman
 * @version 1.0
 * Lab 2
 *Spring 2023
 */

public class Application {

	public static void main(String[] args) {
		
		Wizard wiz = new Wizard("Harry");//Instantiating the Wizard class.
		
		wiz.setKey(9999);//sets key to 9999
		
		wiz.lock(9999);//locks the key
		
		wiz.unlock(1234);//tries to unlock the key.
		System.out.println("Is the key still locked? " + wiz.isLocked() + "\n");//outputs "Is the key still locked? true" (because the key is still locked)
		
		wiz.takeDamage(20);
		System.out.println("Currnet health: " + wiz.getHealth() + "\n");//outputs "Current health: 100" (because the key is still locked)
		
		wiz.unlock(9999);//unlocks the key
		System.out.println("Id the key still locked? " + wiz.isLocked() + "\n");//outputs "Is the key still locked? false"
		
		wiz.takeDamage(20);//inflicts 20 damage
		System.out.println("Currnet health: " + wiz.getHealth() + "\n");//outputs "Current health: 80"
		
		System.out.println(wiz.toString());//outputs "Wizard [name=Harry, health=80, key=9999, locked=false]"
	}//end main
}//end class