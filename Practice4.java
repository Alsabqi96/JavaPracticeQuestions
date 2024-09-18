import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to enter
        System.out.print("Enter the number of elements you want in the array: ");
        int n = scanner.nextInt();

        // Create an array of size 'n'
        int[] numbers = new int[n];

        // Get the numbers from the user
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Find the maximum value
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }

        // Print the maximum value
        System.out.println("The maximum value in the array is: " + max);
    }
}


