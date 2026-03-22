package javacode;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3};

        int i = 0;

        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }

        int newLength = i + 1;

        System.out.println("New Length: " + newLength);

        for(int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}

