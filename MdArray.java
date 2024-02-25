import java.util.Scanner;
public class MdArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] arr = new int[size];

        // Get elements from the user and store them in the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Display the elements of the array
        System.out.println("Elements of the array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
