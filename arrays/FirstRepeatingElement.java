// Q2: Find the first repeating element in an array
// Given an array, find the first element that repeats.
public class FirstRepeatingElement {
    public static int firstRepeating(int[] arr) {
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int num : arr) {
            if (set.contains(num)) return num;
            set.add(num);
        }
        return -1; // No repeating element
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        System.out.println(firstRepeating(arr)); // Output: 3
    }
}
