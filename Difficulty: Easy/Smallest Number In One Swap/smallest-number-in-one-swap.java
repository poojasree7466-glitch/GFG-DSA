class Solution {
    public String smallestNumber(String s) {
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length - 1; i++) {
            int pos = -1;

            for (int j = i + 1; j < a.length; j++) {
                if (i == 0 && a[j] == '0') {
                    continue;
                }

                if (pos == -1 || a[j] < a[pos] || 
                    (a[j] == a[pos] && j > pos)) {
                    pos = j;
                }
            }

            if (pos != -1 && a[pos] < a[i]) {
                char temp = a[i];
                a[i] = a[pos];
                a[pos] = temp;
                break;
            }
        }

        return new String(a);
    }
}