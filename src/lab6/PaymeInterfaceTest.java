/**
 * Student: Hieu Lim		ID: 040654796
 * Professor: Sandra Iroakazi
 * Course: CST8284 lab 6
 * Date: March 20, 2024
 * 
 * Description: This is a program that uses the Payme interface to demonstrate implementation
 * and polymorphism 
 * 
 */
package lab6;

/**
 * This main method tests the implementation of the Payme interface on different
 * types of objects. It contains a Payme array with different types of objects. This test
 * processes payment amounts for invoices and different types of paid programmers.
 */
public class PaymeInterfaceTest  {

	/**
	 * main method that holds an array for the Payme objects. Each object in the array 
	 * contains an instance of a different type which will be processed polymorphically.
	 * 
	 * @param args Not used in this program
	 */
public static void main(String[] args) {
	
	Payme[] paymeObjects = new Payme[6];
	
	paymeObjects[0] = new Invoice("22776", "brakes",3,300);
	paymeObjects[1] = new Invoice("33442", "gear",5, 90.99);
    paymeObjects[2] = new SalariedProgrammer("Chioma","Hieu","345-67-0001",03,2024,320.00);
    paymeObjects[3] = new HourlyProgrammer("Amara", "Hieu","234-56-7770",03,2024, 18.95, 40.00);
    paymeObjects[4] = new CommissionProgrammer("Peter", "Hieu","123-45-6999",03,2024,16500.00, 0.44);
    paymeObjects[5] = new BasePlusCommissionProgrammer("Esther", "Hieu","102-34-5888",03,2024,1200.00, 0.04,720);


 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
 for (Payme currentPayme : paymeObjects) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n", currentPayme.toString()); 
    
    /**
     * if statement to catch if one of the instances of the Payme array is 
     * a BasePlusCommissioniProgrammer
     */
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference
       BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;
       /**
        * increases the base salary by 5% if the current Payme object is an instance
        * of the BasePlusCommissionProgrammer class
        */
       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.05 * oldBaseSalary);
       System.out.printf(
          "new base salary with 5%% increase is: $%,.2f\n",
          programmer.getBaseSalary());
    } 
    
    /**
     * outputs payment due: (formatted to two decimal places) and outputs the
     * total payment amount of the Payme objects on a new line.
     */
    System.out.printf("payment due:%.2f%n", currentPayme.getPaymentAmount());
    System.out.println();

 }
}
}


