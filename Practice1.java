import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the range
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int sum = 0;

        // Loop through the range and calculate the sum of even numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        // Output the result
        System.out.println("The sum of all even numbers between " + start + " and " + end + " is: " + sum);
    }
}
