import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer number = scanner.nextInt();
        if  (number >= 0) {
           System.out.print("the number is positive ");
        }
        else {
            System.out.print("the number is negative ");
        }
    }
}
