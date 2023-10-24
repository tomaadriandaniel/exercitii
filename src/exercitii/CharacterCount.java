package exercitii;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                // Character already exists in the map, increment its count
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Character does not exist in the map, add it with count 1
                charCountMap.put(c, 1);
            }
        }

        System.out.println("Character count:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

