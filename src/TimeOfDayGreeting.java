import java.util.Scanner;

public class TimeOfDayGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the current hour (0 - 23): ");
        int hour = scanner.nextInt();

        if (hour >= 5 && hour <= 11) {
            System.out.println("Good morning.");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("Good afternoon.");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Good evening.");
        } else if (hour >= 0 && hour < 5) {
            System.out.println("Good night.");
        } else {
            System.out.println("Invalid input! Please enter an hour between 0 and 23.");
        }
    }
}
