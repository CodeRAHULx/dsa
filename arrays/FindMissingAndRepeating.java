// Q: Find the missing and repeating number in an array
// Given an array of size n containing numbers from 1 to n, one number is missing and one is repeating. Find both.
public class FindMissingAndRepeating {
    // Explanation: Uses mathematical formulas for sum and sum of squares.
    public static int[] findNumbers(int[] arr) {
        int n = arr.length;
        int sum = 0, sumSq = 0;
        for (int num : arr) {
            sum += num;
            sumSq += num * num;
        }
        int expectedSum = n * (n + 1) / 2;
        int expectedSumSq = n * (n + 1) * (2 * n + 1) / 6;
        int diff = sum - expectedSum; // repeating - missing
        int sqDiff = sumSq - expectedSumSq; // repeating^2 - missing^2
        int sumRM = sqDiff / diff; // repeating + missing
        int repeating = (diff + sumRM) / 2;
        int missing = repeating - diff;
        return new int[]{missing, repeating};
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        int[] res = findNumbers(arr);
        System.out.println("Missing: " + res[0] + ", Repeating: " + res[1]); // Output: Missing: 5, Repeating: 1
    }
}
