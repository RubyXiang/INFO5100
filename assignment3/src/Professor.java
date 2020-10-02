public class Professor {
/*
Try to refractor the Professor class using builder pattern.
Each Professor has firstName, lastName and an id variable;
For this question please implement the builder class as the inner class.
Try to create a Professor instance using builder in class Test’s main method.
Example are provided in the folder name Employee.java
 */

    //required parameters
    private String firstName;
    private String lastName;
    private int id;

    public static class Builder {
        //required parameters
        private String firstName;
        private String lastName;
        private int id;

        public Builder(String firstName, String lastName, int id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = id;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Professor build() {
            // call the private constructor in the outer class
            return new Professor(firstName, lastName, id);
        }
    }

    public Professor(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getId() {
        return id;
    }
}

