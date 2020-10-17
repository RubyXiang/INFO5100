public class IceCream extends DessertItem{
    /**
     * The IceCream class should be derived from the DessertItem class.
     *
     * An IceCream item simply has a cost.
     */

    private int price;

    public IceCream(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int getCost() {
        return price;
    }

    @Override
    public String toString() {
        return (super.getName() + "  " + DessertShoppe.cents2dollarsAndCents(getCost()));
    }
}
