import java.io.Console;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Get data from user: Name of the architect
        // Get data from user: Number of the total project which need to be done - Integer (0...100)
        // Exit: The Console needs to print out: "The architect (name) will need (time) hours to complete
        // (number of projects) project/s."
        // 1 project takes 3 hours
        Scanner scanner = new Scanner(System.in);
        String architectName = scanner.nextLine();
        int totalProjects = Integer.parseInt(scanner.nextLine());
        int timeForProjects = totalProjects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", architectName, timeForProjects, totalProjects);
    }
}
