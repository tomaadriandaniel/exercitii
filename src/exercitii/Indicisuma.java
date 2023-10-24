package exercitii;

/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]

 */

public class Indicisuma {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int target = 12;
        boolean t = false;
        for ( int i = 0; i < nums.length - 1; i++){
            for (int j = i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target){
                    System.out.println("indicele 1 este: " + i + "\nindicele 2 este: " + j);
                    t = true;
                }
            }
        }
        if (!t) System.out.println ("Nicio pereche de numere nu insumeaza " + target);
    }
}
