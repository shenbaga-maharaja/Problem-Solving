import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Defining the sequence
        int[] sequence = {1, 2, 3, 4, 5};

        // Outputting the sequence
        System.out.print("The sequence is : ");
        for (int num : sequence) {
            System.out.print(num + " ");
        }
        System.out.println(); // Adding a new line for clarity

        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the input: ");
        int input = scanner.nextInt();

        // Finding the index of the input in the sequence
        int index = -1;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] == input) {
                index = i;
                break;
            }
        }

        // Outputting the sequence from the index to the end, then from the start to the index
        for (int i = index; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
        }
        for (int i = 0; i < index; i++) {
            System.out.print(sequence[i] + " ");
        }

        scanner.close();
    }
}
