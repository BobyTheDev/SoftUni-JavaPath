import java.io.Console;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Write a program which calculates the needed sum for Bojidara to pay the company
        // Price for a square meter is 7.61lv, since her yard is huge the company is offering
        // 18% off the final price.
        // Input: Square meters of the yard - double (0.00 .. 10000.000)
        // Output: "The final price is: (final_price) lv."
        // "The discount is: (discounted_price) lv."
        Scanner scanner = new Scanner(System.in);
        double yardSize = Double.parseDouble(scanner.nextLine());
        double squareMeterPrice = 7.61;
        double finalPrice = yardSize * squareMeterPrice;
        double discount = 0.18 * finalPrice;
        double discountedPrice = finalPrice - discount;
        System.out.printf("The final price is: %.2f lv.", discountedPrice);
        System.out.printf("The discount is: %.2f lv.", discount);
        // SORRY I REALLY COMPLICATED STUFF ITS WORKING SOMEHOW.
    }
}
