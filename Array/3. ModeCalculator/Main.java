import java.util.Scanner;

public class Main {

    public static int[] calculateMode(int[] numbers) {
        // Find the maximum number to determine the size of the frequency array
        int maxNumber = 0;
        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        // Create and populate the frequency array
        int[] frequency = new int[maxNumber + 1];
        for (int number : numbers) {
            frequency[number]++;
        }

        // Find the maximum frequency
        int maxFrequency = 0;
        for (int count : frequency) {
            if (count > maxFrequency) {
                maxFrequency = count;
            }
        }

        // Count the number of modes
        int modeCount = 0;
        for (int count : frequency) {
            if (count == maxFrequency) {
                modeCount++;
            }
        }

        // Collect all numbers with the maximum frequency
        int[] modes = new int[modeCount];
        int index = 0;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] == maxFrequency) {
                modes[index++] = i;
            }
        }

        return modes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to hold the user's numbers
        int[] numbers = new int[n];

        // Prompt the user to enter each number
        System.out.println("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the mode(s)
        int[] modes = calculateMode(numbers);

        // Print the results
        if (modes.length == 1) {
            System.out.println("The mode is: " + modes[0]);
        } else {
            System.out.print("The modes are: ");
            for (int mode : modes) {
                System.out.print(mode + " ");
            }
        }
        
        scanner.close();
    }
}
