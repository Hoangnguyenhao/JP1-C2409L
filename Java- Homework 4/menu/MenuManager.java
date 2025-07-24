package menu;

import student.StudentService;
import java.util.Scanner;

public class MenuManager {
    private final StudentService studentService;
    private final Scanner scanner = new Scanner(System.in);

    public MenuManager(StudentService studentService) {
        this.studentService = studentService;
    }

    public void start() {
        int choice;
        do {
            showMenu();
            choice = getUserChoice();
            handleChoice(choice);
        } while (choice != 5);
    }

    private void showMenu() {
        System.out.println("\n=== STUDENT MANAGEMENT MENU ===");
        System.out.println("1. Add Student");
        System.out.println("2. Edit Student");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
        System.out.print("Select option (1-5): ");
    }

    private int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number (1-5): ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private void handleChoice(int choice) {
        switch (choice) {
            case 1 -> studentService.addStudent();
            case 2 -> studentService.editStudent();
            case 3 -> studentService.updateStudent();
            case 4 -> studentService.deleteStudent();
            case 5 -> System.out.println("Exiting program.");
            default -> System.out.println("Invalid choice.");
        }
    }
}
