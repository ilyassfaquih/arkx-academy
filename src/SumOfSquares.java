public class SumOfSquares {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        while (i <= 5) {
            sum += i * i;
            i++;
        }

        System.out.println("The sum of squares from 1 to 5 is: " + sum);
    }
}

