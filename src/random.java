import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int secret = 1;
        int guess;

        System.out.println("Guess the number between 1 and 10!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < secret) {
                System.out.println("Higher ");
            } else if (guess > secret) {
                System.out.println("Lower ");
            } else {
                System.out.println(" Correct! The number was " + secret + ".");
            }
        } while (guess != secret);


    }
}
