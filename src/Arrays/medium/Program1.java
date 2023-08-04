package Arrays.medium;

/*
3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest
substring
 without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.

 */
public class Program1 {

    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        if (s.length() == 1) {
            return 1;
        } else if (s.length() == 0) {
            return 0;
        }

        int max = 0;
        boolean f = false;

        for (int i = 0; i < s.length(); i++) {

            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));

            for (int j = i + 1; j < s.length(); j++) {

                if (!sb.toString().contains(String.valueOf(s.charAt(j)))) {

                    sb.append(s.charAt(j));

                    if (j + 1 == s.length()) {
                        if (sb.length() > max) {
                            max = sb.length();
                        }
                        f = true;
                    }

                } else {
                    if (sb.length() > max) {
                        max = sb.length();
                    }
                    break;
                }
            }
            if (f) {
                break;
            }
        }
        return max;
    }
}
