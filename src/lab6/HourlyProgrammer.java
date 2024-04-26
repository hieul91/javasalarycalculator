/**
 * Student: Hieu Lim		ID: 040654796
 * Professor: Sandra Iroakazi
 * Course: CST8284 lab 6
 * Date: March 20, 2024
 * 
 * Description: This is a class that extends the Programmer class and implements Payme
 * 
 */
package lab6;

/**
 * This class represents a programmer who is payed hourly. The pay is calculated by the num of hours worked *
 * the hourly wage. It also uses illegal argument exception to make sure the inputs are in acceptable bounds.
 * 
 */
public class HourlyProgrammer extends Programmer implements Payme {
	
/**
 *  wage per hour
 */
private double wage;

/**
 * hours worked for the week
 */
private double hours;

/**
 * constructor for the hourly programmer class
 * @param firstName the first name of the programmer
 * @param lastName the last name of the programmer
 * @param socialSecurityNumber the social security number of the programmer
 * @param month the month
 * @param year the year
 * @param wage the hourly wage of the programmer
 * @param hours the number of hours worked
 */
public HourlyProgrammer(String firstName, String lastName,
String socialSecurityNumber, int month, int year, 
double wage, double hours) {
super(firstName, lastName, socialSecurityNumber);

if (wage < 0.0) { // validate wage if user inputs a number lower than zero
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}
/**
 *  validate hours, the number of hours worked must be between 0 and 168
 */

if ((hours < 0.0) || (hours > 168.0)) { 
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 

/**
 * 
 * @param wage sets wage variable as long as the boundaries are met (the number must be greater than zero)
 */
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 

/**
 * 
 * @return wage the hourly wage of the programmer
 */
public double getWage() {
return wage;
} 

/**
 * 
 * @param hours sets hours worked as long as the hours worked are within the limit (0 and 168)
 */
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 

/**
 * 
 * @return hours the number of hours worked
 */
public double getHours() {
return hours;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

/*
 * yes the method below has to be modified because we changed the name to getPaymentAmount
 * in the Abstract Class called Programmer which implements the Payme Interface
 */

/**
 * The method below calculates the total pay for the hourly programmer by multiplying the hours worked by 
 * the hourly wage. It also checks if the number of hours exceeds 40 and provides and overtime rate 1.5x 
 * for any hours worked after 40 hours.
 * @return total payment amount
 */
@Override                                                           
public double getPaymentAmount() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          

//return String representation of HourlyProgrammer object                                                                          

/**
 * Overrides the toString method in the Programmer class to implement it's own string output and
 * formatting based on the output file provided
 * @return A string formatted to display Programmer's personal details and payment information
 */
@Override
public String toString() {
return String.format("Hourly Programmer: %s %s\nSocial Security Number: %s\nHourly Wage: $%,.2f; Hours Worked: %,.2f",
        getFirstName(), getLastName(), getSocialSecurityNumber(), getWage(), getHours(), getPaymentAmount());
}

                     
}

