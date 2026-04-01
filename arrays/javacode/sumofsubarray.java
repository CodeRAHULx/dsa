import java.util.*;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};

        Set<Integer> set = new HashSet<>();

        int n = nums.length;


        for (int i = 0; i < (1 << n); i++) {
            int sum = 0;

            for (int j = 0; j < n; j++) {

                if ((i & (1 << j)) != 0) {
                    sum += nums[j];
                }
            }

            set.add(sum);
        }


        List<Integer> result = new ArrayList<>(set);

        System.out.println(result);
    }
}