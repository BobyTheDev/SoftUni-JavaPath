import java.io.Console;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // Write a program, which reads an angle in radians (decimal number) and converts
        // it into degrees, using the formula: angle = radian * 180 / Pi. The number
        // Pi can be used with Math.Pi
        Scanner scanner = new Scanner(System.in);
        double angle_radian = Double.parseDouble(scanner.nextLine());
        double formula = angle_radian * 180 / Math.PI;
        double degrees = formula;
        System.out.printf(String.valueOf(degrees));

    }
}
