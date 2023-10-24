package exercitii;

import java.util.Scanner;

public class SumOfTwoReadNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Prima valoare este: ");
        int a = scanner.nextInt();
        System.out.println("A doua valoare este: ");
        int b = scanner.nextInt();
        scanner.close();
        int sum = a+b;
        System.out.println("Suma de " + a + " si " + b + " este: " + sum);
    }
}

