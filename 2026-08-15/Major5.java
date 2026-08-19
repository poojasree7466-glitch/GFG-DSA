import java.util.*;
public class Solution {
    public static List< Integer > majorityElement(int []v) {
        // Write your code here
        int n=v.length;
        TreeMap<Integer,Integer>hm=new TreeMap<>();
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
        if(hm.containsKey(v[i]))
        {
        hm.put(v[i],hm.get(v[i])+1);
        }
        else
        {
        hm.put(v[i],1);
        }
        }
        for(Integer x:hm.keySet())
        {
        if(hm.get(x)>Math.floor(n/3))
        {
       al.add(x);
        }
        }
return al;
    }
}