public class Sundae extends IceCream{
    /**
     * The Sundae class should be derived from the IceCream class.
     * The cost of a Sundae is the cost of the IceCream plus the cost of the topping.
     */
    private String toppingName;
    private int toppingPrice;

    public Sundae(String name, int price, String toppingName, int toppingPrice){
        super(name, price);
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    @Override
    public int getCost() {
        return super.getCost() + this.getToppingPrice();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    public int getToppingPrice() {
        return toppingPrice;
    }

    public String getToppingName() {
        return toppingName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(toppingName + "Sundae with\n");
        sb.append(super.getName());
        sb.append("  ");
        sb.append(DessertShoppe.cents2dollarsAndCents(getCost()));
        return sb.toString();
    }
}
