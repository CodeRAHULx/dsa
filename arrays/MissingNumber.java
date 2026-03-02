public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {0, 1, 3, 4};   // missing 2
        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        System.out.println("Missing Number: " + (expectedSum - actualSum));
    }
}
