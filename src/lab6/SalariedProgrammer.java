/**
 * Student: Hieu Lim		ID: 040654796
 * Professor: Sandra Iroakazi
 * Course: CST8284 lab 6
 * Date: March 20, 2024
 * 
 * Description: This is a Salaried Programmer class that extends Programmer and implements Payme
 * 
 */


package lab6;

/**
 * This class represents a programmer that is paid a weekly salary and returns the weekly pay
 */
public class SalariedProgrammer extends Programmer implements Payme  {
	
/**
 * Weekly salary amount
 */
private double weeklySalary;

/**
 * Constructor for the Salaried programmer class. Contains argument exceptions for illegal input (salary must
 * be greater than zero)
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber Social security number of the programmer
 * @param month the month
 * @param year the year
 * @param weeklySalary the weekly salary of the programmer
 */
public SalariedProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double weeklySalary) {
super(firstName, lastName, socialSecurityNumber); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * 
 * @param weeklySalary Sets the weekly salary and throws an error message if the weekly salary
 *  is below zero.
 */
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 

/**
 * 
 * @return return the weekly salary of the Salaried Programmer
 */
public double getWeeklySalary() {
return weeklySalary;
} 

/**
 * This method name was changed to override the Programmer abstract method.
 */

/**
 * This method returns the weekly salary of the employee. It does not perform any special calculations
 * as the programmer is paid a set salary every week
 * @return weekly salary of the salaried programmer
 */
@Override                                                           
public double getPaymentAmount() {                                          
return getWeeklySalary();                                        
}                                             

/**
 * Formatted String representation of SalariedProgrammer object.
 * @return returns a formatted string for the personal details and payment information
 */
@Override        
public String toString() {
	  return String.format("Salaried Programmer: %s %s\nSocial Security Number: %s\nWeekly Salary: $%,.2f",
	          getFirstName(), getLastName(), getSocialSecurityNumber(), getWeeklySalary(), getPaymentAmount());
	}
}

