import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Input for second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Merge arrays and remove duplicates
        int[] mergedArray = mergeSortedArrays(arr1, arr2, n1, n2);

        // Print merged array
        System.out.print("Merged Array without Repetition: ");
        printArray(mergedArray);
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2, int n1, int n2) {
        int[] temp = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        // Merging and removing duplicates
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (k == 0 || temp[k - 1] != arr1[i]) {
                    temp[k++] = arr1[i];
                }
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (k == 0 || temp[k - 1] != arr2[j]) {
                    temp[k++] = arr2[j];
                }
                j++;
            } else {
                if (k == 0 || temp[k - 1] != arr1[i]) {
                    temp[k++] = arr1[i];
                }
                i++;
                j++;
            }
        }

        // Copy remaining elements of arr1[]
        while (i < n1) {
            if (k == 0 || temp[k - 1] != arr1[i]) {
                temp[k++] = arr1[i];
            }
            i++;
        }

        // Copy remaining elements of arr2[]
        while (j < n2) {
            if (k == 0 || temp[k - 1] != arr2[j]) {
                temp[k++] = arr2[j];
            }
            j++;
        }

        // Create result array of correct size
        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }

        return result;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
