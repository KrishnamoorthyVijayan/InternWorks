import java.util.Scanner;

public class StudentGradeSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        String[] studentNames = new String[100];
        int[] studentMarks = new int[100];
        int studentCount = 0;

        // Main Menu
        int choice;
        do {
            System.out.println("\nStudent Grade System Menu:");
            System.out.println("1. Add new student and mark");
            System.out.println("2. View students and marks");
            System.out.println("3. Calculate average grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addNewStudent(scanner, studentNames, studentMarks, studentCount);
                    studentCount++;
                    break;
                case 2:
                    viewStudentsAndMarks(studentNames, studentMarks, studentCount);
                    break;
                case 3:
                    calculateAverageGrade(studentMarks, studentCount);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    // Add new student and mark method
    private static void addNewStudent(Scanner scanner, String[] studentNames, int[] studentMarks, int index) {
        System.out.print("Enter student name: ");
        scanner.nextLine(); // Consume newline left by previous nextInt()
        studentNames[index] = scanner.nextLine();
        System.out.print("Enter student mark: ");
        studentMarks[index] = scanner.nextInt();
        System.out.println("Student added successfully!");
    }

    // View students and marks method
    private static void viewStudentsAndMarks(String[] studentNames, int[] studentMarks, int count) {
        System.out.println("\nList of Students and Marks:");
        for (int i = 0; i < count; i++) {
            System.out.println(studentNames[i] + ": " + studentMarks[i]);
        }
    }

    // Calculate average grade method
    private static void calculateAverageGrade(int[] studentMarks, int count) {
        if (count == 0) {
            System.out.println("No students to calculate average grade.");
            return;
        }

        int totalMarks = 0;
        for (int i = 0; i < count; i++) {
            totalMarks += studentMarks[i];
        }

        double averageGrade = (double) totalMarks / count;
        System.out.println("Average Grade: " + averageGrade);
    }
}
