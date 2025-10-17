import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager.");
        } else if (age >= 20) {
            System.out.println("Adult.");
        } else {
            System.out.println("Invalid input.");
        }

        scanner.close();
    }
}
