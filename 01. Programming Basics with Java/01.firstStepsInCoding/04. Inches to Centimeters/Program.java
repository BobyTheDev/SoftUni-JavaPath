import java.io.Console;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.println(num1 * 2.54);
    }
}
