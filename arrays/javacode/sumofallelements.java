package javacode;

public class sumofallelements {

    public static void main(String[] args){

        int arr[] = {5,6,7,4,7};
         int sum = 0;
        for(int i=0; i< arr.length; i++ ){

             sum = arr[i] + sum;

        }

          System.out.print("Sum of all elements:" +sum );

    }



}
git