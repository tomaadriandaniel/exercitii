package exercitii;

import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = input.nextLine();

        for(int i=0; i<str.length(); i++){
                int count = 0;
                boolean repeat = false;
                for (int k = 0; k<i; k++){
                    if (str.charAt(k) == str.charAt(i)){
                        repeat = true;
                        break;
                    }
                }

                if (!repeat){

                    for (int j = 0; j < str.length(); j++) {
                        if (str.charAt(i) == str.charAt(j)) {
                            count++;
                        }
                    }

                    System.out.println(str.charAt(i) + ": " + count);
                }
            }
    }
}

