import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        // Initialize variables for the factorial calculation
        int factorial = 1;
        int i = number;

        // Calculate the factorial using a while loop
        while (i > 0) {
            factorial *= i;
            i--;
        }

        // Output the result
        System.out.println("The factorial of " + number + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }
}
//System.out.printLn("")

