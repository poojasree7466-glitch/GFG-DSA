class Solution {
    public static ArrayList<ArrayList<Integer>> triplets(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();

                Arrays.sort(arr);

                for(int i = 0; i < arr.length - 2; i++) {

                    if(i > 0 && arr[i] == arr[i-1]) {
                        continue;
                    }

                    int l = i + 1;
                    int r = arr.length - 1;

                    while(l < r) {

                        int s = arr[i] + arr[l] + arr[r];

                        if(s == 0) {

                            ArrayList<Integer> res = new ArrayList<>();

                            res.add(arr[i]);
                            res.add(arr[l]);
                            res.add(arr[r]);

                            al.add(res);

                            l++;
                            r--;

                            while(l < r && arr[l] == arr[l-1]) {
                                l++;
                            }

                            while(l < r && arr[r] == arr[r+1]) {
                                r--;
                            }
                        }
                        else if(s < 0) {
                            l++;
                        }
                        else {
                            r--;
                        }
                    }
                }

                return al;
    }
}
