/*
Write a Java program to reverse a string without using any built-in functions.
 */


package exercitii;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String StringInput = input.nextLine();
        StringBuilder StringOutput = new StringBuilder();
        String reversed = "";
        for (int i = StringInput.length() -1 ; i>=0; i--){
            StringOutput.append(StringInput.charAt(i));
            reversed = reversed + StringInput.charAt(i);
        }
        System.out.println("Reversed string is: " + reversed);
    }

}
