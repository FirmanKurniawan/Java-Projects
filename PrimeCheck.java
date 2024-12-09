import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int count = 0;

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    count++;
                    break; // No need to check further if a divisor is found
                }
            }
            if (count == 0) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
        scanner.close();
    }
}
