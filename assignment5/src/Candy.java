public class Candy extends DessertItem{
/**
 * The Candy class should be derived from the DessertItem class.
 * A Candy item has a weight and a price per pound which are used to determine its cost.
 * For example, 2.30 lbs.of fudge @ .89 /lb. = 205 cents. The cost should be rounded to the nearest cent.
 */

    private double weight;
    private int pricePerPound;

    public Candy(String name, double weight, int pricePerPound){
        this.name = name;
        this.weight = weight;
        this.pricePerPound = pricePerPound;
    }

    @Override
    public int getCost() {
        return (int)(weight*pricePerPound);
    }

    public double getWeight() {
        return weight;
    }

    public int getPricePerPound() {
        return pricePerPound;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(weight);
        sb.append(" lbs. @ ");
        sb.append(DessertShoppe.cents2dollarsAndCents(pricePerPound));
        sb.append(" /lb.\n");
        sb.append(super.getName());
        sb.append("  ");
        sb.append(DessertShoppe.cents2dollarsAndCents(getCost()));
        return sb.toString();
    }
}
