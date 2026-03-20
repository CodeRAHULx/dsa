package javacode;

public class largestelement{
    public static void main(String[] args) {
        int arr[] = {4, 6, 7, 8, 1, 10};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.print("largest element is :" + max);
    }
}
