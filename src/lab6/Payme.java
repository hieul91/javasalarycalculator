/**
 * Student: Hieu Lim		ID: 040654796
 * Professor: Sandra Iroakazi
 * Course: CST8284 lab 6
 * Date: March 20, 2024
 * 
 * Description: This is an Interface to be used by all of the classes.
 * 
 */
package lab6;

/**
 * this is an Interface class which contains a method that calculates amount to be paid
 * and is used by all other classes.
 * 
 */
public interface Payme {
	/**
	 * this method is an interface to be implemented by each class
	 * @return the total amount to be paid
	 */
	public double getPaymentAmount();
}
