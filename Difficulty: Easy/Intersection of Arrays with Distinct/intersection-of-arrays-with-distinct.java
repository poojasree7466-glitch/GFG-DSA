class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
       int m=a.length;
       int n=b.length;
        Arrays.sort(a);
        Arrays.sort(b);
        int l=0;
        int r=0;
        int count=0;
        while(l<m&&r<n)
        {
            if(a[l]==b[r])
            {
                count++;
                l++;
                r++;
            }
            else if(a[l]<b[r])
            {
                l++;
            }
            else
            {
                r++;
            }
        }
        return count;
    }
}