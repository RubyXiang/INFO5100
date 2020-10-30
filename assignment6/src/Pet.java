public class Pet {
    private String name;
    private String ownerName;
    private String color;
    protected int sex;
    public static final int MALE = 1;
    public static final int FEMALE = 2;
    public static final int SPAYED = 3;
    public static final int NEUTERED = 4;

    public String getColor() {
        return color;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        if(Pet.MALE == sex){
            return "Male";
        }else if(Pet.FEMALE == sex){
            return "Female";
        }else if(Pet.SPAYED == sex){
            return "Spayed";
        }else{
            return "Neutered";
        }
    }

    public void setSex(int sexid) {
        this.sex = sexid;
    }

    public Pet(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    @Override
    public String toString() {
        return getName() + " owned by " + getOwnerName() + "\n" +
                "Color: " + getColor() + "\n" +
                "Sex: " + getSex() + "\n";
    }

    public static void main(String args[]){
        Pet pet = new Pet("Spot","Mary","Black and White");
        pet.setSex(1);
        System.out.println(pet);
    }

}
