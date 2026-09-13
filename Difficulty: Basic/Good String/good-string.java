class Solution {
    public boolean isGoodString(String s) {
        for (int i = 1; i < s.length(); i++) {
            int diff = Math.abs(s.charAt(i) - s.charAt(i - 1));

            if (diff != 1 && diff != 25) {
                return false;
            }
        }

        return true;
    }
}