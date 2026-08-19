class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        int n=arr.length;
        TreeMap<Integer,Integer>hm=new TreeMap<>();
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
        if(hm.containsKey(arr[i]))
        {
        hm.put(arr[i],hm.get(arr[i])+1);
        }
        else
        {
        hm.put(arr[i],1);
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