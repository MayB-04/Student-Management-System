
package ui;

import java.util.Scanner;
import model.Student;
import service.StudentService;

public class StudentUI {

    private final StudentService service = new StudentService();
    private final Scanner scanner = new Scanner(System.in);

    public void start() {

        while (true) {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. List Students");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> removeStudent();
                case 3 -> searchStudent();
                case 4 -> listStudents();
                case 5 -> System.exit(0);
            }
        }
    }

    private void addStudent() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        service.addStudent(id, name, age);
    }

    private void removeStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        service.removeStudent(id);
    }

    private void searchStudent() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();

        Student student = service.searchStudent(id);

        if (student != null)
            System.out.println(student);
        else
            System.out.println("Student not found");
    }

    private void listStudents() {
        for (Student student : service.listStudents()) {
            System.out.println(student);
        }
    }
}
