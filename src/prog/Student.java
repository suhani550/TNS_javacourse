package prog;

public class Student {
    // Private fields - encapsulation
    private String name;
    private int age;

    // Default constructor
    public Student() {
        this.name = "Not specified";
        this.age = 0;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) {  // Simple validation
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Display method
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Using default constructor
        Student s1 = new Student();
        s1.displayInfo();

        // Using parameterized constructor
        Student s2 = new Student("John", 20);
        s2.displayInfo();

        // Updating fields using setters
        s2.setName("Emma");
        s2.setAge(22);
        System.out.println("\nAfter updating using setters:");
        s2.displayInfo();
    }
}



