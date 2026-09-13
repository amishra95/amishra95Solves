class Solution {
    public int mirrorDistance(int n) {
     return Math.abs(n - reverse(n));   
    }

    public int reverse(int n){
         int reverse = 0;
         //412
         

         while(n != 0){
            int digit = n%10; 
            reverse = reverse*10 + digit;
            n /= 10;

         }
         return reverse;
    }
}
