class Solution {
    public String reverseStr(String s, int k) {
        
        char ch[] = s.toCharArray();

        for(int start = 0; start < ch.length; start = start + 2 * k)
        {
            int left = start;
            int right = Math.min(start + k - 1, ch.length - 1);

            while(left < right)
            {
                char c = ch[left];
                ch[left] = ch[right];
                ch[right] = c;

                left++;
                right--;
            }
        }

        return String.valueOf(ch);
    }
}