class Solution {
    public int countTriplets(int[] arr, int target) {
        // Code Here
        int count=0;
        for(int i=0;i<arr.length-2;i++)
               {
                HashMap<Integer,Integer>hs=new HashMap<>();
                for(int j=i+1;j<arr.length;j++)
                {
                 int s=target-arr[i]-arr[j];
                 if(hs.containsKey(s))
                 {
                  count=count+hs.get(s);   
                 }
                 hs.put(arr[j],hs.getOrDefault(arr[j],0)+1);
                 }
                }
               return count;
    }
}