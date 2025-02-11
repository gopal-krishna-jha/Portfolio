public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12, 0, 5, 0 };

        // Approach: Iterate through the array, and move non-zero elements to the front
        int j = 1; // Pointer for the next position to place a non-zero element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
              
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

              
                j++;
            }
        }

       
        System.out.print("Array after moving zeros to the end: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
