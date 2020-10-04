import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int numberOfStudent = 0;
    List<Student> students = new ArrayList<>();

    public Course(String name){
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    //public void setStudents(List<Student> students) {
    //    this.students = students;
    //}

    public boolean isFull(int numberOfStudent) {
        if(numberOfStudent >= 10)
            return true;
        else
            return false;
    }

    public int getNumberOfStudent() {
        return numberOfStudent;
    }

    //public void setNumberOfStudent(int numberOfStudent) {
    //    this.numberOfStudent = numberOfStudent;
    //}

    public String getName() {
        return name;
    }

    public void registerStudent(Student student) {
        if(numberOfStudent < 10){
            students.add(student);
            numberOfStudent++;
            System.out.println("Successful!!!");
        }else{
            System.out.println("Fail!!!");
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", numberOfStudent=" + numberOfStudent +
                '}';
    }

}
