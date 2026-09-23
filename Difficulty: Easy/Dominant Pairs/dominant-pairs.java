class Solution {
    public int dominantPairs(int[] arr) {
        // Code here
        int n=arr.length;
        Arrays.sort(arr,0,n/2);
        Arrays.sort(arr,n/2,n);
        int l=0;
        int r=n/2;
        int count=0;
        while(l<n/2&&r<n)
        {
            if((long)arr[l]>=5L*arr[r])
            {
                count=count+n/2-l;
                r++;
            }
            else
            {
                l++;
            }
        }
        return count;
    }
}