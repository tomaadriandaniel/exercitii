/*
Write a Java program to find the largest element in an array of integers

 */


package exercitii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements for array: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. The number of elements must be greater than zero.");
            return; // Exit the program
        }


        int array[] = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i<n; i++){
            array[i]= input.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(array));

        int max = array[0];

        for (int i = 1; i<n; i++){
            if(array[i]>max)
                max=array[i];
        }
        System.out.println("Largest element of the array is: " + max);
    }
}
