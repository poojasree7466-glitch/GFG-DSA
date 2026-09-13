class Solution {
    public String altCase(String s) {
        char[] arr = s.toCharArray();

        boolean firstLower = Character.isLowerCase(arr[0]);

        for (int i = 0; i < arr.length; i++) {
            if (firstLower) {
                if (i % 2 == 0) {
                    arr[i] = Character.toLowerCase(arr[i]);
                } else {
                    arr[i] = Character.toUpperCase(arr[i]);
                }
            } else {
                if (i % 2 == 0) {
                    arr[i] = Character.toUpperCase(arr[i]);
                } else {
                    arr[i] = Character.toLowerCase(arr[i]);
                }
            }
        }

        return new String(arr);
    }
}