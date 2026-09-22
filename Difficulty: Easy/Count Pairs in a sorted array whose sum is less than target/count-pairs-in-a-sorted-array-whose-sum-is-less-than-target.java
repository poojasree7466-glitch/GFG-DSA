class Solution {
    int countPairs(int arr[], int target) {
        // Your code here
        int count=0;
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            if(arr[l]+arr[r]<target)
            {
                count=count+r-l;
                l++;
            }
            else
            {
                r--;
            }
        }
        return count;
    }
}