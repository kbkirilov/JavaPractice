/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task66PlusOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] digits = {4, 3, 2, 1};
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < digits.length; i++) {
            sb.append(digits[i]);
        }

        String digitsToString = sb.toString();
        String[] largeIntResult = String.valueOf(Integer.parseInt(digitsToString) + 1).split("");

        if (digits.length > 1 || (digits.length == 1 && digits[0] != 9)) {
            for (int i = 0; i < digitsToString.length(); i++) {
                digits[i] = Integer.parseInt(largeIntResult[i]);
            }
        } else if (digits.length == 1 && digits[0] == 9) {
            int[] digitsNew = {1, 0};
            System.out.println(Arrays.toString(digitsNew));
            return;
        }

        System.out.println(Arrays.toString(digits));


    }
}
