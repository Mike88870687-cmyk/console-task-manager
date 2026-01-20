import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tasks = new String[100];
        int taskCount = 0;
        while (true) {
            System.out.println("===TASK MANAGER===");
            System.out.println("1 - Add task");
            System.out.println("2 - Show task");
            System.out.println("3 - Delete task");
            System.out.println("0 - Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Please add a task");
                    String taskText = scanner.nextLine();
                    tasks[taskCount] = taskText;
                    taskCount++;
                    System.out.println("Task added");
                    break;
                case 2:
                    System.out.println("Show task");
                    break;
                case 3:
                    System.out.println("Delete task");
                    break;
                case 0:
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }
}