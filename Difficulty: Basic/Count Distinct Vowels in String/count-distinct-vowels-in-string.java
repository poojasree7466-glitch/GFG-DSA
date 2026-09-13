class Solution {
    public int countVowels(String s) {
        boolean[] seen = new boolean[5];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int index = -1;

            if (ch == 'a') index = 0;
            else if (ch == 'e') index = 1;
            else if (ch == 'i') index = 2;
            else if (ch == 'o') index = 3;
            else if (ch == 'u') index = 4;

            if (index != -1 && !seen[index]) {
                seen[index] = true;
                count++;
            }
        }

        return count;
    }
}