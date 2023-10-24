
/*
Write a Java program to check if a string is a palindrome or not.
 */

package exercitii;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {
        Scanner ScannerInput = new Scanner(System.in);
        System.out.println("Enter string: ");
        String StringInput = ScannerInput.nextLine();
        String reversed = "";
        for (int i = StringInput.length() -1 ; i>=0; i--) {
            reversed = reversed + StringInput.charAt(i);
        }
        if (StringInput.equals(reversed)){
            System.out.println("This string is palindrome");
                    }
        else{
            System.out.println("This string is NOT palindrome");
        }

    }
}
