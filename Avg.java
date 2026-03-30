import java.util.*;

class NegativeException extends Exception {
    NegativeException(String msg) {
        super(msg);
    }
}

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program started");
        System.out.print("Enter n (number of positive integers): ");
        int n = sc.nextInt();
        System.out.println("You entered n = " + n);

        int sum = 0, count = 0;

        while (count < n) {
            System.out.print("Enter number " + (count + 1) + ": ");
            int num = sc.nextInt();
            System.out.println("Read number = " + num);

            try {
                if (num < 0) {
                    throw new NegativeException("Negative not allowed");
                }
                sum += num;
                count++;
                System.out.println("Accepted number. Current sum = " + sum + ", count = " + count);
            } catch (NegativeException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }

        double average = sum / (double)n;
        System.out.println("All numbers entered. Final sum = " + sum);
        System.out.println("Average = " + average);
    }
}