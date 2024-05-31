/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 */

import java.util.Scanner;

public class Task13RomanInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = 0;
        String cd = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            int currValue = 0;

            switch (currentChar) {
                case 'I':
                    currValue = 1;
                    //result += currValue;
                    break;
                case 'V':
                    if (i != 0) {
                        if (input.charAt(i - 1) == 'I') {
                            currValue = 4 - 1;
                            break;
                        } else {
                            currValue = 5;
                            break;
                        }
                    } else {
                        currValue = 5;
                        break;
                    }
                case 'X':
                    if (i != 0) {
                        if (input.charAt(i - 1) == 'I') {
                            currValue = 9 - 1;
                            break;
                        } else {
                            currValue = 10;
                            break;
                        }
                    } else {
                        currValue = 10;
                        break;
                    }
                case 'L':
                    if (i != 0) {
                        if (input.charAt(i - 1) == 'X') {
                            currValue = 30;
                            break;
                        } else {
                            currValue = 50;
                            break;
                        }
                    } else {
                        currValue = 50;
                        break;
                    }
                case 'C':
                    if (i != 0) {
                        if (input.charAt(i - 1) == 'X') {
                            currValue = 80;
                            break;
                        } else {
                            currValue = 100;
                            break;
                        }
                    } else {
                        currValue = 100;
                        break;
                    }
                case 'D':
                    if (i != 0) {
                        if (input.charAt(i - 1) == 'C') {
                            currValue = 300;
                            break;
                        } else {
                            currValue = 500;
                            break;
                        }
                    } else {
                        currValue = 500;
                        break;
                    }
                case 'M':
                    if (i != 0) {
                        if (input.charAt(i - 1) == 'C') {
                            currValue = 800;
                            break;
                        } else {
                            currValue = 1000;
                            break;
                        }
                    } else {
                        currValue = 1000;
                        break;
                    }
            }

            result += currValue;
        }
        System.out.println(result);
    }
}
