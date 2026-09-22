class Solution {

    // function to count all pairs
    // from both the sorted arrays
    // whose sum is equal to a given
    // value
    static int countPairs(int a[], int b[], int x) {
        // code here.
        int l=0;
        int r=b.length-1;
        int count=0;
        while(l<a.length&&r>=0)
        {
            if(a[l]+b[r]==x)
            {
                count++;
                l++;
                r--;
            }
            else if(a[l]+b[r]<x)
            {
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