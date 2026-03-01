public class MaxElement {
    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 9, 3};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
    }
}