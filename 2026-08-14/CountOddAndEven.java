class Solution {
    public int[] countOddEven(int[] arr) {
        // Code here
        int count1=0;
         int count2=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
        if((arr[i]&1)==0)
        {
            count1++;
        }
        else
        {
            count2++;
        }
        }
        int a[]=new int[2];
        a[0]=count2;
        a[1]=count1;
         return a;
    }
   
}