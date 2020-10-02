public class Test {
    public static void main(String args[]){
        Course course = new Course("info5100");
        course.isFull(course.getNumberOfStudent());
        Student student1 = new Student("Ruby",10001);
        course.registerStudent(student1);

        Student student2 = new Student("Lucy",10002);
        course.registerStudent(student2);

        Student student3 = new Student("Lily",10003);
        course.registerStudent(student3);

        Student student4 = new Student("Luc",10004);
        course.registerStudent(student4);

        Student student5 = new Student("Ann",10005);
        course.registerStudent(student5);

        Student student6 = new Student("Lee",10006);
        course.registerStudent(student6);

        Student student7 = new Student("Coco",10007);
        course.registerStudent(student7);

        Student student8 = new Student("Mary",10008);
        course.registerStudent(student8);

        Student student9 = new Student("Joyce",10009);
        course.registerStudent(student9);

        Student student10 = new Student("Hordor",100010);
        course.registerStudent(student10);

        Student student11 = new Student("Jayden",100011);
        course.registerStudent(student11);

        Professor employee = new Professor.Builder("Chloe", "Lee",10058)
                .build();

    }
}
