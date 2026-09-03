class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            hm.put(ch1,hm.getOrDefault(ch1,0)+1);
        }
         for(int i=0;i<t.length();i++)
        {
            char ch2=t.charAt(i);
            hm.put(ch2,hm.getOrDefault(ch2,0)-1);
        }
        for(int val:hm.values())
        {
            if(val!=0)
            {
                return false;
            }
        }
        return true;
    }
}