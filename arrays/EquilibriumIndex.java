// Q5: Find the equilibrium index of an array
// An equilibrium index is where the sum of elements at lower indexes is equal to the sum at higher indexes.
public class EquilibriumIndex {
    public static int findEquilibrium(int[] arr) {
        int totalSum = 0;
        for (int num : arr) totalSum += num;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) return i;
            leftSum += arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        System.out.println(findEquilibrium(arr)); // Output: 2
    }
}
