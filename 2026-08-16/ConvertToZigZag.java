class Solution {
    public static void zigZag(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            if (i % 2 == 0) {
                // We need arr[i] < arr[i+1]
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } 
            else {
                // We need arr[i] > arr[i+1]
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}