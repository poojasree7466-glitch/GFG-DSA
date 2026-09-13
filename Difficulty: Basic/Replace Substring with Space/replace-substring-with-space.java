class Solution {
    public String extractMessage(String s) {
        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {
            if (i + 2 < s.length() && s.substring(i, i + 3).equals("LIE")) {
                if (ans.length() > 0 && ans.charAt(ans.length() - 1) != ' ') {
                    ans.append(' ');
                }
                i += 3;
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }

        return ans.toString().trim();
    }
}