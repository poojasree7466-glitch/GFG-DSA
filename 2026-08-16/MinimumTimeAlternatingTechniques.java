class Solution {
    public int minTime(int[] a, int[] b) {

        int time1 = 0;  // A tho start
        int time2 = 0;  // B tho start

        for (int i = 0; i < a.length; i++) {

            if (i % 2 == 0) {
                time1 += a[i];
                time2 += b[i];
            } else {
                time1 += b[i];
                time2 += a[i];
            }
        }

        return Math.min(time1, time2);
    }
}