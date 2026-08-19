class Solution {
    static boolean primality(int value)
    {
        
        if(value<=1)
        {
            return false;
        }
        if(value==2)
        {
            return true;
        }
        if((value&1)==0)
        {
            return false;
        }
        for(int i=3;i<value;i++)
        {
            if(value%i==0)
            {
            return false;
            }
        }
        return true;
    }
    public List<Integer> allMersennePrimeNo(int n) {
        // code here
        ArrayList<Integer>al=new ArrayList<>();
        for(int k=2;Math.pow(2, k)-1<=n;k++)
        {
           if(primality((int)Math.pow(2, k)-1))
           {
            al.add((int)Math.pow(2, k)-1);
           }
        }
        return al;
    }
};