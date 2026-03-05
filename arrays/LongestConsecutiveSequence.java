// Q: Find the length of the longest consecutive sequence in an array
// Given an unsorted array, find the length of the longest consecutive elements sequence.
import java.util.HashSet;
public class LongestConsecutiveSequence {
    // Explanation: Uses HashSet for O(n) time.
    public static int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        int maxLen = 0;
        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int curr = num;
                int len = 1;
                while (set.contains(curr + 1)) {
                    curr++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); // Output: 4
    }
}
