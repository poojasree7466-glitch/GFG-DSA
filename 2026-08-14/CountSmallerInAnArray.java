
class Solution {
    public int countOfElements(int x, List<Integer> arr) {
        // code here
        int count=0;
        for(Integer y:arr)
        {
            if(y<=x)
            {
                count++;
            }
        }
        return count;
    }
}