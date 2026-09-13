class Solution {
    public ArrayList<Integer> printPalindromes(int m, int n) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = m; i <= n; i++) {
            int num = i;
            int rev = 0;

            while (num > 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num /= 10;
            }

            if (i == rev) {
                ans.add(i);
            }
        }

        return ans;
    }
}