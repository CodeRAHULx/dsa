// Q1: Find the longest subarray with sum K
// Given an array and an integer K, find the length of the longest subarray whose sum is K.
public class LongestSubarraySumK {
    public static int longestSubarray(int[] arr, int k) {
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();
        int sum = 0, maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) maxLen = i + 1;
            if (map.containsKey(sum - k)) {
                maxLen = Math.max(maxLen, i - map.get(sum - k));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarray(arr, k)); // Output: 4
    }
}
