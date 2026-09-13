class Solution {
    public boolean checkBinary(String s) {
        int first = s.indexOf('1');
        int last = s.lastIndexOf('1');

        if (first == -1) {
            return true;
        }

        for (int i = first; i <= last; i++) {
            if (s.charAt(i) == '0') {
                return false;
            }
        }

        return true;
    }
}