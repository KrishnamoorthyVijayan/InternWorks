import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    private static ArrayList<String> toDoList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("----- To-Do List Application -----");
            System.out.println("1. Add a task");
            System.out.println("2. Delete a task");
            System.out.println("3. Display tasks");
            System.out.println("4. Mark a task as complete");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    deleteTask();
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    markAsComplete();
                    break;
                case 5:
                    System.out.println("Exiting the application. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);
    }

    private static void addTask() {
        System.out.print("Enter the task: ");
        scanner.nextLine(); // Consume the newline character
        String task = scanner.nextLine();
        toDoList.add(task);
        System.out.println("Task added successfully!");
    }

    private static void deleteTask() {
        displayTasks();
        System.out.print("Enter the task number to delete: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber >= 1 && taskNumber <= toDoList.size()) {
            toDoList.remove(taskNumber - 1);
            System.out.println("Task deleted successfully!");
        } else {
            System.out.println("Invalid task number. Please enter a valid task number.");
        }
    }

    private static void displayTasks() {
        System.out.println("----- To-Do List -----");
        if (toDoList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }

    private static void markAsComplete() {
        displayTasks();
        System.out.print("Enter the task number to mark as complete: ");
        int taskNumber = scanner.nextInt();
        if (taskNumber >= 1 && taskNumber <= toDoList.size()) {
            System.out.println("Task '" + toDoList.get(taskNumber - 1) + "' marked as complete!");
            // You can add additional logic here to handle completed tasks if needed.
        } else {
            System.out.println("Invalid task number. Please enter a valid task number.");
        }
    }
}
