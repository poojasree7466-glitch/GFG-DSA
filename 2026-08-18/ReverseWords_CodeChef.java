public static String reverseWords(String s) {
    // write your code here 
    String s1[]=s.split(" ");
        int left=0;
        int right=s1.length-1;
        while(left<right)
        {
            String c=s1[left];
            s1[left]=s1[right];
            s1[right]=c;
            left++;
            right--;
        }
        return String.join(" ",s1);
}
