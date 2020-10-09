public class TestCylinder {
    public static void main (String args[]){
        Circle circle=new Circle(2.0,"yellow");
        System.out.println("Radius is " + circle.getRadius() + "; Color is " + circle.getColor() + "; Base area is " + circle.getArea());

        Cylinder cylinder=new Cylinder();
        System.out.println("Radius is " + cylinder.getRadius() + "; Height is " + cylinder.getHeight() + "; Color is " +
                cylinder.getColor() + "; Base area is " + cylinder.getArea() + "; Volume is "+ cylinder.getVolume());

        Cylinder cylinder2=new Cylinder(5.0,2.0);
        System.out.println("Radius is " + cylinder.getRadius() + "; Height is " + cylinder.getHeight() + "; Color is " +
                cylinder.getColor() + "; Base area is " + cylinder.getArea() + "; Volume is "+ cylinder.getVolume());

    }
}
