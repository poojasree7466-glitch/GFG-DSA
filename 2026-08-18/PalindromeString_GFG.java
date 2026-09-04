class Solution {
    boolean isPalindrome(String s) {
        // code here
        char ch[]=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right)
        {
            char c=ch[left];
            ch[left]=ch[right];
            ch[right]=c;
            left++;
            right--;
        }
        if(String.valueOf(ch).equals(s))
        {
            return true;
        }
        else
        {
        return false;
        }
    }
    }