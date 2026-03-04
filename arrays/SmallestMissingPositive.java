// Q3: Find the smallest missing positive number
// Given an array, find the smallest positive integer missing from the array.
public class SmallestMissingPositive {
    public static int findMissing(int[] arr) {
        int n = arr.length;
        boolean[] present = new boolean[n + 1];
        for (int num : arr) {
            if (num > 0 && num <= n) {
                present[num] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!present[i]) return i;
        }
        return n + 1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(findMissing(arr)); // Output: 2
    }
}
