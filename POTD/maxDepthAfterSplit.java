class Solution {
    public int[] maxDepthAfterSplit(String seq) {
    
    int n = seq.length();
    int[] array = new int[n];
    int depth = 0;

    for(int i = 0; i < seq.length(); i++){
        if(seq.charAt(i) == '('){
            depth++;
            array[i] = depth%2;
        }
        else{
            array[i] = depth%2;
            depth--;
        }
    }    

    return array;

    }
}
