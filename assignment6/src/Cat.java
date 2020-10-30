public class Cat extends Pet implements Boardable{
    private String hairLength;
    private int startMonth;
    private int startDay;
    private int startYear;
    private int endMonth;
    private int endDay;
    private int endYear;

    public Cat(String name, String ownerName, String color, String hairLength){
        super(name,ownerName,color);
        this.hairLength = hairLength;
    }

    public String getHairLength() {
        return hairLength;
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
        return "CAT:" + "\n" +
                getName() + " owned by " + getOwnerName() + "\n" +
                "Color: " + getColor() + "\n" +
                "Sex: " + getSex() + "\n" +
                "Hair: " + hairLength;
    }

    public static void main(String args[]){
        Cat cat = new Cat("Tom","Bob","Black","Short");
        cat.setSex(3);
        System.out.println(cat);

        cat.setBoardStart(5,1,2016);
        cat.setBoardEnd(9,28,2034);

        System.out.println(cat.boarding(5,1,2016));
    }

}
