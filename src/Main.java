import javax.sound.sampled.Line;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tasks = new String[100];
        int taskCount = 0;
        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                   taskCount = addTask(scanner, tasks, taskCount);
                    break;
                case 2:
                   showTasks(tasks, taskCount);
                    break;
                case 3:
                    taskCount = deleteTask(scanner, tasks, taskCount);
                    break;
                case 0:
                    System.out.println("Bye");
                    return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    static void printMenu(){
        System.out.println("===TASK MANAGER===");
        System.out.println("1 - Add task");
        System.out.println("2 - Show task");
        System.out.println("3 - Delete task");
        System.out.println("0 - Exit");
    }

    static int addTask(Scanner scanner, String[] tasks, int taskCount){
        System.out.println("Please add a task");
        String taskText = scanner.nextLine();
        tasks[taskCount] = taskText;
        taskCount++;
        System.out.println("Task added");
        return taskCount;
    }

    static void showTasks(String[] tasks, int taskCount){
        if(taskCount == 0) {
            System.out.println("No task");
        }else{
            for(int i = 0; i < taskCount; i++){
                System.out.println((i+1) + ". " + tasks[i]);
            }
        }
    }

    static int deleteTask(Scanner scanner, String[] tasks, int taskCount){
        if(taskCount == 0) {
            System.out.println("No task to delete");
        }
        for(int i = 0; i < taskCount; i++){
            System.out.println((i+1) + ". " + tasks[i]);
        }

        System.out.println("Enter task number to delete");
        int number = scanner.nextInt();
        scanner.nextLine();

        int index = number-1;

        if(index<0||index>=taskCount){
            System.out.println("Invalid task number");
        }
        for(int i = index; i<taskCount -1; i++){
            tasks[i] = tasks[i+1];
        }

        tasks[taskCount -1] = null;
        taskCount --;

        System.out.println("Task deleted");
        return taskCount;
    }
}