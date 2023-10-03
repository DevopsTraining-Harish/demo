import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase();
        Menu menu = new Menu(database);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            menu.displayMenu();
            System.out.print("Enter an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    menu.addStudent();
                    break;
                case 2:
                    menu.searchStudent();
                    break;
                case 3:
                    menu.filterStudents();
                    break;
                case 4:
                    menu.modifyStudent();
                    break;
                case 5:
                    menu.deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 6);

        scanner.close();
    }
}
