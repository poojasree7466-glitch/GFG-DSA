class Solution {
    int countPairs(int arr[], int target) {
        //  Code Here
        int count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int s=target-arr[i];
            if(hm.containsKey(s))
            {
                count=count+hm.get(s);
            }
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        return count;
    }
    
   
}
