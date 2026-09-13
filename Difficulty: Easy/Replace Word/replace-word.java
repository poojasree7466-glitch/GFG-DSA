class Solution {
    public String replaceAll(String s, String s1, String s2) {
        int n = s.length();
        int m = s1.length();

        int[] lps = new int[m];

        for (int i = 1, len = 0; i < m;) {
            if (s1.charAt(i) == s1.charAt(len)) {
                lps[i++] = ++len;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i++] = 0;
            }
        }

        StringBuilder ans = new StringBuilder();

        int i = 0;
        int j = 0;
        int last = 0;

        while (i < n) {
            if (s.charAt(i) == s1.charAt(j)) {
                i++;
                j++;

                if (j == m) {
                    ans.append(s, last, i - m);
                    ans.append(s2);

                    last = i;
                    j = 0;
                }
            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }

        ans.append(s, last, n);

        return ans.toString();
    }
}