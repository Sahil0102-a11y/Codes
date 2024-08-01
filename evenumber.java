package labsix;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class evenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        //user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();       
        // Validate input
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            scanner.close();
            return;
        }        
        int[] numbers = new int[n];        
        //user to enter numbers
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }       
        List<Integer> evenNumbers = new ArrayList<>();
        int sum = 0;       
        // Find even numbers and calculate their sum
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
                sum += number;
            }
        }       
       // Output results
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Sum of even numbers: " + sum);       
        // Close the scanner
        scanner.close();
    }
}