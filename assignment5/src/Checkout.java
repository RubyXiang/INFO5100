import java.util.ArrayList;
import java.util.List;

public class Checkout {
    /**
     * The Checkout class, provides methods to enter dessert items into the cash register,
     * clear the cash register, get the number of items, get the total cost of the items (before tax),
     * get the total tax for the items, and get a String representing a receipt for the dessert items.
     *
     * The Checkout class must use a Vector to store the DessertItem's.
     * The total tax should be rounded to the nearest cent.
     * The complete specifications for the Checkout class are provided in the file Class-Checkout.
     */
    List<DessertItem> dessertItems;
    private int totalCost = 0;

    public Checkout(){
        dessertItems = new ArrayList<>();
    }

    public int numberOfItems(){
        return dessertItems.size();
    }

    public void enterItem(DessertItem item){
        dessertItems.add(item);
    }

    public void clear(){
        dessertItems.removeAll(dessertItems);
    }

    public int totalCost(){
        for(DessertItem item : dessertItems){
            totalCost = totalCost + item.getCost();
        }
        return totalCost;
    }

    public int totalTax(){
        return (int)(totalCost * DessertShoppe.taxRate);
    }

    @Override
    public String toString() {
        int totalLength = DessertShoppe.maximumSize + DessertShoppe.width;
        int storeNameLength = DessertShoppe.storeName.length();
        StringBuilder sb = new StringBuilder();
        int leftWidth = (totalLength - storeNameLength) / 2;
        for (int i = 0; i < leftWidth; i++) {
            sb.append(" ");
        }
        sb.append(DessertShoppe.storeName + "\n");
        for (int i = 0; i < leftWidth; i++) {
            sb.append(" ");
        }
        for (int i = 0; i < storeNameLength; i++) {
            sb.append("-");
        }
        sb.append("\n");
        // each item
        for (DessertItem d: dessertItems) {
            sb.append(d);
            sb.append("\n");
        }
        sb.append("\n");

        sb.append("Tax: " + DessertShoppe.cents2dollarsAndCents(totalTax()));

        sb.append("\n");

        sb.append("Total: " + DessertShoppe.cents2dollarsAndCents(totalTax() + totalCost()));

        return sb.toString();
    }
}
