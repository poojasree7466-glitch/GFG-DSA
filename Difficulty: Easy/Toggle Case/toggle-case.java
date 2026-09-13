class Solution {
    public String toggleCase(String s) {
        // code here
        char ch[]=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(Character.isLowerCase(ch[i]))
            {
               ch[i]= Character.toUpperCase(ch[i]);
            }
            else
            {
                ch[i]=Character.toLowerCase(ch[i]);
            }
        }
        return String.valueOf(ch);
    }
}
