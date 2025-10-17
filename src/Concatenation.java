import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter a last name: ");
        String lastName = scanner.nextLine();
        System.out.print("your full name: " + firstName + " " + lastName);
    }
}
