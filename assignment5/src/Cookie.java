public class Cookie extends DessertItem{
    /**
     * The Cookie class should be derived from the DessertItem class.
     *
     * A Cookie item has a number and a price per dozen which are used to determine its cost.
     * For example, 4 cookies @ 399 cents /dz. = 133 cents.
     * The cost should be rounded to the nearest cent.
     */
    private int number;
    private int pricePerDozen;

    public Cookie(String name, int number, int pricePerDozen){
        this.name = name;
        this.number = number;
        this.pricePerDozen = pricePerDozen;
    }

    @Override
    public int getCost() {
        return (number*pricePerDozen)/12;
    }

    public int getNumber() {
        return number;
    }

    public int getPricePerDozen() {
        return pricePerDozen;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(number);
        sb.append(" @ ");
        sb.append(DessertShoppe.cents2dollarsAndCents(pricePerDozen));
        sb.append("  /dz.\n");
        sb.append(super.getName());
        sb.append("  ");
        sb.append(DessertShoppe.cents2dollarsAndCents(getCost()));
        return sb.toString();
    }
}
