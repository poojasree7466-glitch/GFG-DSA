class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer>al=new ArrayList<>();
         int n=nums.length;
        int count=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++)
        {
        if(hm.containsKey(nums[i]))
        {
        hm.put(nums[i],hm.get(nums[i])+1);
        }
        else
        {
        hm.put(nums[i],1);
        }
        
        }
        for(Integer x:hm.keySet())
        {
        if(hm.get(x)>n/3)
        {
        al.add(x);
        }
        }
return al;
    }
}