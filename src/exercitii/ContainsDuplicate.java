/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

package exercitii;
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        boolean t = false;
        for (int i = 0; i < nums.length - 1; i++ ){
            for (int j = i+1; j < nums.length; j++){
                if (nums[i] == nums[j]) t = true;
            }
            }
        if (t = false)
            System.out.println("Vectorul nu contine valori duplicate");
        if (t = true)
            System.out.println("Vectorul contine valori duplicate");
        }
    }

