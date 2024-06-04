/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.

 */

public class Task58LengthOfLastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy ";
        int result = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currChar = s.charAt(i);

            if (currChar == ' ' && result == 0) {
                continue;
            } else if (currChar != ' ') {
                result++;
            } else {
                break;
            }

        }

        System.out.println(result);

    }
}
