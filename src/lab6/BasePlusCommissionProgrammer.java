/**
 * Student: Hieu Lim		ID: 040654796
 * Professor: Sandra Iroakazi
 * Course: CST8284 lab 6
 * Date: March 20, 2024
 * 
 * Description: This is the base plus commission class that is a subclass of the commissioned programmer
 * 
 */

package lab6;


/**
 * This class is a subclass of commissionProgrammer. It represents a programmer
 *  that gets paid by commission plus a base salary.
 * 
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer implements Payme{ 

	/**
	 *  baseSalary of the base plus commission class
	 */
private double baseSalary;

/**
 * Constructor for the basePlusCommission class. Contains personal details as well as payment information
 * with base salary added.
 * 
 * @param firstName first name of the programmer
 * @param lastName last name of the programmer
 * @param socialSecurityNumber Social security number of the programmer
 * @param month the month
 * @param year the year
 * @param grossSales total gross sales of the programmer
 * @param commissionRate commission rate earned by the programmer
 * @param baseSalary base salary of the programmer
 */
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber, int month, int year, 
double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, 
  month, year, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

/**
 * set base salary
 * @param baseSalary the base salary of the programmer
 */
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

/**
 * return base salary
 * @return the base salary
 */
public double getBaseSalary() {
return baseSalary;
}

/**
 *  this method has been renamed to match the method in the parent class so it can be
 *  overridden. It calculates the pay by using the method in the superclass and adds
 *  the base salary for this Programmer.
 *  @return the total payment for commission plus base salary
 */
@Override                                                            
public double getPaymentAmount() {                                             
return getBaseSalary() + super.getPaymentAmount();                        
} 


/**
 * Provides a string format for the BasePlusCommissionProgrammer.
 * @return a string for the programmer's personal details, base salary, and payment amount.
 */
public String toString() {
  return String.format("Base-Plus Commission Programmer: %s %s\nSocial Security Number: %s\nGross Sales: $%,.2f; Commission Rate: %.2f; Base Salary: $%,.2f",
          getFirstName(), getLastName(), getSocialSecurityNumber(), getGrossSales(), getCommissionRate(), getBaseSalary(), getPaymentAmount());
}


}



