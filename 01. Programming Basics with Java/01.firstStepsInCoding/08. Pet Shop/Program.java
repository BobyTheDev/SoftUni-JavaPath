import java.io.Console;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Write a program that will calculate expenses for food for cats and dogs. The food is
        // bought at pet shop, while 1 packed food for dog costs 2.50, but for cats costs 4
        // Login: Read 2 lines: Number of food for dogs and number of food for cats
        // Exit: (expense) lv.
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.nextLine());
        double dogFoodPrice = 2.50;
        int catFoodPrice = 4;
        double neededMoney = dogFood * dogFoodPrice + catFood * catFoodPrice;
        System.out.printf("%.1f lv.", neededMoney);

    }
}
