class Solution {
   int countStrings(int n, int r, int b, int g) {
       if (r + b + g > n) {
           return 0;
       }

       int ans = 0;

       for (int R = r; R <= n; R++) {
           for (int B = b; B <= n - R; B++) {
               int G = n - R - B;

               if (G >= g) {
                   ans += combination(n, R) * combination(n - R, B);
               }
           }
       }

       return ans;
   }

   int combination(int n, int k) {
       if (k > n - k) {
           k = n - k;
       }

       int result = 1;

       for (int i = 1; i <= k; i++) {
           result = result * (n - i + 1) / i;
       }

       return result;
   }
}