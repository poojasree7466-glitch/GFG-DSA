public static String reverseWords(String s) {
    
    String s1[] = s.trim().split("\\s+");

    int left = 0;
    int right = s1.length - 1;

    while(left < right) {
        String temp = s1[left];
        s1[left] = s1[right];
        s1[right] = temp;

        left++;
        right--;
    }

    return String.join(" ", s1);
}