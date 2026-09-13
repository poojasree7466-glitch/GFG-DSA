class Solution {
    public String boomNumber(int k) {
        int len = 1;

        while (k > (1 << len)) {
            k -= (1 << len);
            len++;
        }

        k--;

        char[] ans = new char[len];

        for (int i = len - 1; i >= 0; i--) {
            if ((k & 1) == 0) {
                ans[i] = '2';
            } else {
                ans[i] = '3';
            }

            k >>= 1;
        }

        return new String(ans);
    }
}