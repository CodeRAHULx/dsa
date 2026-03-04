// Q4: Find the majority element in an array
// Given an array, find the element that appears more than n/2 times.
public class MajorityElement {
    public static int findMajority(int[] arr) {
        int count = 0, candidate = -1;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        for (int num : arr) {
            if (num == candidate) count++;
        }
        return count > arr.length / 2 ? candidate : -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 2, 2, 2};
        System.out.println(findMajority(arr)); // Output: 2
    }
}
