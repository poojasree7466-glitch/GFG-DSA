class Solution {
    static boolean check_duck(String num) {
        int i = 0;

        while (i < num.length() && num.charAt(i) == '0') {
            i++;
        }

        for (; i < num.length(); i++) {
            if (num.charAt(i) == '0') {
                return true;
            }
        }

        return false;
    }
}