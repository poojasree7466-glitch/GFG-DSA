class Solution {
    public static boolean isPerfect(int[] arr) {
        int phase = 0;

        // 0 = increasing
        // 1 = constant
        // 2 = decreasing

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {
                // Increasing
                if (phase > 0) {
                    return false;
                }
            }
            else if (arr[i] == arr[i + 1]) {
                // Constant
                if (phase == 2) {
                    return false;
                }
                phase = 1;
            }
            else {
                // Decreasing
                phase = 2;
            }
        }

        return true;
    }
}