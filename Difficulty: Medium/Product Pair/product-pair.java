class Solution {
    public boolean isProduct(int[] arr, long target) {
        HashSet<Long> hs = new HashSet<>();

        for(int x : arr) {

            if(target == 0) {
                if(hs.contains(0L)) {
                    return true;
                }
            }
            else {
                if(x != 0 && target % x == 0) {
                    long need = target / x;

                    if(hs.contains(need)) {
                        return true;
                    }
                }
            }

            hs.add((long)x);
        }

        return false;
    }
}