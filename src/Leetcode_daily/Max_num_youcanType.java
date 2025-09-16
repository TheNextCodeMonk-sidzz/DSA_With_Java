package Leetcode_daily;
//https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/
public class Max_num_youcanType {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count = 1; int m = text.length(); int num = 0; int right = 0; int left = 0;
        for (int i = 0; i < m; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                count++; right = i;
                for (int j = left; j < right; j++) {
                    char c = text.charAt(left);
                    if (brokenLetters.indexOf(c) != -1) {
                        count--;
                        break;
                    }left++;
                }left = right + 1;
            } else if (i == m - 1) {
                for (int j = left; j < m; j++) {
                    char c = text.charAt(j);
                    if (brokenLetters.indexOf(c) != -1) {
                        count--;
                        break;
                    }left++;
                }left = right + 1;
            }
        }
        return count;
    }
}
