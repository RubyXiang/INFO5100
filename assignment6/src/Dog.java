public class Dog extends Pet implements Boardable{
    private String size;
    private int startMonth;
    private int startDay;
    private int startYear;
    private int endMonth;
    private int endDay;
    private int endYear;

    public Dog(String name, String ownerName, String color, String size){
        super(name,ownerName,color);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setBoardStart(int month, int day, int year){
        this.startMonth = month;
        this.startDay = day;
        this.startYear = year;
    }

    public void setBoardEnd(int month, int day, int year){
        this.endMonth = month;
        this.endDay = day;
        this.endYear = year;
    }

    public boolean boarding(int month, int day, int year){
        if(startYear < year && endYear > year) {
            return true;
        }else if(startYear == year || endYear == year){
            if(startMonth < month && endMonth > month){
                return true;
            }else if(startMonth == month || endMonth == month){
                if(startDay <= day && endDay >= day) {
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Dog:" + "\n" +
                getName() + " owned by " + getOwnerName() + "\n" +
                "Color: " + getColor() + "\n" +
                "Sex: " + getSex() + "\n" +
                "Size: " + size;
    }

    public static void main(String args[]){
        Dog dog = new Dog("Spot","Susan","white","medium");
        dog.setSex(3);
        System.out.println(dog);

        dog.setBoardStart(5,1,2016);
        dog.setBoardEnd(9,28,2034);

        System.out.println(dog.boarding(10,31,2020));
    }
}
