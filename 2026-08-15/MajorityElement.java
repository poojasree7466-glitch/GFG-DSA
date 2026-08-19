class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
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
        for(int i=0;i<arr.length;i++)
        {
        if(hm.get(arr[i])>arr.length/2)
        {
       return arr[i];
        }
        }
return -1;
    }
}