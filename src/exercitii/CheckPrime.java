package exercitii;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value: ");
        int x = input.nextInt();
        for (int i = (int) Math.sqrt(x); i > 1; i--) {
            if (x % i == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) System.out.println("Number: " + x + " is prime");
        else System.out.println("Number: " + x + " is NOT prime");
        System.out.println(Math.sqrt(x));
    }
}

