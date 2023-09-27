import java.io.Console;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Write a program which calculates what sum u will get at the end of the deposit
        // Period at specific interest rate. Use this formula:
        // sum = deposited sum + term * ((deposit sum * yearly interest rate) / 12)
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        int termMonths = Integer.parseInt(scanner.nextLine());
        double yearlyInterestRate = Double.parseDouble(scanner.nextLine());
        // Calculate the term Money
        double earnedMoney = depositSum * (yearlyInterestRate / 100);
        double monthlyRate = earnedMoney / 12;
        double totalEarnedMoney = depositSum + termMonths * monthlyRate;
        System.out.printf(String.valueOf(totalEarnedMoney));
    }
}
