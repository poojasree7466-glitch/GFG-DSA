class Solution {
    public String reducedString(String s) {
        StringBuilder stack = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            stack.append(ch);

            int n = stack.length();

            if (n >= 3 &&
                stack.charAt(n - 1) == stack.charAt(n - 2) &&
                stack.charAt(n - 2) == stack.charAt(n - 3)) {

                stack.delete(n - 3, n);
            }
        }

        if (stack.length() == 0) {
            return "-1";
        }

        return stack.toString();
    }
}