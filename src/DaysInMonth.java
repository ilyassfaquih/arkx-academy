import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number (1 - 12): ");
        int month = scanner.nextInt();

        int days;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                System.out.println("This month has " + days + " days.");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                System.out.println("This month has " + days + " days.");
                break;
            case 2:
                System.out.println("February has 28 or 29 days (depending on leap year).");
                break;
            default:
                System.out.println("Invalid input! Please enter a number between 1 and 12.");
        }
    }
}
