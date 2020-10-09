public class Cylinder extends Circle{
    private double height;
    private double volume;

    public Cylinder(){
        super();
        height = 1.0;
    }

    public Cylinder(double height){
        this.height = height;
    }

    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        volume = super.getArea() * this.getHeight();
        return volume;
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * this.getRadius() * (this.getRadius() + this.getHeight());
    }
}
