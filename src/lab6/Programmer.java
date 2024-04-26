/**
 * Student: Hieu Lim		ID: 040654796
 * Professor: Sandra Iroakazi
 * Course: CST8284 lab 6
 * Date: March 20, 2024
 * 
 * Description: This is an abstract class for all the different types of programmers
 * 
 */

package lab6;

/**
 *  This Abstract class Programmer represents all the different types of programmers. It
 *  has variables to hold their personal details and an abstract method to be overridden in
 *  in each of their unique subclasses.
 */
public abstract class Programmer implements Payme {

/**
 *  first name of the Programmer
 */
private String firstName;

/**
 *  last name of the programmer
 */
private String lastName;

/**
 * social security number of the programmer
 */
private String socialSecurityNumber;


/**
 * Constructs a programmer and passes the personal details into parameters (First and last name and SSN)
 * 
 * @param firstName First name of the Programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber Social security number of the programmer
 */
public Programmer(String firstName, String lastName, String socialSecurityNumber) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.socialSecurityNumber = socialSecurityNumber;
}

/**
 * get the firstName
 * @return the first name of the programmer
 */
public String getFirstName() {
 return firstName;
}

/**
 * sets firstName
 * @param firstName set first name of programmer
 */
public void setFirstName(String firstName) {
 this.firstName=firstName;
}

/**
 * gets lastName
 * @return the last name of the programmer
 */
public String getLastName() {
 return lastName;
}

/**
 * sets lastName
 * @param lastName set last name of programmer
 */
public void setLastName(String lastName) {
 this.lastName=lastName;
}

/**
 * gets SocialSecurityNumber
 * @return the social security number of the programmer
 */

public String getSocialSecurityNumber() {
 return socialSecurityNumber;
}

/**
 * sets socialSecurityNumber
 * @param SocialSecurityNumber Social security number
 */
public void setSocialSecurityNumber(String SocialSecurityNumber) {
 this.socialSecurityNumber=SocialSecurityNumber;
}

/**
 * return String representation of Programmer object
 * @return toString method which formats how the personal details are displayed
 */
@Override
public String toString() {
return String.format("%s %s\n%s: %s\n%s: %s", 
  getFirstName(), getLastName(), getSocialSecurityNumber());
} 


/*
 * because this class contains an abstract method the class itself must be declared abstract
 * or there program will not compile
 */
public abstract double getPaymentAmount(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
/*
 * There is no implementation of this method because it's an abstract method which is a
 * template for it's subclasses to override and implement their own logic. We changed the name
 * of this method so that it matches the name of the getPaymenyAmount method in the Payme class since 
 * this class implements the Payme interface.
 */
} 


