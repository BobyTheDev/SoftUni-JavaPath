import java.io.Console;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int area = num * num2;
        System.out.println(area);
    }
}
