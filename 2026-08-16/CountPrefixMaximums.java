class Solution {
    public int countElements(int[] arr) {

        int count = 1;              
        int temp1 = arr[0];         

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > temp1) {
                count++;
                temp1 = arr[i];
            }
        }

        return count;
    }
}