class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        int l=0;
        int r=l+1;
        int count=1;
        while(r<arr.length)
        {
            if(arr[r]!=arr[l])
            {
                l++;
                arr[l]=arr[r];
              count++;
            }
            r++;
        }
        for(int i=0;i<count;i++)
        {
            al.add(arr[i]);
        }
        return al;
    }
}
