import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        Integer n = sc.nextInt();
        long factorial = 1;
        if (n > 0) {
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            System.out.println(factorial);
        }
        }
        else {
            System.out.print("invalid number ");
        }
    }
}
