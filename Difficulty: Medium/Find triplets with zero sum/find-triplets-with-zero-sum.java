class Solution {
    public boolean findTriplets(int[] arr) {
        // code here.
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++)
        {
            int l=i+1;
            int r=arr.length-1;
            while(l<r)
            {
                int t=arr[i]+arr[l]+arr[r];
                if(t==0)
                {
                    return true;
                }
                else if(t<0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
        return false;
    }
}