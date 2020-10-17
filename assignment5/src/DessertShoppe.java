public class DessertShoppe {
    /**
     * The DessertShoppe class contains constants such as the tax rate as well the name of the store,
     * the maximum size of an item name and the width used to display the costs of the items on the receipt.
     * Your code should use these constants wherever necessary!
     *
     * The DessertShoppe class also contains the cents2dollarsAndCents() method which takes an integer number of cents
     * and returns it as a String formatted in dollars and cents.
     * For example, 105 cents would be returned as "1.05"
     */

    public static final double taxRate = 0.05;
    public static final String storeName = "Delicious Dessert";
    public static final int maximumSize = 20;
    public static final int width = 10;
    
    public static String cents2dollarsAndCents(Integer cents){
        String dollarsAndCents= Double.toString((double)cents/100);
        return dollarsAndCents;
    }

}
