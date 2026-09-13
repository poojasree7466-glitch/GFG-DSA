class Solution {
    public ArrayList<Integer> sentenceWord(String s) {
        ArrayList<Integer> ans = new ArrayList<>();

        int sentences = 0;
        int words = 0;

        boolean inWord = false;
        boolean hasWord = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                if (!inWord) {
                    words++;
                }

                inWord = true;
                hasWord = true;
            } else {
                inWord = false;
            }

            if (ch == '.' || ch == '!' || ch == '?') {
                if (hasWord) {
                    sentences++;
                    hasWord = false;
                }
            }
        }

        if (hasWord) {
            sentences++;
        }

        ans.add(sentences);
        ans.add(words);

        return ans;
    }
}