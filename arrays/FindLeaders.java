// Q: Find leaders in an array
// An element is a leader if it is greater than all elements to its right.
public class FindLeaders {
    // Explanation: Traverse from right, keep track of max.
    public static void printLeaders(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        System.out.print(max + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        printLeaders(arr); // Output: 2 5 17 16
    }
}
