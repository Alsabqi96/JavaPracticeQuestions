import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        // Loop to print the multiplication table from 1 to 10
        System.out.println("Multiplication Table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        // Close the scanner
        scanner.close();
    }
}



