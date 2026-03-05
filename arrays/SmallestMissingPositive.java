// Q3: Find the smallest missing positive number
// Given an array, find the smallest positive integer missing from the array.
// Q4: Find the first repeating element in an array
// Q5: Find the equilibrium index of an array
// Q6: Find the maximum element in an array
// Q7: Find the majority element in an array (element that appears more than n/2 times)
// Q8: Find the smallest missing positive number using O(1) space (challenge)
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
