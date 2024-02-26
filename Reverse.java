import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 56, 89};
        Reverse(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void Reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
