public class Task3LongestStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s = "abcabcbbfret";
        StringBuilder sb = new StringBuilder();
        int maxLength = 0;
        String maxWord = "";

        for (int i = 1; i <= s.length() - 1; i++) {
            char currChar = s.charAt(i);

            if (currChar != s.charAt(i - 1) && sb.length() == 0) {
                sb.append(s.charAt(i - 1));
                sb.append(s.charAt(i));
            } else if (currChar != s.charAt(i - 1) && sb.indexOf(String.valueOf(currChar)) == -1) {
                sb.append(s.charAt(i));
            } else {
                sb.setLength(0);
                sb.append(s.charAt(i));
            }

            if (sb.length() > maxLength) {
                maxLength = sb.length();
                maxWord = sb.toString();
            }
        }

        System.out.println(maxWord);
        System.out.println(maxLength);

    }
}
