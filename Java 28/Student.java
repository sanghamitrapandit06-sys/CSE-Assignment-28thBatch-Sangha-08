public class Student {

    String name; // Student name
    int age; // Student age
    String department; // Student department

    void display() { // Display student information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student(); // First object
        s1.name = "Rahim";
        s1.age = 20;
        s1.department = "CSE";

        Student s2 = new Student(); // Second object
        s2.name = "Karim";
        s2.age = 21;
        s2.department = "EEE";

        Student s3 = new Student(); // Third object
        s3.name = "Mitra";
        s3.age = 19;
        s3.department = "CSE";

        s1.display();
        s2.display();
        s3.display();
    }
}
