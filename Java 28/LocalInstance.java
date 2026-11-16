public class LocalInstance {

    int age = 20; // Instance variable

    void display() {

        String name = "Mitra"; // Local variable

        System.out.println("Name: " + name); // Access local variable
        System.out.println("Age: " + age); // Access instance variable
    }

    public static void main(String[] args) {

        LocalInstance obj = new LocalInstance(); // Create object

        obj.display(); // Call method
    }
}
