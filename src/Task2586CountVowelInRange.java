import java.util.Scanner;

/*
You are given a 0-indexed array of string words and two integers left and right.

A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.

Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].



Example 1:

Input: words = ["are","amy","u"], left = 0, right = 2
Output: 2
Explanation:
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.
Example 2:

Input: words = ["hey","aeo","mu","ooo","artro"], left = 1, right = 4
Output: 3
Explanation:
- "aeo" is a vowel string because it starts with 'a' and ends with 'o'.
- "mu" is not a vowel string because it does not start with a vowel.
- "ooo" is a vowel string because it starts with 'o' and ends with 'o'.
- "artro" is a vowel string because it starts with 'a' and ends with 'o'.
The number of vowel strings in the mentioned range is 3.

 */
public class Task2586CountVowelInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(",");
        int vowelWords = 0;
        int left = Integer.parseInt(scanner.nextLine());
        int right = Integer.parseInt(scanner.nextLine());
        int index = 0;

        for (int count = left; count <= right; count++) {
            String currWord = words[count];
            int length = currWord.length();

            if ((currWord.charAt(index) == 'a' ||
                    currWord.charAt(index) == 'e' ||
                    currWord.charAt(index) == 'i' ||
                    currWord.charAt(index) == 'o' ||
                    currWord.charAt(index) == 'u' ) &&
                    (currWord.charAt(length - 1) == 'a' ||
                    currWord.charAt(length - 1) == 'e' ||
                    currWord.charAt(length - 1) == 'i' ||
                    currWord.charAt(length - 1) == 'o' ||
                    currWord.charAt(length - 1) == 'u')) {

                vowelWords++;
            }
        }

        System.out.println(vowelWords);

    }
}
