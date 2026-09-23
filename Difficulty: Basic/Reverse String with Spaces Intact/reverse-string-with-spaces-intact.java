class Solution {
    String reverses(String s) {
        // your code here
        char ch[]=s.toCharArray();
        int l=0;
        int r=ch.length-1;
        while(l<r)
        {
            if(ch[l]==' ')
            {
                l++;
            }
            else if(ch[r]==' ')
            {
                r--;
            }
            else
            {
            char c=ch[l];
            ch[l]=ch[r];
            ch[r]=c;
            l++;
            r--;
            }
        }
        return String.valueOf(ch);
    }
}