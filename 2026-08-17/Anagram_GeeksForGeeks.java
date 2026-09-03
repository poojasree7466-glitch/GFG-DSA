class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        HashMap<Character,Integer>hm=new HashMap<>();
            for(int i=0;i<s1.length();i++)
            {
                char ch1=s1.charAt(i);
                hm.put(ch1,hm.getOrDefault(ch1,0)+1);
            }
             for(int i=0;i<s2.length();i++)
            {
                char ch2=s2.charAt(i);
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
