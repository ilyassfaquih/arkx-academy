import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number between 1 and 7: ");
        int n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.print("monday");
                    break;
                case 2:
                    System.out.print("tuesday");
                    break;
                case 3:
                    System.out.print("wednesday");
                    break;
                case 4:
                    System.out.print("thursday");
                    break;
                case 5:
                    System.out.print("friday");
                    break;
                case 6:
                    System.out.print("saturday");
                    break;
                case 7:
                    System.out.print("sunday");
                    break;
                default:
                    System.out.print("invalid number ");
            }
    }
}
