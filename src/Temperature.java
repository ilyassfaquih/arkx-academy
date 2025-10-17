import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("temperature in Celsius°: ");
        int C = scanner.nextInt();
        int F = (C * 9/5) + 32 ;
        System.out.print("temperature in Fahrenheit: " +F);


    }
}
