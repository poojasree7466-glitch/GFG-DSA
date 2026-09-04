class Solution {
    public String reverseWords(String s) {
        s=s.trim();
         String s1[] = s.split("\\s+");
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
}