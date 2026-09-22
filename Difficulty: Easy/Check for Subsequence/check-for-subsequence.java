class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        int l=0;
        int r=0;
        while(l<ch1.length&&r<ch2.length)
        {
            if(ch1[l]==ch2[r])
            {
                l++;
                r++;
            }
            else
            {
                r++;
            }
        }
        if(l==ch1.length)
        {
            return true;
        }
        return false;
    }
}