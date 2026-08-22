

class Solution {
    public int[] countArray(int[] arr, int x) {

        int[] result = new int[arr.length];

        HashMap<Integer, Integer> map = new HashMap<>();

        // Frequency count
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Calculate avg and get its frequency
        for (int i = 0; i < arr.length; i++) {

            int avg = (arr[i] + x) / 2;

            result[i] = map.getOrDefault(avg, 0);
        }

        return result;
    }
}