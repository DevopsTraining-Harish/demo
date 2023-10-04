import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String place;

    // Constructors, getters, and setters for the above fields
}

class StudentDatabase {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        // Add the student to the database
    }

    public Student searchStudentById(int id) {
        // Search for a student by ID and return the student object
        return null; // Return null if not found
    }

    public ArrayList<Student> filterStudentsByKeyword(String keyword) {
        // Filter students by keyword in first name or last name and return a list
        return new ArrayList<>(); // Return an empty list if none found
    }

    public void modifyStudent(int id, Student updatedStudent) {
        // Modify student details by ID
    }

    public void deleteStudent(int id) {
        // Delete a student by ID
    }

    // Other necessary methods
}

public class Main {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student by ID");
            System.out.println("3. Filter Students by Keyword");
            System.out.println("4. Modify Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Implement adding a new student
                    break;
                case 2:
                    // Implement searching a student by ID
                    break;
                case 3:
                    // Implement filtering students by keyword
                    break;
                case 4:
                    // Implement modifying a student's details
                    break;
                case 5:
                    // Implement deleting a student
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
