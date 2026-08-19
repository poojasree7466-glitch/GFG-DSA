class Solution {
    public int countOccurence(int[] arr, int k) {
        // code here
        int n=arr.length;
        int count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
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
        if(hm.get(x)>n/k)
        {
        count++;
        }
        }
return count;
    }
}