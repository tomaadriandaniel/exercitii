/*
Write a Java program to calculate the area and circumference of a circle given its radius.
 */

package exercitii;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter circle radius in mm: ");
        int r = input.nextInt();
        System.out.println("Circle area is: " + Math.PI*Math.pow(r, 2) + "mm2");
        System.out.println("Circle length: " + 2*Math.PI*r + "mm");

    }
}
