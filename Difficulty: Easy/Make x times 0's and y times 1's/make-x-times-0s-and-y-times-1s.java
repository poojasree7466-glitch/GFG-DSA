class Solution {
    public String arrangeString(String s, int x, int y) {
        int zeros = 0;
        int ones = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }
        }

        StringBuilder ans = new StringBuilder();

        while (zeros > 0 && ones > 0) {

            int z = Math.min(x, zeros);
            for (int i = 0; i < z; i++) {
                ans.append('0');
            }
            zeros -= z;

            int o = Math.min(y, ones);
            for (int i = 0; i < o; i++) {
                ans.append('1');
            }
            ones -= o;
        }

        while (zeros > 0) {
            ans.append('0');
            zeros--;
        }

        while (ones > 0) {
            ans.append('1');
            ones--;
        }

        return ans.toString();
    }
}