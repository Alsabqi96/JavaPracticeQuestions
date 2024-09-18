import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a string
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();

        // Initialize a variable to store the number of vowels
        int vowelCount = 0;

        // Convert the string to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Loop through the string to count vowels
        for (int i = 0; i<input.length(); i++){
            char ch = input.charAt(i);

            // Use a switch statement to check if the character is a vowel
            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowelCount++;
                    break;


            }
        }

        // Output the number of vowels
        System.out.println("The number of of vowels in the string is: " + vowelCount );


        // Close the scanner
        scanner.close();
    }
}

