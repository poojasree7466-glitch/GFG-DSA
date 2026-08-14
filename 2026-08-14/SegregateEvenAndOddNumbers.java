class Solution {
      static void  segregateEvenOdd(int arr[]) {
        // code here
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]&1)==0)
            {
                a1.add(arr[i]);
            }
            else
            {
                a2.add(arr[i]);
            }
        }
        Collections.sort(a1);
         Collections.sort(a2);
         for(int i=0;i<a1.size();i++)
         {
             arr[index]=a1.get(i);
             index++;
         }
         for(int i=0;i<a2.size();i++)
         {
             arr[index]=a2.get(i);
             index++;
         }
        //  for(int i=0;i<arr.length;i++)
        //  {
        //      System.out.print(arr[i]+" ");
        //  }
      }
        
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            segregateEvenOdd(arr);
        }
}