package exercitii;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        double number = input.nextDouble();
        double factorial = 1;
        if (number == 0)
            System.out.println(number + " factorial is 1 ");
        else{
            for (int i = 1; i<=number; i++){
                factorial *= i;
            }
            System.out.println (number + " factorial is " + factorial);

        }

    }
}

