/**
 * Student: Hieu Lim		ID: 040654796
 * Professor: Sandra Iroakazi
 * Course: CST8284 lab 6
 * Date: March 20, 2024
 * 
 * Description: This class represents a Programmer that is paid based on commission
 * 
 */

package lab6;


/**
 * This class represents a commission based paid programmer. It extends the Programmer abstract class and
 * implements the Payme interface. It calculates the weekly pay by multiplying the total sales by the
 * commission rate.
 */
public class CommissionProgrammer extends Programmer { 
	
/**
 * The total amount in sales by the Commissioned programmer
 */
private double grossSales;

/**
 * the commission percentage
 */
private double commissionRate; // commission percentage

/**
 * Constructor for the Commissioned programmer class
 * 
 * @param firstName the first name of the programmer
 * @param lastName the last name of programmer
 * @param socialSecurityNumber social security number of programmer
 * @param month the month
 * @param year the year
 * @param grossSales gross sales by the programmer
 * @param commissionRate commission rate to be earned
 */
public CommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double grossSales, double commissionRate) {
super(firstName, lastName, socialSecurityNumber);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 

/**
 * Sets the total amount of sales by the Commissioned Programmer based on the the amount of apps sold. Throws
 * exception error message if the sales are below zero. 
 *
 * @param grossSales the gross sales made by the programmer
 */
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 

/**
 * Get the total gross sales by the Commissioned Programmer
 * @return gross sales amount
 */
public double getGrossSales() {
return grossSales;
} 

/**
 * sets the commission rate to the variable and boundary checks that the commission
 * rate must be between 0 and 1.0
 * @param commissionRate the commission rate earned by the programmer
 */
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 

/**
 * gets the commission rate and returns the value so that the getPaymentAmount() method can
 * calculate the pay based on the total sales multiplied by the commission rate
 * @return commission rate
 */
public double getCommissionRate() {
return commissionRate;
} 


/**
 * This method overrides the abstract method in the Programmer class and returns the
 * payment for the commissioned employee based on the total sales multiplied by the
 * commission rate
 * @return total payment calculated by total sales * commission rate
 */
@Override                                                           
public double getPaymentAmount() {                                            
return getCommissionRate() * getGrossSales();                    
}                                             

//return String representation of CommissionProgrammer object
/**
 * Provides a string representation of the CommissionProgrammer object.
 * @return A formatted string that includes the programmer's personal information and payment details.
 */
@Override
public String toString() {
return String.format("Commission Programmer: %s %s\nSocial Security Number: %s\nGross Sales: $%,.2f; Commission Rate: %.2f",
        getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate(), getPaymentAmount());
}

}

