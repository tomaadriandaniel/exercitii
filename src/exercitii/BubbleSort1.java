/*
Write a Java program to sort an array of integers in ascending order using the bubble sort algorithm.
 */


package exercitii;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort1 {
    public static void main(String[] args) {
        Scanner index = new Scanner(System.in);
        System.out.println("Enter array number of elements: ");
        int n = index.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. The number of elements must be greater than zero.");
            return; // Exit the program
        }

        int[] array = new int[n];
        System.out.println("Enter array elements: ");
        for (int i=0; i<n; i++){
            array[i]= index.nextInt();
        }

        System.out.println("The array is: " + Arrays.toString(array));
        int x;
        for (int j=0; j<n-1;j++){
            for(int k=j+1; k<n; k++){
                if(array[j]>array[k]){
                    x=array[j];
                    array[j]=array[k];
                    array[k]=x;
                }
            }
        }
        System.out.println("The sorted array is: " + Arrays.toString(array));

    }
}
