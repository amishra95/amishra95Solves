class Solution {
    public boolean buddyStrings(String s, String goal) {
    
                if (s.length() != goal.length()) return false;

    char[] arr = s.toCharArray();
        
    for(int i = 0; i < s.length(); i++){
        for(int j = 0; j < goal.length(); j++){
            if(i != j){
                swap(arr, i, j);
                  if (new String(arr).equals(goal)){
                    return true;
                }
                 swap(arr, i, j);

            }
        }
    }
        return false;
        
    }
    
public static void swap(char[] arr, int i, int j) {
    char temp = arr[i]; 
    arr[i] = arr[j];    
    arr[j] = temp;      
}

}
