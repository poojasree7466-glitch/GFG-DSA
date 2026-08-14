class Solution {
    public ArrayList<Integer> arranged(int[] arr) {
        // code here
        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                pos.add(arr[i]);
            }
            else
            {
                neg.add(arr[i]);
            }
        }
        
        int i = 0;

               while (i < pos.size() && i < neg.size()) {
            al.add(pos.get(i));
            al.add(neg.get(i));
            i++;
        }

              while (i < pos.size()) {
            al.add(pos.get(i));
            i++;
        }

                while (i < neg.size()) {
            al.add(neg.get(i));
            i++;
        }

        return al;
    }
}