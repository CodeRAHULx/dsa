// Q: Count pairs with a given sum
// Given an array and a value k, count the number of pairs with sum equal to k.
import java.util.HashMap;
public class CountPairsWithSum {
    // Explanation: Uses HashMap for O(n) time.
    public static int countPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            count += map.getOrDefault(k - num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int k = 6;
        System.out.println(countPairs(arr, k)); // Output: 3
    }
}
