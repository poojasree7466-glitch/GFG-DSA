class Solution {
    public char decodeIt(String s, long k) {
        long len = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                len++;
            } else {
                len *= (ch - '0');
            }
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                len /= (ch - '0');
                k = (k - 1) % len + 1;
            } else {
                if (k == len) {
                    return ch;
                }
                len--;
            }
        }

        return ' ';
    }
}