package prog;

public class Constructor {
		    String name;
		    int age;

		    // Default constructor
		    public  Constructor() {
		        name = "Unknown";
		        age = 0;
		    }

		    // Parameterized constructor
		    public  Constructor(String personName, int personAge) {
		        name = personName;
		        age = personAge;
		    }

		    // Method to display info
		    public void displayInfo() {
		        System.out.println("Name: " + name + ", Age: " + age);
		    }

		    // Main method to test constructors
		    public static void main(String[] args) {
		        // Using default constructor
		    	 Constructor p1 = new  Constructor();
		        p1.displayInfo();  // Output: Name: Unknown, Age: 0

		        // Using parameterized constructor
		        Constructor p2 = new  Constructor("Alice", 25);
		        p2.displayInfo();  // Output: Name: Alice, Age: 25
		    }



	}
