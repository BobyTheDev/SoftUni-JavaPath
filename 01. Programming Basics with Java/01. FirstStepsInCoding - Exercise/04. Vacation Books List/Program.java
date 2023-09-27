import java.io.Console;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        // For the summer vacation there is a list with mandatory literature for Joro.
        // and he has x ammount of books. Because Joro prefers to go outside and play with friends
        // my job is to help him and calculate how many hours a day he has to read, so he can read
        // the whole literature list.
        // Input: 1. total pages 2. Pages he can read for 1h 3. Total days he should read the book.
        // Output: Output the needed hours he has to read everyday
        Scanner scanner = new Scanner(System.in);
        int totalPages = Integer.parseInt(scanner.nextLine());
        int pagesFor1H = Integer.parseInt(scanner.nextLine());
        int totalDays = Integer.parseInt(scanner.nextLine());
        int totalTimeReading = totalPages / pagesFor1H;
        int timeNeededToRead = totalTimeReading / totalDays;
        System.out.println(timeNeededToRead);
    }
}
