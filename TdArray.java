import java.util.Arrays;
import java.util.Scanner;

public class TdArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//create 2d array with dimension 5*5
        int[][] arr = new int[3][3];
        // prompt userto enter elements
        System.out.print("Enter elements for the 2D array:");

        // Input loop: iterate over each row and clmn to input elements
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                //read an integer input from the user and store it in the current position
                arr[row][col] = scanner.nextInt();
            }
        }

        // Output loop: Iterate over each row and clmn to print elements
        //System.out.println("3D Array:");
        //for (int row = 0; row < arr.length; row++) {
            //for (int col = 0; col < arr[row].length; col++) {
                //print the element at current position of array
               // System.out.print(arr[row][col] + " ");
           // }
           // System.out.println(); // Move to the next line after printing each row
       // }
    for(int row =0; row < arr.length; row++){
        System.out.println(Arrays.toString(arr[row]));
}
        scanner.close();
    }
}

