import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Do you have a student ID? (true/false): ");
        boolean hasStudentID = scanner.nextBoolean();

        double price;
        if (age <= 12) {
            price = 5.0;
        } else if (age <= 17) {
            price = 8.0;
        } else if (hasStudentID) {
            price = 10.0;
        } else {
            price = 15.0;
        }

        System.out.println("Your ticket price is: $" + price);
        scanner.close();
    }
}
