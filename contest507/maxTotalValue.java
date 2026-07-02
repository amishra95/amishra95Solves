class Solution {
    public int maxTotalValue(int[] value, int[] decay, int m) {
    
    int maxVal = 0;
    int n = value.length;

    for(int v:value){
    
    if (v > maxVal) {
        maxVal = v;
         }     

    }

       int low = 0;
       int high = value.length-1;

       int mid = low + (high-low)/2;

    }
}
