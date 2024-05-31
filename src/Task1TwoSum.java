/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109

 */

import java.util.Scanner;

public class Task1TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        String[] arrNumAsString = scanner.nextLine().split(",");
        int firstNum = 0;
        int secondNum = 0;

        int[] arrNum = new int[arrNumAsString.length];
        for (int i = 0; i < arrNum.length; i++) {
            arrNum[i] = Integer.parseInt(arrNumAsString[i]);
        }

        for (int i = 0; i < arrNum.length - 1; i++) {
            int currNumber = arrNum[i];
            int numToFind = target - arrNum[i];

            if (arrNum[i + 1] == numToFind) {
                firstNum = i;
                secondNum = i + 1;
            }
        }

        System.out.printf("%d, %d", firstNum, secondNum);

    }
}
