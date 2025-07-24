import menu.MenuManager;
import student.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        MenuManager menu = new MenuManager(studentService);
        menu.start();
    }
}
