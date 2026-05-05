//Faster search
class Solution {
    public int fixedPoint(int[] arr) {
       int low = 0;
       int high = arr.length-1;
       int count = -1;

        while(low <= high){
            int mid = low+ (high-low)/2;
            if(arr[mid] == mid){
                count = mid;
                high = mid-1;
            }  
            else if(arr[mid] < mid){
                low = mid+1;
            }  
            else{
                high = mid-1;
            }
        }
       return count;
    }
}

// Brute force
class Solution {
    public int fixedPoint(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == i){
                return i;
            }
        }
        return -1;
    }
}
