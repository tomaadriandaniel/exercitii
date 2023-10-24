
/*
Write a Java program to find the Fibonacci series up to a given number.
 */

package exercitii;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter index: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] Fibonacci = new int[n];
        if (n<1){
            System.out.println("Enter values bigger than 0");
        }

        if(n==1){
            Fibonacci[0] = 0;
            System.out.println("Fibonacci series up to " + n + " is: " + Arrays.toString(Fibonacci));
        }
        if(n==2){
            Fibonacci[0] = 0;
            Fibonacci[1] = 1;
            System.out.println("Fibonacci series up to " + n + " is: " + Arrays.toString(Fibonacci));
        }
        if(n>2) {
            Fibonacci[0] = 0;
            Fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
                Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2];
            }
            System.out.println("Fibonacci series up to " + n + " is: " + Arrays.toString(Fibonacci));
        }
    }
}
