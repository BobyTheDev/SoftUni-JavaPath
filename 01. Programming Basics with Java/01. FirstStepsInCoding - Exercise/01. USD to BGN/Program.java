import java.io.Console;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Write a program for converting from USD to BGN, using fixed currency course
        // BGN and USD: 1 USD = 1.79549
        Scanner scanner = new Scanner(System.in);
        double USDCurrency = 1.79549;
        double inputCurrency = Double.parseDouble(scanner.nextLine());
        double BGN = USDCurrency * inputCurrency;
        System.out.printf(String.valueOf(BGN));
    }
}
