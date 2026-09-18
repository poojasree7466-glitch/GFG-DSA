class Solution {
    public boolean hasTripletSum(int arr[], int target) {
        // code Here
        for(int i=0;i<arr.length-2;i++)
        {
         HashSet<Integer>hs=new HashSet<>();
         for(int j=i+1;j<arr.length;j++)
         {
          int s=target-arr[i]-arr[j];
          if(hs.contains(s))
          {
           return true;   
          }
          hs.add(arr[j]);
          }
         }
        return false;
    }
}
