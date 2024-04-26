/**
 * Student: Hieu Lim		ID: 040654796
 * Professor: Sandra Iroakazi
 * Course: CST8284 lab 6
 * Date: March 20, 2024
 * 
 * Description: This is a class that calculates the total price of parts
 * 
 */

package lab6;

/**
 * This is an Invoice class that calculates total amount owed for the parts purchased. It implements the
 * Payme interface by using the getPaymentAmount() method.
 */
public class Invoice implements Payme {

/**
 * Part number
 */
private String partNumber; 

/**
 * description of the part
 */
private String partDescription;

/**
 * quantity of the part to be purchased
 */
private int quantity;

/**
 * price per unit
 */
private double pricePerItem;

/**
 * constructor for the invoice class to construct invoice object
 * 
 * @param part the part number for the item
 * @param description the description of the item
 * @param count the quantity of the item
 * @param price the price of the item
 */
public Invoice(String part, String description, int count, 
 double price) {
 partNumber = part;
 partDescription = description;
 setQuantity(count); // validate and store quantity
 setPricePerItem(price); // validate and store price per item
}

/**
 * Sets part number
 * @param part the part number
 */
public void setPartNumber(String part) {
 partNumber = part; // should validate
}

/**
 * get part number
 * @return partNumber the part number
 */
public String getPartNumber() {
 return partNumber;
}

/**
 * set description
 * @param description the description of the part
 */
public void setPartDescription(String description) {
 partDescription = description; // should validate
}

/**
 * get description
 * @return description the description of the part
 */
public String getPartDescription() {
 return partDescription;
}

/**
 * set quantity
 * @param count the quantity
 */
public void setQuantity(int count) {
 quantity = (count < 0) ? 0 : count; // quantity cannot be negative
}

/**
 * get quantity
 * @return quantity
 */
public int getQuantity() {
 return quantity;
}

/**
 * set price per item
 * @param price sets the price per item
 */
public void setPricePerItem(double price) {
 pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
}

/**
 * get price per item
 * @return price
 */
public double getPricePerItem() {
 return pricePerItem;
}

/**
 * Method to return all of the invoice information in specific order and format
 * @return formatted string to display invoice information in an organized format
 */
@Override
public String toString() {
 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
    "invoice", "part number", getPartNumber(), getPartDescription(), 
    "quantity", getQuantity(), "price per item", getPricePerItem());
} 

/**
 * This method is carried out from the Payme interface and calculates the total amount
 * due for the invoice based on quantity multiplied by price per unit
 * @return The total amount of the invoice
 */
@Override
public double getPaymentAmount() {
 return getQuantity() * getPricePerItem(); // calculate total cost
}
}


