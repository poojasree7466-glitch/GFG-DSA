class Solution {
    public static boolean checkPangram(String s) {

        boolean[] present = new boolean[26];

        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch - 'A' + 'a');
            }

            if(ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        for(int i = 0; i < 26; i++) {

            if(!present[i]) {
                return false;
            }
        }

        return true;
    }
}
