/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
        // code here
        ArrayList<pair>al=new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int res=0;
        int l=0;
        int r=arr2.length-1;
      while(l<arr1.length&&r>=0)
      {
          
          if(arr1[l]+arr2[r]<target)
          {
              l++;
          }
          else if(arr1[l]+arr2[r]>target)
          {
              r--;
          }
          else
          {
              int c1=0,c2=0;
              int x1=arr1[l];
              int x2=arr2[r];
              while(l<arr1.length&&(arr1[l]==x1))
              {
                  c1++;
                  l++;
              }
              while(r>=0&&(arr2[r]==x2))
              {
                  c2++;
                  r--;
              }
              for(int i=0;i<c1;i++)
              {
                  for(int j=0;j<c2;j++)
                  {
                      al.add(new pair(x1,x2));
                  }
              }
       }
    }
    al.sort((a,b)->Long.compare(a.first,b.first));
      return al.toArray(new pair[0]);
}
}